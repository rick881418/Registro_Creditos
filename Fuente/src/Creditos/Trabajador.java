package Creditos;

import java.util.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Trabajador extends Persona{
    private String codigo;
    private String correo_emp;
    private int numero_dias_actividad;
    private boolean es_activo;
    private double descuento;
    //private Date fecha_ingreso;
    //private Date fecha_cese;

    public Trabajador(String codigo_persona, String nombres, String apellido_materno, String apellido_paterno, String tipo_documento, int numero_documento, String estado_civil, String sexo, String fecha_nacimiento, String distrito, String direccion, String codigo, String correo_emp, int numero_dias_actividad, boolean es_activo) {
        super(codigo_persona, nombres, apellido_materno, apellido_paterno, tipo_documento, numero_documento, estado_civil, sexo, fecha_nacimiento, distrito, direccion);
        this.codigo = codigo;
        this.correo_emp = correo_emp;
        this.numero_dias_actividad = numero_dias_actividad;
        this.es_activo = es_activo;
        descuento = CalcularDescuento();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCorreo_emp() {
        return correo_emp;
    }

    public void setCorreo_emp(String correo_emp) {
        this.correo_emp = correo_emp;
    }

    public int getNumero_dias_actividad() {
        return numero_dias_actividad;
    }

    public void setNumero_dias_actividad(int numero_dias_actividad) {
        this.numero_dias_actividad = numero_dias_actividad;
    }

    public boolean isEs_activo() {
        return es_activo;
    }

    public void setEs_activo(boolean es_activo) {
        this.es_activo = es_activo;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "codigo='" + codigo + '\'' +
                ", correo_emp='" + correo_emp + '\'' +
                ", numero_dias_actividad=" + numero_dias_actividad +
                ", activo=" + es_activo +
                '}';
    }

    @Override
    public double CalcularDescuento(){
        double descuento = 0;

        if (es_activo){
            if (numero_dias_actividad > 360){
                descuento = 7;
            }
        }
        return descuento;
    }


}
