package com.cdc.apihub.RCC.FicoScore.INTL.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(description = "Datos del domicilio de la persona a consultar")


public class DomicilioPeticion {
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
  @SerializedName("tipoAsentamiento")
  private String tipoAsentamiento = null;
  public DomicilioPeticion direccion(String direccion) {
    this.direccion = direccion;
    return this;
  }
   
  @ApiModelProperty(example = "HIDALGO 32", required = true, value = "Reportar el nombre de la calle, número exterior, número interior. Deben considerarse avenida,cerrada, manzana, lote, edificio,departamento etc. Debe contener por lo menos dos cadenas de caracteres para que el registro sea válido, de lo contrario el registro será rechazado.")
  public String getDireccion() {
    return direccion;
  }
  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }
  public DomicilioPeticion coloniaPoblacion(String coloniaPoblacion) {
    this.coloniaPoblacion = coloniaPoblacion;
    return this;
  }
   
  @ApiModelProperty(example = "CENTRO", required = true, value = "Reportar la colonia a la cual pertenece la dirección contenida en el elemento dirección.")
  public String getColoniaPoblacion() {
    return coloniaPoblacion;
  }
  public void setColoniaPoblacion(String coloniaPoblacion) {
    this.coloniaPoblacion = coloniaPoblacion;
  }
  public DomicilioPeticion delegacionMunicipio(String delegacionMunicipio) {
    this.delegacionMunicipio = delegacionMunicipio;
    return this;
  }
   
  @ApiModelProperty(example = "LA BARCA", required = true, value = "Reportar la delegación o municipio a la cual pertenece la dirección contenida en el elemento Dirección.")
  public String getDelegacionMunicipio() {
    return delegacionMunicipio;
  }
  public void setDelegacionMunicipio(String delegacionMunicipio) {
    this.delegacionMunicipio = delegacionMunicipio;
  }
  public DomicilioPeticion ciudad(String ciudad) {
    this.ciudad = ciudad;
    return this;
  }
   
  @ApiModelProperty(example = "BENITO JUAREZ", required = true, value = "Reportar la ciudad a la cual pertenece la dirección contenida en el elemento Dirección.")
  public String getCiudad() {
    return ciudad;
  }
  public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
  }
  public DomicilioPeticion estado(String estado) {
    this.estado = estado;
    return this;
  }
   
  @ApiModelProperty(required = true, value = "")
  public String getEstado() {
    return estado;
  }
  public void setEstado(String estado) {
    this.estado = estado;
  }
  public DomicilioPeticion CP(String CP) {
    this.CP = CP;
    return this;
  }
   
  @ApiModelProperty(example = "47917", required = true, value = "El código postal reportado debeestar compuesto por 5 dígitos. Para que el código postal sea válido deberá corresponder al estado reportado.")
  public String getCP() {
    return CP;
  }
  public void setCP(String CP) {
    this.CP = CP;
  }
  public DomicilioPeticion fechaResidencia(String fechaResidencia) {
    this.fechaResidencia = fechaResidencia;
    return this;
  }
   
  @ApiModelProperty(example = "2018-12-21", value = "Debe de reportarse la fecha desde cuando el consumidor vive en la  dirección reportada.")
  public String getFechaResidencia() {
    return fechaResidencia;
  }
  public void setFechaResidencia(String fechaResidencia) {
    this.fechaResidencia = fechaResidencia;
  }
  public DomicilioPeticion numeroTelefono(String numeroTelefono) {
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
  public DomicilioPeticion tipoDomicilio(String tipoDomicilio) {
    this.tipoDomicilio = tipoDomicilio;
    return this;
  }
   
  @ApiModelProperty(example = "C", value = "")
  public String getTipoDomicilio() {
    return tipoDomicilio;
  }
  public void setTipoDomicilio(String tipoDomicilio) {
    this.tipoDomicilio = tipoDomicilio;
  }
  public DomicilioPeticion tipoAsentamiento(String tipoAsentamiento) {
    this.tipoAsentamiento = tipoAsentamiento;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public String getTipoAsentamiento() {
    return tipoAsentamiento;
  }
  public void setTipoAsentamiento(String tipoAsentamiento) {
    this.tipoAsentamiento = tipoAsentamiento;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomicilioPeticion domicilioPeticion = (DomicilioPeticion) o;
    return Objects.equals(this.direccion, domicilioPeticion.direccion) &&
        Objects.equals(this.coloniaPoblacion, domicilioPeticion.coloniaPoblacion) &&
        Objects.equals(this.delegacionMunicipio, domicilioPeticion.delegacionMunicipio) &&
        Objects.equals(this.ciudad, domicilioPeticion.ciudad) &&
        Objects.equals(this.estado, domicilioPeticion.estado) &&
        Objects.equals(this.CP, domicilioPeticion.CP) &&
        Objects.equals(this.fechaResidencia, domicilioPeticion.fechaResidencia) &&
        Objects.equals(this.numeroTelefono, domicilioPeticion.numeroTelefono) &&
        Objects.equals(this.tipoDomicilio, domicilioPeticion.tipoDomicilio) &&
        Objects.equals(this.tipoAsentamiento, domicilioPeticion.tipoAsentamiento);
  }
  @Override
  public int hashCode() {
    return Objects.hash(direccion, coloniaPoblacion, delegacionMunicipio, ciudad, estado, CP, fechaResidencia, numeroTelefono, tipoDomicilio, tipoAsentamiento);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomicilioPeticion {\n");
    
    sb.append("    direccion: ").append(toIndentedString(direccion)).append("\n");
    sb.append("    coloniaPoblacion: ").append(toIndentedString(coloniaPoblacion)).append("\n");
    sb.append("    delegacionMunicipio: ").append(toIndentedString(delegacionMunicipio)).append("\n");
    sb.append("    ciudad: ").append(toIndentedString(ciudad)).append("\n");
    sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
    sb.append("    CP: ").append(toIndentedString(CP)).append("\n");
    sb.append("    fechaResidencia: ").append(toIndentedString(fechaResidencia)).append("\n");
    sb.append("    numeroTelefono: ").append(toIndentedString(numeroTelefono)).append("\n");
    sb.append("    tipoDomicilio: ").append(toIndentedString(tipoDomicilio)).append("\n");
    sb.append("    tipoAsentamiento: ").append(toIndentedString(tipoAsentamiento)).append("\n");
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
