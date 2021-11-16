package com.cdc.apihub.RCC.FicoScore.INTL.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

public class PersonaRespuesta {
  @SerializedName("apellidoPaterno")
  private String apellidoPaterno = null;
  @SerializedName("apellidoMaterno")
  private String apellidoMaterno = null;
  @SerializedName("apellidoAdicional")
  private String apellidoAdicional = null;
  @SerializedName("nombres")
  private String nombres = null;
  @SerializedName("fechaNacimiento")
  private String fechaNacimiento = null;
  @SerializedName("RFC")
  private String RFC = null;
  @SerializedName("prefijo")
  private String prefijo = null;
  @SerializedName("sufijo")
  private String sufijo = null;
  @SerializedName("nacionalidad")
  private String nacionalidad = null;
  @SerializedName("residencia")
  private Integer residencia = null;
  @SerializedName("numeroLicenciaConducir")
  private String numeroLicenciaConducir = null;
  @SerializedName("estadoCivil")
  private String estadoCivil = null;
  @SerializedName("sexo")
  private String sexo = null;
  @SerializedName("numeroCedulaProfesional")
  private String numeroCedulaProfesional = null;
  @SerializedName("claveElectorIFE")
  private String claveElectorIFE = null;
  @SerializedName("numeroDependientes")
  private Integer numeroDependientes = null;
  @SerializedName("edadDependientes")
  private Integer edadDependientes = null;
  @SerializedName("fechaRecepcionDatosDep")
  private String fechaRecepcionDatosDep = null;
  @SerializedName("fechaDefuncion")
  private String fechaDefuncion = null;
  public PersonaRespuesta apellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
    return this;
  }
   
  @ApiModelProperty(example = "SAHAGUN", value = "Apellido paterno de la persona")
  public String getApellidoPaterno() {
    return apellidoPaterno;
  }
  public void setApellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
  }
  public PersonaRespuesta apellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
    return this;
  }
   
  @ApiModelProperty(example = "ZARAGOZA", value = "Apellido materno de la persona")
  public String getApellidoMaterno() {
    return apellidoMaterno;
  }
  public void setApellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
  }
  public PersonaRespuesta apellidoAdicional(String apellidoAdicional) {
    this.apellidoAdicional = apellidoAdicional;
    return this;
  }
   
  @ApiModelProperty(value = "Apellido adicional de la persona, si tuviere")
  public String getApellidoAdicional() {
    return apellidoAdicional;
  }
  public void setApellidoAdicional(String apellidoAdicional) {
    this.apellidoAdicional = apellidoAdicional;
  }
  public PersonaRespuesta nombres(String nombres) {
    this.nombres = nombres;
    return this;
  }
   
  @ApiModelProperty(example = "ROBERTO", value = "Primer nombre de la persona")
  public String getNombres() {
    return nombres;
  }
  public void setNombres(String nombres) {
    this.nombres = nombres;
  }
  public PersonaRespuesta fechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
    return this;
  }
   
  @ApiModelProperty(example = "01012001", value = "Fecha de nacimiento de la persona, en el formato especificado (por defecto ddMMyyyy)")
  public String getFechaNacimiento() {
    return fechaNacimiento;
  }
  public void setFechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }
  public PersonaRespuesta RFC(String RFC) {
    this.RFC = RFC;
    return this;
  }
   
  @ApiModelProperty(example = "SAZR010101", value = "RFC con homoclave de la persona")
  public String getRFC() {
    return RFC;
  }
  public void setRFC(String RFC) {
    this.RFC = RFC;
  }
  public PersonaRespuesta prefijo(String prefijo) {
    this.prefijo = prefijo;
    return this;
  }
   
  @ApiModelProperty(example = "Mr.", value = "Prefijos Personales y Profesionales")
  public String getPrefijo() {
    return prefijo;
  }
  public void setPrefijo(String prefijo) {
    this.prefijo = prefijo;
  }
  public PersonaRespuesta sufijo(String sufijo) {
    this.sufijo = sufijo;
    return this;
  }
   
  @ApiModelProperty(example = "JR", value = "SUFIJO PERSONAL")
  public String getSufijo() {
    return sufijo;
  }
  public void setSufijo(String sufijo) {
    this.sufijo = sufijo;
  }
  public PersonaRespuesta nacionalidad(String nacionalidad) {
    this.nacionalidad = nacionalidad;
    return this;
  }
   
  @ApiModelProperty(example = "MX", value = "nacionalidad")
  public String getNacionalidad() {
    return nacionalidad;
  }
  public void setNacionalidad(String nacionalidad) {
    this.nacionalidad = nacionalidad;
  }
  public PersonaRespuesta residencia(Integer residencia) {
    this.residencia = residencia;
    return this;
  }
   
  @ApiModelProperty(example = "1", value = "Se refiere al estado de la vivienda.")
  public Integer getResidencia() {
    return residencia;
  }
  public void setResidencia(Integer residencia) {
    this.residencia = residencia;
  }
  public PersonaRespuesta numeroLicenciaConducir(String numeroLicenciaConducir) {
    this.numeroLicenciaConducir = numeroLicenciaConducir;
    return this;
  }
   
  @ApiModelProperty(example = "9879797", value = "Contiene el número de licencia de conducir")
  public String getNumeroLicenciaConducir() {
    return numeroLicenciaConducir;
  }
  public void setNumeroLicenciaConducir(String numeroLicenciaConducir) {
    this.numeroLicenciaConducir = numeroLicenciaConducir;
  }
  public PersonaRespuesta estadoCivil(String estadoCivil) {
    this.estadoCivil = estadoCivil;
    return this;
  }
   
  @ApiModelProperty(example = "D", value = "nacionalidad")
  public String getEstadoCivil() {
    return estadoCivil;
  }
  public void setEstadoCivil(String estadoCivil) {
    this.estadoCivil = estadoCivil;
  }
  public PersonaRespuesta sexo(String sexo) {
    this.sexo = sexo;
    return this;
  }
   
  @ApiModelProperty(example = "M", value = "genero")
  public String getSexo() {
    return sexo;
  }
  public void setSexo(String sexo) {
    this.sexo = sexo;
  }
  public PersonaRespuesta numeroCedulaProfesional(String numeroCedulaProfesional) {
    this.numeroCedulaProfesional = numeroCedulaProfesional;
    return this;
  }
   
  @ApiModelProperty(example = "1122121212", value = "NUMERO DE CEDULA PROFESIONALr")
  public String getNumeroCedulaProfesional() {
    return numeroCedulaProfesional;
  }
  public void setNumeroCedulaProfesional(String numeroCedulaProfesional) {
    this.numeroCedulaProfesional = numeroCedulaProfesional;
  }
  public PersonaRespuesta claveElectorIFE(String claveElectorIFE) {
    this.claveElectorIFE = claveElectorIFE;
    return this;
  }
   
  @ApiModelProperty(example = "000000000000", value = "La clave de elector que se encuentra en el IFE/INE.")
  public String getClaveElectorIFE() {
    return claveElectorIFE;
  }
  public void setClaveElectorIFE(String claveElectorIFE) {
    this.claveElectorIFE = claveElectorIFE;
  }
  public PersonaRespuesta numeroDependientes(Integer numeroDependientes) {
    this.numeroDependientes = numeroDependientes;
    return this;
  }
   
  @ApiModelProperty(example = "0", value = "Número de personas que dependen de la persona.")
  public Integer getNumeroDependientes() {
    return numeroDependientes;
  }
  public void setNumeroDependientes(Integer numeroDependientes) {
    this.numeroDependientes = numeroDependientes;
  }
  public PersonaRespuesta edadDependientes(Integer edadDependientes) {
    this.edadDependientes = edadDependientes;
    return this;
  }
   
  @ApiModelProperty(example = "0", value = "Se reportan las edades de los dependientes mencionados en el campo anterior, hasta 15 dependientes.")
  public Integer getEdadDependientes() {
    return edadDependientes;
  }
  public void setEdadDependientes(Integer edadDependientes) {
    this.edadDependientes = edadDependientes;
  }
  public PersonaRespuesta fechaRecepcionDatosDep(String fechaRecepcionDatosDep) {
    this.fechaRecepcionDatosDep = fechaRecepcionDatosDep;
    return this;
  }
   
  @ApiModelProperty(example = "01012001", value = "Fecha de nacimiento de la persona, en el formato especificado (por defecto ddMMyyyy)")
  public String getFechaRecepcionDatosDep() {
    return fechaRecepcionDatosDep;
  }
  public void setFechaRecepcionDatosDep(String fechaRecepcionDatosDep) {
    this.fechaRecepcionDatosDep = fechaRecepcionDatosDep;
  }
  public PersonaRespuesta fechaDefuncion(String fechaDefuncion) {
    this.fechaDefuncion = fechaDefuncion;
    return this;
  }
   
  @ApiModelProperty(example = "01019999", value = "Fecha de nacimiento de la persona, en el formato especificado (por defecto ddMMyyyy)")
  public String getFechaDefuncion() {
    return fechaDefuncion;
  }
  public void setFechaDefuncion(String fechaDefuncion) {
    this.fechaDefuncion = fechaDefuncion;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonaRespuesta personaRespuesta = (PersonaRespuesta) o;
    return Objects.equals(this.apellidoPaterno, personaRespuesta.apellidoPaterno) &&
        Objects.equals(this.apellidoMaterno, personaRespuesta.apellidoMaterno) &&
        Objects.equals(this.apellidoAdicional, personaRespuesta.apellidoAdicional) &&
        Objects.equals(this.nombres, personaRespuesta.nombres) &&
        Objects.equals(this.fechaNacimiento, personaRespuesta.fechaNacimiento) &&
        Objects.equals(this.RFC, personaRespuesta.RFC) &&
        Objects.equals(this.prefijo, personaRespuesta.prefijo) &&
        Objects.equals(this.sufijo, personaRespuesta.sufijo) &&
        Objects.equals(this.nacionalidad, personaRespuesta.nacionalidad) &&
        Objects.equals(this.residencia, personaRespuesta.residencia) &&
        Objects.equals(this.numeroLicenciaConducir, personaRespuesta.numeroLicenciaConducir) &&
        Objects.equals(this.estadoCivil, personaRespuesta.estadoCivil) &&
        Objects.equals(this.sexo, personaRespuesta.sexo) &&
        Objects.equals(this.numeroCedulaProfesional, personaRespuesta.numeroCedulaProfesional) &&
        Objects.equals(this.claveElectorIFE, personaRespuesta.claveElectorIFE) &&
        Objects.equals(this.numeroDependientes, personaRespuesta.numeroDependientes) &&
        Objects.equals(this.edadDependientes, personaRespuesta.edadDependientes) &&
        Objects.equals(this.fechaRecepcionDatosDep, personaRespuesta.fechaRecepcionDatosDep) &&
        Objects.equals(this.fechaDefuncion, personaRespuesta.fechaDefuncion);
  }
  @Override
  public int hashCode() {
    return Objects.hash(apellidoPaterno, apellidoMaterno, apellidoAdicional, nombres, fechaNacimiento, RFC, prefijo, sufijo, nacionalidad, residencia, numeroLicenciaConducir, estadoCivil, sexo, numeroCedulaProfesional, claveElectorIFE, numeroDependientes, edadDependientes, fechaRecepcionDatosDep, fechaDefuncion);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonaRespuesta {\n");
    
    sb.append("    apellidoPaterno: ").append(toIndentedString(apellidoPaterno)).append("\n");
    sb.append("    apellidoMaterno: ").append(toIndentedString(apellidoMaterno)).append("\n");
    sb.append("    apellidoAdicional: ").append(toIndentedString(apellidoAdicional)).append("\n");
    sb.append("    nombres: ").append(toIndentedString(nombres)).append("\n");
    sb.append("    fechaNacimiento: ").append(toIndentedString(fechaNacimiento)).append("\n");
    sb.append("    RFC: ").append(toIndentedString(RFC)).append("\n");
    sb.append("    prefijo: ").append(toIndentedString(prefijo)).append("\n");
    sb.append("    sufijo: ").append(toIndentedString(sufijo)).append("\n");
    sb.append("    nacionalidad: ").append(toIndentedString(nacionalidad)).append("\n");
    sb.append("    residencia: ").append(toIndentedString(residencia)).append("\n");
    sb.append("    numeroLicenciaConducir: ").append(toIndentedString(numeroLicenciaConducir)).append("\n");
    sb.append("    estadoCivil: ").append(toIndentedString(estadoCivil)).append("\n");
    sb.append("    sexo: ").append(toIndentedString(sexo)).append("\n");
    sb.append("    numeroCedulaProfesional: ").append(toIndentedString(numeroCedulaProfesional)).append("\n");
    sb.append("    claveElectorIFE: ").append(toIndentedString(claveElectorIFE)).append("\n");
    sb.append("    numeroDependientes: ").append(toIndentedString(numeroDependientes)).append("\n");
    sb.append("    edadDependientes: ").append(toIndentedString(edadDependientes)).append("\n");
    sb.append("    fechaRecepcionDatosDep: ").append(toIndentedString(fechaRecepcionDatosDep)).append("\n");
    sb.append("    fechaDefuncion: ").append(toIndentedString(fechaDefuncion)).append("\n");
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
