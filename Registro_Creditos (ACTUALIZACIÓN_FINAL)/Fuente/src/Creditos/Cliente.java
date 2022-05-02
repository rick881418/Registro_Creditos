package Creditos;

import java.util.Date;

public class Cliente extends Persona{
    private  boolean es_cliente;
    private String correo;
    private boolean tiene_recibo_luz;
    private boolean tiene_recibo_agua;
    private boolean tiene_recibo_telefono;
    private boolean es_pago_efectivo;
    private String banco;
    private int numero_cuenta;
    private int numero_cci;
    private double descuento_cliente;

    public Cliente() {
    }

    public Cliente(String codigo_persona, String nombres, String apellido_paterno, String apellido_materno, String tipo_documento, int numero_documento, String estado_civil, String sexo, String fecha_nacimiento, String distrito, String direccion, boolean es_cliente, String correo, boolean tiene_recibo_luz, boolean tiene_recibo_agua, boolean tiene_recibo_telefono, boolean es_pago_efectivo, String banco, int numero_cuenta, int numero_cci) {
        super(codigo_persona, nombres, apellido_paterno, apellido_materno, tipo_documento, numero_documento, estado_civil, sexo, fecha_nacimiento, distrito, direccion);
        this.es_cliente = es_cliente;
        this.correo = correo;
        this.tiene_recibo_luz = tiene_recibo_luz;
        this.tiene_recibo_agua = tiene_recibo_agua;
        this.tiene_recibo_telefono = tiene_recibo_telefono;
        this.es_pago_efectivo = es_pago_efectivo;
        this.banco = banco;
        this.numero_cuenta = numero_cuenta;
        this.numero_cci = numero_cci;
        this.descuento_cliente = CalcularDescuento();
    }

    public boolean isEs_cliente() {
        return es_cliente;
    }

    public void setEs_cliente(boolean es_cliente) {
        this.es_cliente = es_cliente;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean isTiene_recibo_luz() {
        return tiene_recibo_luz;
    }

    public void setTiene_recibo_luz(boolean tiene_recibo_luz) {
        this.tiene_recibo_luz = tiene_recibo_luz;
    }

    public boolean isTiene_recibo_agua() {
        return tiene_recibo_agua;
    }

    public void setTiene_recibo_agua(boolean tiene_recibo_agua) {
        this.tiene_recibo_agua = tiene_recibo_agua;
    }

    public boolean isTiene_recibo_telefono() {
        return tiene_recibo_telefono;
    }

    public void setTiene_recibo_telefono(boolean tiene_recibo_telefono) {
        this.tiene_recibo_telefono = tiene_recibo_telefono;
    }

    public boolean isEs_pago_efectivo() {
        return es_pago_efectivo;
    }

    public void setEs_pago_efectivo(boolean es_pago_efectivo) {
        this.es_pago_efectivo = es_pago_efectivo;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(int numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public int getNumero_cci() {
        return numero_cci;
    }

    public void setNumero_cci(int numero_cci) {
        this.numero_cci = numero_cci;
    }

    public double getDescuento_cliente() {
        return descuento_cliente;
    }

    public void setDescuento_cliente(double descuento_cliente) {
        this.descuento_cliente = descuento_cliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + super.toString() +
                ", es_cliente=" + es_cliente +
                ", correo='" + correo + '\'' +
                ", tiene_recibo_luz=" + tiene_recibo_luz +
                ", tiene_recibo_agua=" + tiene_recibo_agua +
                ", tiene_recibo_telefono=" + tiene_recibo_telefono +
                ", es_pago_efectivo=" + es_pago_efectivo +
                ", banco='" + banco + '\'' +
                ", numero_cuenta=" + numero_cuenta +
                ", numero_cci=" + numero_cci +
                ", descuento_cliente=" + descuento_cliente +
                '}';
    }

    @Override
    public double CalcularDescuento(){
        double descuento;

        //Si es cliente prestaclub aplica un 5% de descuento
        if (es_cliente) {
            descuento = 3.5;
        }
        else    {
            descuento = 0;
        }
        return descuento;
    }
}
