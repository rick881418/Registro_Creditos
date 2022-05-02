package Creditos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Persona {
    private String codigo_persona;
    private String nombres;
    private String apellido_paterno;
    private String apellido_materno;
    private String tipo_documento;
    private int numero_documento;
    private String estado_civil;
    private String sexo;
    private String fecha_nacimiento;
    private String distrito;
    private String direccion;
    //private Date fecha_registro;
    private List<Joya> listaJoyas;

    public Persona() {
    }

    public Persona(String codigo_persona, String nombres, String apellido_materno, String apellido_paterno, String tipo_documento, int numero_documento, String estado_civil, String sexo, String fecha_nacimiento, String distrito, String direccion) {
        this.codigo_persona = codigo_persona;
        this.nombres = nombres;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.tipo_documento = tipo_documento;
        this.numero_documento = numero_documento;
        this.estado_civil = estado_civil;
        this.sexo = sexo;
        this.fecha_nacimiento = fecha_nacimiento;
        this.distrito = distrito;
        this.direccion = direccion;
        //this.fecha_registro = fecha_registro;
        listaJoyas = new ArrayList<>();
    }

    public String getCodigo_persona() {
        return codigo_persona;
    }

    public void setCodigo_persona(String codigo_persona) {
        this.codigo_persona = codigo_persona;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public int getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(int numero_documento) {
        this.numero_documento = numero_documento;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Joya> getListaJoyas() {
        return listaJoyas;
    }

    public void setListaJoyas(List<Joya> listaJoyas) {
        this.listaJoyas = listaJoyas;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "codigo_persona='" + codigo_persona + '\'' +
                ", nombres='" + nombres + '\'' +
                ", apellido_paterno='" + apellido_paterno + '\'' +
                ", apellido_materno='" + apellido_materno + '\'' +
                ", tipo_documento='" + tipo_documento + '\'' +
                ", numero_documento=" + numero_documento +
                ", estado_civil='" + estado_civil + '\'' +
                ", sexo='" + sexo + '\'' +
                ", fecha_nacimiento=" + fecha_nacimiento +
                ", distrito='" + distrito + '\'' +
                ", direccion='" + direccion + '\'' +
                ", joyas='" + listaJoyas.size() + '\'' +
                '}';
    }

    public abstract double CalcularDescuento();
}
