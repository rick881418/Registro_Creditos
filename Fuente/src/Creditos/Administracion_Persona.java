package Creditos;

import java.util.ArrayList;
import java.util.List;

public class Administracion_Persona {
    private ArrayList<Persona> listaPersonas;
    private ArrayList<Joya> listaJoyas;

    public Administracion_Persona() {
        listaPersonas = new ArrayList<>();
        listaJoyas = new ArrayList<>();
    }

    public void RegistrarJoya(Joya objJoya){
        listaJoyas.add(objJoya);
    }

    public void RegistrarPersona(Persona objPersona){
        try{
            listaPersonas.add(objPersona);
            objPersona.setListaJoyas(listaJoyas);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }finally {
           listaJoyas = new ArrayList<>();
        }

    }

    public void ListarJoyas(){
        try {
            listaJoyas.size();

            for (Joya objJoya: listaJoyas){
                System.out.println(objJoya.toString());
            }
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }

    public void ListarPersonas(){
        try {
            for (Persona objPersona: listaPersonas){
                System.out.println(objPersona.toString());
            }
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }

    public void ListarJoyasXCliente(String codigo_cliente){
        List<Joya> lstJoyasXCliente = new ArrayList<>();

        for(Persona objPersona: listaPersonas){
            if (objPersona.getCodigo_persona().equals(codigo_cliente)) {
                lstJoyasXCliente = objPersona.getListaJoyas();
                System.out.println("Cliente: " + codigo_cliente + " | Nombres: " + objPersona.getNombres() + " | Cantidad de Joya(s): " + lstJoyasXCliente.size());
            }
        }

        if (lstJoyasXCliente.size() > 0){
            for (Joya objJoya: lstJoyasXCliente){
                System.out.println("Joya: " +
                                    " Codigo: " + objJoya.getCodigo_joya() +
                                    " | Descripcion: " + objJoya.getDescripcion() +
                                    " | Observacion: " + objJoya.getObservacion() +
                                    " | Kilataje: " + objJoya.getKilataje() +
                                    " | Peso: " + objJoya.getPeso() +
                                    " | Costo: " + objJoya.getCosto());
            }
        }

    }
}
