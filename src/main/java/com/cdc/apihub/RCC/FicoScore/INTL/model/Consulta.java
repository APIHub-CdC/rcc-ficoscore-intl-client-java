package com.cdc.apihub.RCC.FicoScore.INTL.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(description = "Datos de consultas.")


public class Consulta {
  @SerializedName("fechaConsulta")
  private String fechaConsulta = null;
  @SerializedName("claveOtorgante")
  private String claveOtorgante = null;
  @SerializedName("nombreOtorgante")
  private String nombreOtorgante = null;
  @SerializedName("telefonoOtorgante")
  private String telefonoOtorgante = null;
  @SerializedName("tipoCredito")
  private String tipoCredito = null;
  @SerializedName("claveUnidadMonetaria")
  private String claveUnidadMonetaria = null;
  @SerializedName("importeCredito")
  private Float importeCredito = null;
  @SerializedName("tipoResponsabilidad")
  private String tipoResponsabilidad = null;
  @SerializedName("clienteNuevo")
  private String clienteNuevo = null;
  public Consulta fechaConsulta(String fechaConsulta) {
    this.fechaConsulta = fechaConsulta;
    return this;
  }
   
  @ApiModelProperty(example = "09012020", value = "Fecha de la consulta.")
  public String getFechaConsulta() {
    return fechaConsulta;
  }
  public void setFechaConsulta(String fechaConsulta) {
    this.fechaConsulta = fechaConsulta;
  }
  public Consulta claveOtorgante(String claveOtorgante) {
    this.claveOtorgante = claveOtorgante;
    return this;
  }
   
  @ApiModelProperty(example = "CDC0001", value = "Contiene la clave del otorgante que reporta el crédito. <br>Nota: Este elemento solo es reportado para reporte de crédito especial.")
  public String getClaveOtorgante() {
    return claveOtorgante;
  }
  public void setClaveOtorgante(String claveOtorgante) {
    this.claveOtorgante = claveOtorgante;
  }
  public Consulta nombreOtorgante(String nombreOtorgante) {
    this.nombreOtorgante = nombreOtorgante;
    return this;
  }
   
  @ApiModelProperty(example = "MICROFINANCIERA", value = "Contiene el Nombre del Otorgante de Crédito que reporto el Crédito. Ver Tabla: Tipo de Negocio. <br>Nota: Este elemento solo es reportado para reporte de crédito especial.")
  public String getNombreOtorgante() {
    return nombreOtorgante;
  }
  public void setNombreOtorgante(String nombreOtorgante) {
    this.nombreOtorgante = nombreOtorgante;
  }
  public Consulta telefonoOtorgante(String telefonoOtorgante) {
    this.telefonoOtorgante = telefonoOtorgante;
    return this;
  }
   
  @ApiModelProperty(example = "5512345678", value = "Se presentará el teléfono de la Institución Otorgante que reporta la cuenta.")
  public String getTelefonoOtorgante() {
    return telefonoOtorgante;
  }
  public void setTelefonoOtorgante(String telefonoOtorgante) {
    this.telefonoOtorgante = telefonoOtorgante;
  }
  public Consulta tipoCredito(String tipoCredito) {
    this.tipoCredito = tipoCredito;
    return this;
  }
   
  @ApiModelProperty(example = "M", value = "Tipo de crédito que se solicitó.")
  public String getTipoCredito() {
    return tipoCredito;
  }
  public void setTipoCredito(String tipoCredito) {
    this.tipoCredito = tipoCredito;
  }
  public Consulta claveUnidadMonetaria(String claveUnidadMonetaria) {
    this.claveUnidadMonetaria = claveUnidadMonetaria;
    return this;
  }
   
  @ApiModelProperty(example = "MX", value = "Indica la moneda en la que fue otorgado el Crédito.")
  public String getClaveUnidadMonetaria() {
    return claveUnidadMonetaria;
  }
  public void setClaveUnidadMonetaria(String claveUnidadMonetaria) {
    this.claveUnidadMonetaria = claveUnidadMonetaria;
  }
  public Consulta importeCredito(Float importeCredito) {
    this.importeCredito = importeCredito;
    return this;
  }
   
  @ApiModelProperty(example = "100.0", value = "Monto solicitado.")
  public Float getImporteCredito() {
    return importeCredito;
  }
  public void setImporteCredito(Float importeCredito) {
    this.importeCredito = importeCredito;
  }
  public Consulta tipoResponsabilidad(String tipoResponsabilidad) {
    this.tipoResponsabilidad = tipoResponsabilidad;
    return this;
  }
   
  @ApiModelProperty(example = "A", value = "Indica la responsabilidad que el Cliente tiene con la Cuenta o Crédito.")
  public String getTipoResponsabilidad() {
    return tipoResponsabilidad;
  }
  public void setTipoResponsabilidad(String tipoResponsabilidad) {
    this.tipoResponsabilidad = tipoResponsabilidad;
  }
  public Consulta clienteNuevo(String clienteNuevo) {
    this.clienteNuevo = clienteNuevo;
    return this;
  }
   
  @ApiModelProperty(example = "Y", value = "Si este campo reporta una “Y”, la consulta es referente a un nuevo Cliente.")
  public String getClienteNuevo() {
    return clienteNuevo;
  }
  public void setClienteNuevo(String clienteNuevo) {
    this.clienteNuevo = clienteNuevo;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Consulta consulta = (Consulta) o;
    return Objects.equals(this.fechaConsulta, consulta.fechaConsulta) &&
        Objects.equals(this.claveOtorgante, consulta.claveOtorgante) &&
        Objects.equals(this.nombreOtorgante, consulta.nombreOtorgante) &&
        Objects.equals(this.telefonoOtorgante, consulta.telefonoOtorgante) &&
        Objects.equals(this.tipoCredito, consulta.tipoCredito) &&
        Objects.equals(this.claveUnidadMonetaria, consulta.claveUnidadMonetaria) &&
        Objects.equals(this.importeCredito, consulta.importeCredito) &&
        Objects.equals(this.tipoResponsabilidad, consulta.tipoResponsabilidad) &&
        Objects.equals(this.clienteNuevo, consulta.clienteNuevo);
  }
  @Override
  public int hashCode() {
    return Objects.hash(fechaConsulta, claveOtorgante, nombreOtorgante, telefonoOtorgante, tipoCredito, claveUnidadMonetaria, importeCredito, tipoResponsabilidad, clienteNuevo);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Consulta {\n");
    
    sb.append("    fechaConsulta: ").append(toIndentedString(fechaConsulta)).append("\n");
    sb.append("    claveOtorgante: ").append(toIndentedString(claveOtorgante)).append("\n");
    sb.append("    nombreOtorgante: ").append(toIndentedString(nombreOtorgante)).append("\n");
    sb.append("    telefonoOtorgante: ").append(toIndentedString(telefonoOtorgante)).append("\n");
    sb.append("    tipoCredito: ").append(toIndentedString(tipoCredito)).append("\n");
    sb.append("    claveUnidadMonetaria: ").append(toIndentedString(claveUnidadMonetaria)).append("\n");
    sb.append("    importeCredito: ").append(toIndentedString(importeCredito)).append("\n");
    sb.append("    tipoResponsabilidad: ").append(toIndentedString(tipoResponsabilidad)).append("\n");
    sb.append("    clienteNuevo: ").append(toIndentedString(clienteNuevo)).append("\n");
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
