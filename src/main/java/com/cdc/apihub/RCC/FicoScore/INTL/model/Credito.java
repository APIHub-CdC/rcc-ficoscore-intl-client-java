package com.cdc.apihub.RCC.FicoScore.INTL.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(description = "El elemento de crédito contiene el comportamiento actual e histórico del crédito del consumidor, este elemento se repite dependiendo del número de cuentas del consumidor.")


public class Credito {
  @SerializedName("fechaActualizacion")
  private String fechaActualizacion = null;
  @SerializedName("registroImpugnado")
  private Integer registroImpugnado = null;
  @SerializedName("claveOtorgante")
  private String claveOtorgante = null;
  @SerializedName("nombreOtorgante")
  private String nombreOtorgante = null;
  @SerializedName("telefonoOtorgante")
  private String telefonoOtorgante = null;
  @SerializedName("cuentaActual")
  private String cuentaActual = null;
  @SerializedName("tipoResponsabilidad")
  private String tipoResponsabilidad = null;
  @SerializedName("tipoCuenta")
  private String tipoCuenta = null;
  @SerializedName("tipoCredito")
  private String tipoCredito = null;
  @SerializedName("claveUnidadMonetaria")
  private String claveUnidadMonetaria = null;
  @SerializedName("valorActivoValuacion")
  private Integer valorActivoValuacion = null;
  @SerializedName("numeroPagos")
  private Integer numeroPagos = null;
  @SerializedName("frecuenciaPagos")
  private String frecuenciaPagos = null;
  @SerializedName("montoPagar")
  private Float montoPagar = null;
  @SerializedName("fechaAperturaCuenta")
  private String fechaAperturaCuenta = null;
  @SerializedName("fechaUltimoPago")
  private String fechaUltimoPago = null;
  @SerializedName("fechaUltimaCompra")
  private String fechaUltimaCompra = null;
  @SerializedName("fechaCierreCuenta")
  private String fechaCierreCuenta = null;
  @SerializedName("fechaReporte")
  private String fechaReporte = null;
  @SerializedName("modoReporte")
  private String modoReporte = null;
  @SerializedName("ultimaFechaSaldoCero")
  private String ultimaFechaSaldoCero = null;
  @SerializedName("garantia")
  private String garantia = null;
  @SerializedName("creditoMaximo")
  private Float creditoMaximo = null;
  @SerializedName("saldoActual")
  private Float saldoActual = null;
  @SerializedName("limiteCredito")
  private Float limiteCredito = null;
  @SerializedName("saldoVencido")
  private Float saldoVencido = null;
  @SerializedName("numeroPagosVencidos")
  private Integer numeroPagosVencidos = null;
  @SerializedName("pagoActual")
  private String pagoActual = null;
  @SerializedName("historicoPagos")
  private String historicoPagos = null;
  @SerializedName("fechaRecienteHistoricoPagos")
  private String fechaRecienteHistoricoPagos = null;
  @SerializedName("fechaAntiguaHistoricoPagos")
  private String fechaAntiguaHistoricoPagos = null;
  @SerializedName("clavePrevencion")
  private String clavePrevencion = null;
  @SerializedName("totalPagosReportados")
  private Integer totalPagosReportados = null;
  @SerializedName("MOP2")
  private Integer moP2 = null;
  @SerializedName("MOP3")
  private Integer moP3 = null;
  @SerializedName("MOP4")
  private Integer moP4 = null;
  @SerializedName("MOP5")
  private Integer moP5 = null;
  @SerializedName("saldoVencidoPeorAtraso")
  private Float saldoVencidoPeorAtraso = null;
  @SerializedName("fechaPeorAtraso")
  private String fechaPeorAtraso = null;
  @SerializedName("peorAtraso")
  private Float peorAtraso = null;
  @SerializedName("fechaInicioReestructura")
  private String fechaInicioReestructura = null;
  public Credito fechaActualizacion(String fechaActualizacion) {
    this.fechaActualizacion = fechaActualizacion;
    return this;
  }
   
  @ApiModelProperty(example = "30042016", value = "Fecha en que se actualizó la información de la cuenta.")
  public String getFechaActualizacion() {
    return fechaActualizacion;
  }
  public void setFechaActualizacion(String fechaActualizacion) {
    this.fechaActualizacion = fechaActualizacion;
  }
  public Credito registroImpugnado(Integer registroImpugnado) {
    this.registroImpugnado = registroImpugnado;
    return this;
  }
   
  @ApiModelProperty(example = "0", value = "En caso de que el valor sea mayor que cero, indica que es un registro impugnado por el Consumidor. La etiqueta muestra un dato igual a “0001” para Registro Impugnado. Si este se reporta, significa que el consumidor final solicitó una aclaración sobre esta cuenta, en apego a la Ley de las Sociedades de Información Crediticia.")
  public Integer getRegistroImpugnado() {
    return registroImpugnado;
  }
  public void setRegistroImpugnado(Integer registroImpugnado) {
    this.registroImpugnado = registroImpugnado;
  }
  public Credito claveOtorgante(String claveOtorgante) {
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
  public Credito nombreOtorgante(String nombreOtorgante) {
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
  public Credito telefonoOtorgante(String telefonoOtorgante) {
    this.telefonoOtorgante = telefonoOtorgante;
    return this;
  }
   
  @ApiModelProperty(example = "551945134", value = "telefono del otorgante")
  public String getTelefonoOtorgante() {
    return telefonoOtorgante;
  }
  public void setTelefonoOtorgante(String telefonoOtorgante) {
    this.telefonoOtorgante = telefonoOtorgante;
  }
  public Credito cuentaActual(String cuentaActual) {
    this.cuentaActual = cuentaActual;
    return this;
  }
   
  @ApiModelProperty(example = "303139149", value = "Número de cuenta del crédito")
  public String getCuentaActual() {
    return cuentaActual;
  }
  public void setCuentaActual(String cuentaActual) {
    this.cuentaActual = cuentaActual;
  }
  public Credito tipoResponsabilidad(String tipoResponsabilidad) {
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
  public Credito tipoCuenta(String tipoCuenta) {
    this.tipoCuenta = tipoCuenta;
    return this;
  }
   
  @ApiModelProperty(example = "I", value = "Indica la responsabilidad que el Cliente tiene con la Cuenta o Crédito.")
  public String getTipoCuenta() {
    return tipoCuenta;
  }
  public void setTipoCuenta(String tipoCuenta) {
    this.tipoCuenta = tipoCuenta;
  }
  public Credito tipoCredito(String tipoCredito) {
    this.tipoCredito = tipoCredito;
    return this;
  }
   
  @ApiModelProperty(example = "BD", value = "")
  public String getTipoCredito() {
    return tipoCredito;
  }
  public void setTipoCredito(String tipoCredito) {
    this.tipoCredito = tipoCredito;
  }
  public Credito claveUnidadMonetaria(String claveUnidadMonetaria) {
    this.claveUnidadMonetaria = claveUnidadMonetaria;
    return this;
  }
   
  @ApiModelProperty(example = "MX", value = "Indica la moneda en la que fue otorgado el Crédito")
  public String getClaveUnidadMonetaria() {
    return claveUnidadMonetaria;
  }
  public void setClaveUnidadMonetaria(String claveUnidadMonetaria) {
    this.claveUnidadMonetaria = claveUnidadMonetaria;
  }
  public Credito valorActivoValuacion(Integer valorActivoValuacion) {
    this.valorActivoValuacion = valorActivoValuacion;
    return this;
  }
   
  @ApiModelProperty(example = "0", value = "Valor total del activo para propósitos de evaluación o recuperación. Es el valor monetario de la garantía.")
  public Integer getValorActivoValuacion() {
    return valorActivoValuacion;
  }
  public void setValorActivoValuacion(Integer valorActivoValuacion) {
    this.valorActivoValuacion = valorActivoValuacion;
  }
  public Credito numeroPagos(Integer numeroPagos) {
    this.numeroPagos = numeroPagos;
    return this;
  }
   
  @ApiModelProperty(example = "2", value = "Total de pagos determinado en la apertura del crédito.")
  public Integer getNumeroPagos() {
    return numeroPagos;
  }
  public void setNumeroPagos(Integer numeroPagos) {
    this.numeroPagos = numeroPagos;
  }
  public Credito frecuenciaPagos(String frecuenciaPagos) {
    this.frecuenciaPagos = frecuenciaPagos;
    return this;
  }
   
  @ApiModelProperty(example = "K", value = "Se reporta la frecuencia en tiempo en que se realizarán los pagos.")
  public String getFrecuenciaPagos() {
    return frecuenciaPagos;
  }
  public void setFrecuenciaPagos(String frecuenciaPagos) {
    this.frecuenciaPagos = frecuenciaPagos;
  }
  public Credito montoPagar(Float montoPagar) {
    this.montoPagar = montoPagar;
    return this;
  }
   
  @ApiModelProperty(example = "6276.0", value = "Es la cantidad que el Consumidor paga en el periodo asignado a la cuenta.")
  public Float getMontoPagar() {
    return montoPagar;
  }
  public void setMontoPagar(Float montoPagar) {
    this.montoPagar = montoPagar;
  }
  public Credito fechaAperturaCuenta(String fechaAperturaCuenta) {
    this.fechaAperturaCuenta = fechaAperturaCuenta;
    return this;
  }
   
  @ApiModelProperty(example = "20012018", value = "La fecha de apertura es la fecha en que el Otorgante reporta la apertura del crédito al consumidor.")
  public String getFechaAperturaCuenta() {
    return fechaAperturaCuenta;
  }
  public void setFechaAperturaCuenta(String fechaAperturaCuenta) {
    this.fechaAperturaCuenta = fechaAperturaCuenta;
  }
  public Credito fechaUltimoPago(String fechaUltimoPago) {
    this.fechaUltimoPago = fechaUltimoPago;
    return this;
  }
   
  @ApiModelProperty(example = "20022018", value = "Fecha más reciente en la que el cliente efectuó un pago.")
  public String getFechaUltimoPago() {
    return fechaUltimoPago;
  }
  public void setFechaUltimoPago(String fechaUltimoPago) {
    this.fechaUltimoPago = fechaUltimoPago;
  }
  public Credito fechaUltimaCompra(String fechaUltimaCompra) {
    this.fechaUltimaCompra = fechaUltimaCompra;
    return this;
  }
   
  @ApiModelProperty(example = "2018-02-26", value = "Fecha más reciente en que el cliente efectuó una compra o disposición de crédito.")
  public String getFechaUltimaCompra() {
    return fechaUltimaCompra;
  }
  public void setFechaUltimaCompra(String fechaUltimaCompra) {
    this.fechaUltimaCompra = fechaUltimaCompra;
  }
  public Credito fechaCierreCuenta(String fechaCierreCuenta) {
    this.fechaCierreCuenta = fechaCierreCuenta;
    return this;
  }
   
  @ApiModelProperty(example = "29042016", value = "Fecha en la que se liquidó o cerró el crédito.")
  public String getFechaCierreCuenta() {
    return fechaCierreCuenta;
  }
  public void setFechaCierreCuenta(String fechaCierreCuenta) {
    this.fechaCierreCuenta = fechaCierreCuenta;
  }
  public Credito fechaReporte(String fechaReporte) {
    this.fechaReporte = fechaReporte;
    return this;
  }
   
  @ApiModelProperty(example = "28022018", value = "Periodo al que corresponde el crédito reportado por el otorgante.")
  public String getFechaReporte() {
    return fechaReporte;
  }
  public void setFechaReporte(String fechaReporte) {
    this.fechaReporte = fechaReporte;
  }
  public Credito modoReporte(String modoReporte) {
    this.modoReporte = modoReporte;
    return this;
  }
   
  @ApiModelProperty(example = "M", value = "")
  public String getModoReporte() {
    return modoReporte;
  }
  public void setModoReporte(String modoReporte) {
    this.modoReporte = modoReporte;
  }
  public Credito ultimaFechaSaldoCero(String ultimaFechaSaldoCero) {
    this.ultimaFechaSaldoCero = ultimaFechaSaldoCero;
    return this;
  }
   
  @ApiModelProperty(example = "01012001", value = "Última fecha en que la cuenta quedó en ceros.")
  public String getUltimaFechaSaldoCero() {
    return ultimaFechaSaldoCero;
  }
  public void setUltimaFechaSaldoCero(String ultimaFechaSaldoCero) {
    this.ultimaFechaSaldoCero = ultimaFechaSaldoCero;
  }
  public Credito garantia(String garantia) {
    this.garantia = garantia;
    return this;
  }
   
  @ApiModelProperty(example = "Seguro de vida SA de CV", value = "Garantía utilizada para asegurar el crédito otorgado.")
  public String getGarantia() {
    return garantia;
  }
  public void setGarantia(String garantia) {
    this.garantia = garantia;
  }
  public Credito creditoMaximo(Float creditoMaximo) {
    this.creditoMaximo = creditoMaximo;
    return this;
  }
   
  @ApiModelProperty(example = "25104.0", value = "Contiene el máximo importe de crédito utilizado por el cliente.")
  public Float getCreditoMaximo() {
    return creditoMaximo;
  }
  public void setCreditoMaximo(Float creditoMaximo) {
    this.creditoMaximo = creditoMaximo;
  }
  public Credito saldoActual(Float saldoActual) {
    this.saldoActual = saldoActual;
    return this;
  }
   
  @ApiModelProperty(example = "14714.0", value = "Saldo del crédito.")
  public Float getSaldoActual() {
    return saldoActual;
  }
  public void setSaldoActual(Float saldoActual) {
    this.saldoActual = saldoActual;
  }
  public Credito limiteCredito(Float limiteCredito) {
    this.limiteCredito = limiteCredito;
    return this;
  }
   
  @ApiModelProperty(example = "0.0", value = "El límite de crédito.")
  public Float getLimiteCredito() {
    return limiteCredito;
  }
  public void setLimiteCredito(Float limiteCredito) {
    this.limiteCredito = limiteCredito;
  }
  public Credito saldoVencido(Float saldoVencido) {
    this.saldoVencido = saldoVencido;
    return this;
  }
   
  @ApiModelProperty(example = "0.0", value = "Saldo vencido de la cuenta.")
  public Float getSaldoVencido() {
    return saldoVencido;
  }
  public void setSaldoVencido(Float saldoVencido) {
    this.saldoVencido = saldoVencido;
  }
  public Credito numeroPagosVencidos(Integer numeroPagosVencidos) {
    this.numeroPagosVencidos = numeroPagosVencidos;
    return this;
  }
   
  @ApiModelProperty(example = "0", value = "Número de pagos vencidos.")
  public Integer getNumeroPagosVencidos() {
    return numeroPagosVencidos;
  }
  public void setNumeroPagosVencidos(Integer numeroPagosVencidos) {
    this.numeroPagosVencidos = numeroPagosVencidos;
  }
  public Credito pagoActual(String pagoActual) {
    this.pagoActual = pagoActual;
    return this;
  }
   
  @ApiModelProperty(example = "01", value = "Pago actual.")
  public String getPagoActual() {
    return pagoActual;
  }
  public void setPagoActual(String pagoActual) {
    this.pagoActual = pagoActual;
  }
  public Credito historicoPagos(String historicoPagos) {
    this.historicoPagos = historicoPagos;
    return this;
  }
   
  @ApiModelProperty(example = "1", value = "Histórico de pagos.")
  public String getHistoricoPagos() {
    return historicoPagos;
  }
  public void setHistoricoPagos(String historicoPagos) {
    this.historicoPagos = historicoPagos;
  }
  public Credito fechaRecienteHistoricoPagos(String fechaRecienteHistoricoPagos) {
    this.fechaRecienteHistoricoPagos = fechaRecienteHistoricoPagos;
    return this;
  }
   
  @ApiModelProperty(example = "16032016", value = "Fecha más reciente del histórico de pagos.")
  public String getFechaRecienteHistoricoPagos() {
    return fechaRecienteHistoricoPagos;
  }
  public void setFechaRecienteHistoricoPagos(String fechaRecienteHistoricoPagos) {
    this.fechaRecienteHistoricoPagos = fechaRecienteHistoricoPagos;
  }
  public Credito fechaAntiguaHistoricoPagos(String fechaAntiguaHistoricoPagos) {
    this.fechaAntiguaHistoricoPagos = fechaAntiguaHistoricoPagos;
    return this;
  }
   
  @ApiModelProperty(example = "16032016", value = "Fecha de inicio del patrón histórico pagos.")
  public String getFechaAntiguaHistoricoPagos() {
    return fechaAntiguaHistoricoPagos;
  }
  public void setFechaAntiguaHistoricoPagos(String fechaAntiguaHistoricoPagos) {
    this.fechaAntiguaHistoricoPagos = fechaAntiguaHistoricoPagos;
  }
  public Credito clavePrevencion(String clavePrevencion) {
    this.clavePrevencion = clavePrevencion;
    return this;
  }
   
  @ApiModelProperty(example = "PC", value = "Identifica la actual situación de la cuenta o crédito.")
  public String getClavePrevencion() {
    return clavePrevencion;
  }
  public void setClavePrevencion(String clavePrevencion) {
    this.clavePrevencion = clavePrevencion;
  }
  public Credito totalPagosReportados(Integer totalPagosReportados) {
    this.totalPagosReportados = totalPagosReportados;
    return this;
  }
   
  @ApiModelProperty(example = "3", value = "Número de pagos reportados")
  public Integer getTotalPagosReportados() {
    return totalPagosReportados;
  }
  public void setTotalPagosReportados(Integer totalPagosReportados) {
    this.totalPagosReportados = totalPagosReportados;
  }
  public Credito moP2(Integer moP2) {
    this.moP2 = moP2;
    return this;
  }
   
  @ApiModelProperty(example = "0", value = "Número de veces en que ha estado con MOP = 02 en la historia del Crédito, máximo 72 meses.")
  public Integer getMoP2() {
    return moP2;
  }
  public void setMoP2(Integer moP2) {
    this.moP2 = moP2;
  }
  public Credito moP3(Integer moP3) {
    this.moP3 = moP3;
    return this;
  }
   
  @ApiModelProperty(example = "0", value = "Número de veces en que ha estado con MOP = 03 en la historia del Crédito, máximo 72 meses.")
  public Integer getMoP3() {
    return moP3;
  }
  public void setMoP3(Integer moP3) {
    this.moP3 = moP3;
  }
  public Credito moP4(Integer moP4) {
    this.moP4 = moP4;
    return this;
  }
   
  @ApiModelProperty(example = "0", value = "Número de veces en que ha estado con MOP = 04 en la historia del Crédito, máximo 72 meses.")
  public Integer getMoP4() {
    return moP4;
  }
  public void setMoP4(Integer moP4) {
    this.moP4 = moP4;
  }
  public Credito moP5(Integer moP5) {
    this.moP5 = moP5;
    return this;
  }
   
  @ApiModelProperty(example = "0", value = "Número de veces en que ha estado con MOP = 05 en la historia del Crédito, máximo 72 meses.")
  public Integer getMoP5() {
    return moP5;
  }
  public void setMoP5(Integer moP5) {
    this.moP5 = moP5;
  }
  public Credito saldoVencidoPeorAtraso(Float saldoVencidoPeorAtraso) {
    this.saldoVencidoPeorAtraso = saldoVencidoPeorAtraso;
    return this;
  }
   
  @ApiModelProperty(example = "0.0", value = "Indica el importe del Saldo en la fecha que la cuenta o crédito tuvo la morosidad más alta en la historia del Crédito, máximo 72 meses, a partir de la fecha actual.")
  public Float getSaldoVencidoPeorAtraso() {
    return saldoVencidoPeorAtraso;
  }
  public void setSaldoVencidoPeorAtraso(Float saldoVencidoPeorAtraso) {
    this.saldoVencidoPeorAtraso = saldoVencidoPeorAtraso;
  }
  public Credito fechaPeorAtraso(String fechaPeorAtraso) {
    this.fechaPeorAtraso = fechaPeorAtraso;
    return this;
  }
   
  @ApiModelProperty(example = "01012000", value = "Fecha en la que el cliente tuvo su peor atraso.")
  public String getFechaPeorAtraso() {
    return fechaPeorAtraso;
  }
  public void setFechaPeorAtraso(String fechaPeorAtraso) {
    this.fechaPeorAtraso = fechaPeorAtraso;
  }
  public Credito peorAtraso(Float peorAtraso) {
    this.peorAtraso = peorAtraso;
    return this;
  }
   
  @ApiModelProperty(example = "0.0", value = "Mayor cantidad de pagos incumplidos en el histórico del cliente.")
  public Float getPeorAtraso() {
    return peorAtraso;
  }
  public void setPeorAtraso(Float peorAtraso) {
    this.peorAtraso = peorAtraso;
  }
  public Credito fechaInicioReestructura(String fechaInicioReestructura) {
    this.fechaInicioReestructura = fechaInicioReestructura;
    return this;
  }
   
  @ApiModelProperty(example = "01012000", value = "Indica la fecha acerca de la Reestructura")
  public String getFechaInicioReestructura() {
    return fechaInicioReestructura;
  }
  public void setFechaInicioReestructura(String fechaInicioReestructura) {
    this.fechaInicioReestructura = fechaInicioReestructura;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Credito credito = (Credito) o;
    return Objects.equals(this.fechaActualizacion, credito.fechaActualizacion) &&
        Objects.equals(this.registroImpugnado, credito.registroImpugnado) &&
        Objects.equals(this.claveOtorgante, credito.claveOtorgante) &&
        Objects.equals(this.nombreOtorgante, credito.nombreOtorgante) &&
        Objects.equals(this.telefonoOtorgante, credito.telefonoOtorgante) &&
        Objects.equals(this.cuentaActual, credito.cuentaActual) &&
        Objects.equals(this.tipoResponsabilidad, credito.tipoResponsabilidad) &&
        Objects.equals(this.tipoCuenta, credito.tipoCuenta) &&
        Objects.equals(this.tipoCredito, credito.tipoCredito) &&
        Objects.equals(this.claveUnidadMonetaria, credito.claveUnidadMonetaria) &&
        Objects.equals(this.valorActivoValuacion, credito.valorActivoValuacion) &&
        Objects.equals(this.numeroPagos, credito.numeroPagos) &&
        Objects.equals(this.frecuenciaPagos, credito.frecuenciaPagos) &&
        Objects.equals(this.montoPagar, credito.montoPagar) &&
        Objects.equals(this.fechaAperturaCuenta, credito.fechaAperturaCuenta) &&
        Objects.equals(this.fechaUltimoPago, credito.fechaUltimoPago) &&
        Objects.equals(this.fechaUltimaCompra, credito.fechaUltimaCompra) &&
        Objects.equals(this.fechaCierreCuenta, credito.fechaCierreCuenta) &&
        Objects.equals(this.fechaReporte, credito.fechaReporte) &&
        Objects.equals(this.modoReporte, credito.modoReporte) &&
        Objects.equals(this.ultimaFechaSaldoCero, credito.ultimaFechaSaldoCero) &&
        Objects.equals(this.garantia, credito.garantia) &&
        Objects.equals(this.creditoMaximo, credito.creditoMaximo) &&
        Objects.equals(this.saldoActual, credito.saldoActual) &&
        Objects.equals(this.limiteCredito, credito.limiteCredito) &&
        Objects.equals(this.saldoVencido, credito.saldoVencido) &&
        Objects.equals(this.numeroPagosVencidos, credito.numeroPagosVencidos) &&
        Objects.equals(this.pagoActual, credito.pagoActual) &&
        Objects.equals(this.historicoPagos, credito.historicoPagos) &&
        Objects.equals(this.fechaRecienteHistoricoPagos, credito.fechaRecienteHistoricoPagos) &&
        Objects.equals(this.fechaAntiguaHistoricoPagos, credito.fechaAntiguaHistoricoPagos) &&
        Objects.equals(this.clavePrevencion, credito.clavePrevencion) &&
        Objects.equals(this.totalPagosReportados, credito.totalPagosReportados) &&
        Objects.equals(this.moP2, credito.moP2) &&
        Objects.equals(this.moP3, credito.moP3) &&
        Objects.equals(this.moP4, credito.moP4) &&
        Objects.equals(this.moP5, credito.moP5) &&
        Objects.equals(this.saldoVencidoPeorAtraso, credito.saldoVencidoPeorAtraso) &&
        Objects.equals(this.fechaPeorAtraso, credito.fechaPeorAtraso) &&
        Objects.equals(this.peorAtraso, credito.peorAtraso) &&
        Objects.equals(this.fechaInicioReestructura, credito.fechaInicioReestructura);
  }
  @Override
  public int hashCode() {
    return Objects.hash(fechaActualizacion, registroImpugnado, claveOtorgante, nombreOtorgante, telefonoOtorgante, cuentaActual, tipoResponsabilidad, tipoCuenta, tipoCredito, claveUnidadMonetaria, valorActivoValuacion, numeroPagos, frecuenciaPagos, montoPagar, fechaAperturaCuenta, fechaUltimoPago, fechaUltimaCompra, fechaCierreCuenta, fechaReporte, modoReporte, ultimaFechaSaldoCero, garantia, creditoMaximo, saldoActual, limiteCredito, saldoVencido, numeroPagosVencidos, pagoActual, historicoPagos, fechaRecienteHistoricoPagos, fechaAntiguaHistoricoPagos, clavePrevencion, totalPagosReportados, moP2, moP3, moP4, moP5, saldoVencidoPeorAtraso, fechaPeorAtraso, peorAtraso, fechaInicioReestructura);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Credito {\n");
    
    sb.append("    fechaActualizacion: ").append(toIndentedString(fechaActualizacion)).append("\n");
    sb.append("    registroImpugnado: ").append(toIndentedString(registroImpugnado)).append("\n");
    sb.append("    claveOtorgante: ").append(toIndentedString(claveOtorgante)).append("\n");
    sb.append("    nombreOtorgante: ").append(toIndentedString(nombreOtorgante)).append("\n");
    sb.append("    telefonoOtorgante: ").append(toIndentedString(telefonoOtorgante)).append("\n");
    sb.append("    cuentaActual: ").append(toIndentedString(cuentaActual)).append("\n");
    sb.append("    tipoResponsabilidad: ").append(toIndentedString(tipoResponsabilidad)).append("\n");
    sb.append("    tipoCuenta: ").append(toIndentedString(tipoCuenta)).append("\n");
    sb.append("    tipoCredito: ").append(toIndentedString(tipoCredito)).append("\n");
    sb.append("    claveUnidadMonetaria: ").append(toIndentedString(claveUnidadMonetaria)).append("\n");
    sb.append("    valorActivoValuacion: ").append(toIndentedString(valorActivoValuacion)).append("\n");
    sb.append("    numeroPagos: ").append(toIndentedString(numeroPagos)).append("\n");
    sb.append("    frecuenciaPagos: ").append(toIndentedString(frecuenciaPagos)).append("\n");
    sb.append("    montoPagar: ").append(toIndentedString(montoPagar)).append("\n");
    sb.append("    fechaAperturaCuenta: ").append(toIndentedString(fechaAperturaCuenta)).append("\n");
    sb.append("    fechaUltimoPago: ").append(toIndentedString(fechaUltimoPago)).append("\n");
    sb.append("    fechaUltimaCompra: ").append(toIndentedString(fechaUltimaCompra)).append("\n");
    sb.append("    fechaCierreCuenta: ").append(toIndentedString(fechaCierreCuenta)).append("\n");
    sb.append("    fechaReporte: ").append(toIndentedString(fechaReporte)).append("\n");
    sb.append("    modoReporte: ").append(toIndentedString(modoReporte)).append("\n");
    sb.append("    ultimaFechaSaldoCero: ").append(toIndentedString(ultimaFechaSaldoCero)).append("\n");
    sb.append("    garantia: ").append(toIndentedString(garantia)).append("\n");
    sb.append("    creditoMaximo: ").append(toIndentedString(creditoMaximo)).append("\n");
    sb.append("    saldoActual: ").append(toIndentedString(saldoActual)).append("\n");
    sb.append("    limiteCredito: ").append(toIndentedString(limiteCredito)).append("\n");
    sb.append("    saldoVencido: ").append(toIndentedString(saldoVencido)).append("\n");
    sb.append("    numeroPagosVencidos: ").append(toIndentedString(numeroPagosVencidos)).append("\n");
    sb.append("    pagoActual: ").append(toIndentedString(pagoActual)).append("\n");
    sb.append("    historicoPagos: ").append(toIndentedString(historicoPagos)).append("\n");
    sb.append("    fechaRecienteHistoricoPagos: ").append(toIndentedString(fechaRecienteHistoricoPagos)).append("\n");
    sb.append("    fechaAntiguaHistoricoPagos: ").append(toIndentedString(fechaAntiguaHistoricoPagos)).append("\n");
    sb.append("    clavePrevencion: ").append(toIndentedString(clavePrevencion)).append("\n");
    sb.append("    totalPagosReportados: ").append(toIndentedString(totalPagosReportados)).append("\n");
    sb.append("    moP2: ").append(toIndentedString(moP2)).append("\n");
    sb.append("    moP3: ").append(toIndentedString(moP3)).append("\n");
    sb.append("    moP4: ").append(toIndentedString(moP4)).append("\n");
    sb.append("    moP5: ").append(toIndentedString(moP5)).append("\n");
    sb.append("    saldoVencidoPeorAtraso: ").append(toIndentedString(saldoVencidoPeorAtraso)).append("\n");
    sb.append("    fechaPeorAtraso: ").append(toIndentedString(fechaPeorAtraso)).append("\n");
    sb.append("    peorAtraso: ").append(toIndentedString(peorAtraso)).append("\n");
    sb.append("    fechaInicioReestructura: ").append(toIndentedString(fechaInicioReestructura)).append("\n");
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
