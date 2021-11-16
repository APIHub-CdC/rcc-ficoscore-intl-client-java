package com.cdc.apihub.RCC.FicoScore.INTL.api;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cdc.apihub.RCC.FicoScore.INTL.client.ApiClient;
import com.cdc.apihub.RCC.FicoScore.INTL.client.ApiException;
import com.cdc.apihub.RCC.FicoScore.INTL.model.DomicilioPeticion;
import com.cdc.apihub.RCC.FicoScore.INTL.model.PersonaPeticion;
import com.cdc.apihub.RCC.FicoScore.INTL.model.Respuesta;
import com.cdc.apihub.signer.manager.interceptor.SignerInterceptor;

import okhttp3.OkHttpClient;

import org.apache.commons.codec.binary.Hex;
import org.junit.Assert;
import org.junit.Before;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Base64;
import java.util.concurrent.TimeUnit;

public class ReporteDeCreditoConFicoScoreApiTest{
	
	private Logger logger = LoggerFactory.getLogger(ReporteDeCreditoConFicoScoreApiTest.class.getName());
    private final ReporteDeCreditoConFicoScoreApi api = new ReporteDeCreditoConFicoScoreApi();
    
    private String keystoreFile = "/your_path/keystore.jks";
	private String cdcCertFile = "/your_path/cdc_cert.pem";
	private String keystorePassword = "your_password";
	private String keyAlias = "your_alias";
	private String keyPassword = "your_key_password";
    
	
	@Before()
    public void setUp() {
    	
    	ApiClient apiClient = api.getApiClient();
		apiClient.setBasePath("the_url");
		OkHttpClient okHttpClient = new OkHttpClient().newBuilder().readTimeout(30, TimeUnit.SECONDS)
				.addInterceptor(new SignerInterceptor(keystoreFile, cdcCertFile, keystorePassword, keyAlias, keyPassword)).build();
		apiClient.setHttpClient(okHttpClient);
    }
	
	
    @SuppressWarnings("unused")
	@Test
    public void getReporteTest() throws ApiException {
    	
        String xApiKey = "your_api_key";
        String username = "username";
        String password = "password";
        
        String xBanxicoAuth = null;
        String xBanxicoAuthSignature = null;
        
 
        
        if(xBanxicoAuth != null) {
        	xBanxicoAuth = Base64.getEncoder().encodeToString(xBanxicoAuth.getBytes());
            xBanxicoAuthSignature = this.signPayload(xBanxicoAuth);
        }
        
        
        
        PersonaPeticion request = new PersonaPeticion();
        DomicilioPeticion domicilio = new DomicilioPeticion();
        
        request.setFolioOtorgante("XXX");
        request.setPrimerNombre("XXX");
        request.setSegundoNombre("XXX");
        request.setApellidoPaterno("XXX");
        request.setApellidoMaterno("XXX");
        request.setFechaNacimiento("XXX");
        request.RFC("XXX");
        request.setNacionalidad("XXX");
        
        domicilio.setDireccion("XXX");
        domicilio.setColoniaPoblacion("XXX");
        domicilio.setDelegacionMunicipio("XXX");
        domicilio.setCiudad("XXX");
        domicilio.setEstado("XXX");
        domicilio.setCP("XXX");
        
        request.setDomicilio(domicilio);
        
        Respuesta response = api.getReporte(xApiKey, username, password, request, xBanxicoAuth, xBanxicoAuthSignature);
        Assert.assertTrue(response.getFolioConsulta() != null);
        logger.info(response.toString());
    }
    
    
    public String signPayload(String payload) {
		String signature = null;
		try {
			Signature signing = Signature.getInstance("SHA256withECDSA");
			signing.initSign(readPrivateKeyFromKeystore(keystoreFile));
			signing.update(payload.getBytes());
			signature = Hex.encodeHexString(signing.sign(), true);
			logger.debug("Signature: "+ signature);
		} catch (NoSuchAlgorithmException e) {
			logger.error("Signing algorithm invalid.");
		} catch (InvalidKeyException e) {
			logger.error("Invalid Private key.");
		} catch (SignatureException e) {
			logger.error("Error to signing payload.");
		}
		return signature;
	}
    
    
    private PrivateKey readPrivateKeyFromKeystore(String keystoreFile) {
		PrivateKey ecKey = null;
		try {
			logger.debug("keystore_file: " + keystoreFile);
			File file = new File (keystoreFile);
			FileInputStream inputStream = new FileInputStream(file);
			KeyStore keystore = KeyStore.getInstance(KeyStore.getDefaultType());
			keystore.load(inputStream, keystorePassword.toCharArray());
			ecKey = (PrivateKey) keystore.getKey(keyAlias, keyPassword.toCharArray());
		} catch (KeyStoreException e) {
			logger.error("Invalid keystore.");
		} catch (FileNotFoundException e) {
			logger.error("Keystore file not found [keystore_file].");
		} catch (NoSuchAlgorithmException e) {
			logger.error("Keystore algorithm invalid.");
		} catch (CertificateException e) {
			logger.error("Private key invalid to process keystore.");
		} catch (IOException e) {
			logger.error("Error reading the keystore file [keystore_file].");
		} catch (UnrecoverableKeyException e) {
			logger.error("The keystore cannot be recovered.");
		} finally {
			if(ecKey == null) {
				logger.error("Could not read the private key, please review your configuration.");
			}
		}
		return ecKey;
	}
	
}
