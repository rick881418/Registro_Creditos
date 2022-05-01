package Creditos;

import java.time.LocalDateTime;
import java.util.Date;

public class Joya {
    private String codigo_joya;
    private String descripcion;
    private String observacion;
    private int Kilataje;
    private double peso;
    private double precio_oro;
    private double costo;
    //private Date fecha_registro;


    public Joya() {
    }

    public Joya(String codigo_joya, String descripcion, String observacion, int kilataje, double peso, double precio_oro) {
        this.codigo_joya = codigo_joya;
        this.descripcion = descripcion;
        this.observacion = observacion;
        this.Kilataje = kilataje;
        this.peso = peso;
        this.precio_oro = precio_oro;
        this.costo = CalcularPrecio();
    }

    public String getCodigo_joya() {
        return codigo_joya;
    }

    public void setCodigo_joya(String codigo_joya) {
        this.codigo_joya = codigo_joya;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public int getKilataje() {
        return Kilataje;
    }

    public void setKilataje(int kilataje) throws Exception{
        if (kilataje <= 0){
            throw new Exception("Error Registro de Joya " + codigo_joya + ". El Kilataje de la Joya no puede tener un valor menor o igual a 0");
        }
        else {
            Kilataje = kilataje;
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) throws  Exception{
        if (peso <= 0){
            throw new Exception("Error Registro de Joya " + codigo_joya + ". El peso de la Joya no puede tener un valor menor o igual a 0");
        }else {
            this.peso = peso;
            this.setCosto(CalcularPrecio());
        }

    }

    public double getPrecio_oro() {
        return precio_oro;
    }

    public void setPrecio_oro(double precio_oro) throws Exception{
        if(precio_oro<=0){
            throw new Exception("Error Registro de Joya " + codigo_joya + ". El peso de la Joya no puede tener un valor menor o igual a 0");
        }
        else {
            this.precio_oro = precio_oro;
            this.setCosto(CalcularPrecio());
        }
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Joya{" +
                "codigo_joya='" + codigo_joya + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", observacion='" + observacion + '\'' +
                ", Kilataje=" + Kilataje +
                ", peso=" + peso +
                ", precio_oro=" + precio_oro +
                ", costo=" + costo +
                '}';
    }

    private double CalcularPrecio(){
        double CostoJoya = 0;

        CostoJoya = (this.peso * this.precio_oro);

        return CostoJoya;
    }
}
