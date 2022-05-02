package Creditos;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Administracion_Persona {
    private ArrayList<Persona> listaPersonas;
    private ArrayList<Joya> listaJoyas;

    public Administracion_Persona() {
        listaPersonas = new ArrayList<>();
        listaJoyas = new ArrayList<>();
    }

    public void addJoya(Joya objJoya)  {
        try {
            objJoya.setCodigo_joya(JOptionPane.showInputDialog("Digita el codigo de la joya: "));
            objJoya.setDescripcion(JOptionPane.showInputDialog("Digita la descripcion de la joya: "));
            objJoya.setObservacion(JOptionPane.showInputDialog("Digita la observacion de la joya: "));
            objJoya.setKilataje(Integer.parseInt(JOptionPane.showInputDialog("Digita el kilataje de la joya: ")));
            objJoya.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digita el peso de la joya: ")));
            objJoya.setPrecio_oro(Double.parseDouble(JOptionPane.showInputDialog("Digita el precio de la joya: ")));
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public void addCliente(Cliente objCliente){
        try {
            objCliente.setCodigo_persona(JOptionPane.showInputDialog("Digita el codigo del cliente: "));
            objCliente.setNombres(JOptionPane.showInputDialog("Digita el nombre del cliente: "));
            objCliente.setApellido_paterno(JOptionPane.showInputDialog("Digita el apellido paterno cliente: "));
            objCliente.setApellido_materno(JOptionPane.showInputDialog("Digita el apellido materno cliente: "));
            objCliente.setTipo_documento(JOptionPane.showInputDialog("Digita el tipo de documento: "));
            objCliente.setNumero_documento(Integer.parseInt(JOptionPane.showInputDialog("Digita el numero de documento: ")));
            objCliente.setEstado_civil(JOptionPane.showInputDialog("Digita el estado civil: "));
            objCliente.setSexo(JOptionPane.showInputDialog("Digita el Sexo: "));
            objCliente.setFecha_nacimiento(JOptionPane.showInputDialog("Digita fecha nacimiento: "));
            objCliente.setDistrito(JOptionPane.showInputDialog("Digita el Distrito: "));
            objCliente.setDireccion(JOptionPane.showInputDialog("Digita la Direccion: "));
            objCliente.setEs_cliente(Boolean.parseBoolean(JOptionPane.showInputDialog("Digita si es cliente antiguo: ")));
            objCliente.setCorreo(JOptionPane.showInputDialog("Digita el correo del cliente: "));
            objCliente.setTiene_recibo_luz(Boolean.parseBoolean(JOptionPane.showInputDialog("Digita si tiene luz: ")));
            objCliente.setTiene_recibo_agua(Boolean.parseBoolean(JOptionPane.showInputDialog("Digita si tiene agua: ")));
            objCliente.setTiene_recibo_telefono(Boolean.parseBoolean(JOptionPane.showInputDialog("Digita si tiene telefono: ")));
            objCliente.setEs_pago_efectivo(Boolean.parseBoolean(JOptionPane.showInputDialog("Digita en efectivo: ")));
            objCliente.setBanco(JOptionPane.showInputDialog("Digita el nombre del banco: "));
            objCliente.setNumero_cuenta(Integer.parseInt(JOptionPane.showInputDialog("Digita el numero de cuenta del cliente: ")));
            objCliente.setNumero_cci(Integer.parseInt(JOptionPane.showInputDialog("Digita el numero de cci del cliente: ")));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void findJoyasXPersona(){
        try {
            String codCliente;

            System.out.println("Entro");
            codCliente = JOptionPane.showInputDialog("Digita el codigo de cliente: ");
            ListarJoyasXCliente(codCliente);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

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
        try{
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

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}
