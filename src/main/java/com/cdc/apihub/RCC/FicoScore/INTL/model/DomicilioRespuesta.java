package com.cdc.apihub.RCC.FicoScore.INTL.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(description = "Datos del domicilio de la persona a consultar")


public class DomicilioRespuesta {
  @SerializedName("direccion")
  private String direccion = null;
  @SerializedName("coloniaPoblacion")
  private String coloniaPoblacion = null;
  @SerializedName("delegacionMunicipio")
  private String delegacionMunicipio = null;
  @SerializedName("ciudad")
  private String ciudad = null;
  @SerializedName("estado")
  private String estado = null;
  @SerializedName("CP")
  private String CP = null;
  @SerializedName("fechaResidencia")
  private String fechaResidencia = null;
  @SerializedName("numeroTelefono")
  private String numeroTelefono = null;
  @SerializedName("tipoDomicilio")
  private String tipoDomicilio = null;
  @SerializedName("indicadorDomicilio")
  private String indicadorDomicilio = null;
  @SerializedName("fechaRegistroDomicilio")
  private String fechaRegistroDomicilio = null;
  public DomicilioRespuesta direccion(String direccion) {
    this.direccion = direccion;
    return this;
  }
   
  @ApiModelProperty(example = "HIDALGO 32", value = "Reportar el nombre de la calle, número exterior, número interior. Deben considerarse avenida,cerrada, manzana, lote, edificio,departamento etc. Debe contener por lo menos dos cadenas de caracteres para que el registro sea válido, de lo contrario el registro será rechazado.")
  public String getDireccion() {
    return direccion;
  }
  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }
  public DomicilioRespuesta coloniaPoblacion(String coloniaPoblacion) {
    this.coloniaPoblacion = coloniaPoblacion;
    return this;
  }
   
  @ApiModelProperty(example = "CENTRO", value = "Reportar la colonia a la cual pertenece la dirección contenida en el elemento dirección.")
  public String getColoniaPoblacion() {
    return coloniaPoblacion;
  }
  public void setColoniaPoblacion(String coloniaPoblacion) {
    this.coloniaPoblacion = coloniaPoblacion;
  }
  public DomicilioRespuesta delegacionMunicipio(String delegacionMunicipio) {
    this.delegacionMunicipio = delegacionMunicipio;
    return this;
  }
   
  @ApiModelProperty(example = "LA BARCA", value = "Reportar la delegación o municipio a la cual pertenece la dirección contenida en el elemento Dirección.")
  public String getDelegacionMunicipio() {
    return delegacionMunicipio;
  }
  public void setDelegacionMunicipio(String delegacionMunicipio) {
    this.delegacionMunicipio = delegacionMunicipio;
  }
  public DomicilioRespuesta ciudad(String ciudad) {
    this.ciudad = ciudad;
    return this;
  }
   
  @ApiModelProperty(example = "BENITO JUAREZ", value = "Reportar la ciudad a la cual pertenece la dirección contenida en el elemento Dirección.")
  public String getCiudad() {
    return ciudad;
  }
  public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
  }
  public DomicilioRespuesta estado(String estado) {
    this.estado = estado;
    return this;
  }
   
  @ApiModelProperty(example = "DF", value = "Contiene el código del estado de la República Mexicana donde tiene su residencia.")
  public String getEstado() {
    return estado;
  }
  public void setEstado(String estado) {
    this.estado = estado;
  }
  public DomicilioRespuesta CP(String CP) {
    this.CP = CP;
    return this;
  }
   
  @ApiModelProperty(example = "47917", value = "El código postal reportado debeestar compuesto por 5 dígitos. Para que el código postal sea válido deberá corresponder al estado reportado.")
  public String getCP() {
    return CP;
  }
  public void setCP(String CP) {
    this.CP = CP;
  }
  public DomicilioRespuesta fechaResidencia(String fechaResidencia) {
    this.fechaResidencia = fechaResidencia;
    return this;
  }
   
  @ApiModelProperty(example = "21122018", value = "Debe de reportarse la fecha desde cuando el consumidor vive en la  dirección reportada.")
  public String getFechaResidencia() {
    return fechaResidencia;
  }
  public void setFechaResidencia(String fechaResidencia) {
    this.fechaResidencia = fechaResidencia;
  }
  public DomicilioRespuesta numeroTelefono(String numeroTelefono) {
    this.numeroTelefono = numeroTelefono;
    return this;
  }
   
  @ApiModelProperty(example = "5512345678", value = "Debe de contener una longitud mínima de 5 caracteres. Cada carácter debe ser un número de 0-9, si se ingresa cualquier otro carácter el registro será rechazado.")
  public String getNumeroTelefono() {
    return numeroTelefono;
  }
  public void setNumeroTelefono(String numeroTelefono) {
    this.numeroTelefono = numeroTelefono;
  }
  public DomicilioRespuesta tipoDomicilio(String tipoDomicilio) {
    this.tipoDomicilio = tipoDomicilio;
    return this;
  }
   
  @ApiModelProperty(example = "H", value = "Indica el tipo de Domicilio que el Cliente ha proporcionado, si se reportó.")
  public String getTipoDomicilio() {
    return tipoDomicilio;
  }
  public void setTipoDomicilio(String tipoDomicilio) {
    this.tipoDomicilio = tipoDomicilio;
  }
  public DomicilioRespuesta indicadorDomicilio(String indicadorDomicilio) {
    this.indicadorDomicilio = indicadorDomicilio;
    return this;
  }
   
  @ApiModelProperty(example = "K", value = "ndica el tipo de ubicación del domicilio del Cliente.")
  public String getIndicadorDomicilio() {
    return indicadorDomicilio;
  }
  public void setIndicadorDomicilio(String indicadorDomicilio) {
    this.indicadorDomicilio = indicadorDomicilio;
  }
  public DomicilioRespuesta fechaRegistroDomicilio(String fechaRegistroDomicilio) {
    this.fechaRegistroDomicilio = fechaRegistroDomicilio;
    return this;
  }
   
  @ApiModelProperty(example = "20122018", value = "Fecha en la cual se registró el domicilio.")
  public String getFechaRegistroDomicilio() {
    return fechaRegistroDomicilio;
  }
  public void setFechaRegistroDomicilio(String fechaRegistroDomicilio) {
    this.fechaRegistroDomicilio = fechaRegistroDomicilio;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomicilioRespuesta domicilioRespuesta = (DomicilioRespuesta) o;
    return Objects.equals(this.direccion, domicilioRespuesta.direccion) &&
        Objects.equals(this.coloniaPoblacion, domicilioRespuesta.coloniaPoblacion) &&
        Objects.equals(this.delegacionMunicipio, domicilioRespuesta.delegacionMunicipio) &&
        Objects.equals(this.ciudad, domicilioRespuesta.ciudad) &&
        Objects.equals(this.estado, domicilioRespuesta.estado) &&
        Objects.equals(this.CP, domicilioRespuesta.CP) &&
        Objects.equals(this.fechaResidencia, domicilioRespuesta.fechaResidencia) &&
        Objects.equals(this.numeroTelefono, domicilioRespuesta.numeroTelefono) &&
        Objects.equals(this.tipoDomicilio, domicilioRespuesta.tipoDomicilio) &&
        Objects.equals(this.indicadorDomicilio, domicilioRespuesta.indicadorDomicilio) &&
        Objects.equals(this.fechaRegistroDomicilio, domicilioRespuesta.fechaRegistroDomicilio);
  }
  @Override
  public int hashCode() {
    return Objects.hash(direccion, coloniaPoblacion, delegacionMunicipio, ciudad, estado, CP, fechaResidencia, numeroTelefono, tipoDomicilio, indicadorDomicilio, fechaRegistroDomicilio);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomicilioRespuesta {\n");
    
    sb.append("    direccion: ").append(toIndentedString(direccion)).append("\n");
    sb.append("    coloniaPoblacion: ").append(toIndentedString(coloniaPoblacion)).append("\n");
    sb.append("    delegacionMunicipio: ").append(toIndentedString(delegacionMunicipio)).append("\n");
    sb.append("    ciudad: ").append(toIndentedString(ciudad)).append("\n");
    sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
    sb.append("    CP: ").append(toIndentedString(CP)).append("\n");
    sb.append("    fechaResidencia: ").append(toIndentedString(fechaResidencia)).append("\n");
    sb.append("    numeroTelefono: ").append(toIndentedString(numeroTelefono)).append("\n");
    sb.append("    tipoDomicilio: ").append(toIndentedString(tipoDomicilio)).append("\n");
    sb.append("    indicadorDomicilio: ").append(toIndentedString(indicadorDomicilio)).append("\n");
    sb.append("    fechaRegistroDomicilio: ").append(toIndentedString(fechaRegistroDomicilio)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
