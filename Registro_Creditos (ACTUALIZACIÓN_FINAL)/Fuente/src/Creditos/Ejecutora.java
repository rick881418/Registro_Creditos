package Creditos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import java.util.InputMismatchException;
import javax.swing.JOptionPane;

public class Ejecutora {
    public static void main(String[] args) {
        boolean conError = false;

        //byte opcion = 0;
        boolean salir = false;

        Administracion_Persona objAdmPersona = new Administracion_Persona();



        while(!salir) {
            byte opcion = Byte.parseByte(JOptionPane.showInputDialog("***MENU PRINCIPAL***\n1. Ingresar Joya\n2. Listar Joyas\n3. Ingresar Cliente\n4. Listar  Clientes\n5. Listas Joyas por Cliente\n6. Salir\nElija su opción"));

            try {
                //System.out.println("Introduce un numero: ");
                switch (opcion) {
                    case 1:
                        try{
                            Joya objJoya = new Joya();
                            objAdmPersona.addJoya(objJoya);
                            objAdmPersona.RegistrarJoya(objJoya);
                        } catch (Exception ex) {
                            conError = true;
                            System.out.println("Error Joya: " + ex.getMessage());
                        }
                        break;
                    case 2:
                        objAdmPersona.ListarJoyas();
                        break;
                    case 3:
                        Cliente objCliente = new Cliente();
                        objAdmPersona.addCliente(objCliente);
                        objAdmPersona.RegistrarPersona(objCliente);
                        break;
                    case 4:
                        objAdmPersona.ListarPersonas();
                        break;
                    case 5:
                        objAdmPersona.findJoyasXPersona();
                        //objAdmPersona.ListarJoyasXCliente(objAdmPersona.findJoyasXPersona());
                        break;
                    case 6:
                        salir = true;
                        break;
                    default:
                        System.out.println("Las opciones son entre 1 y 6");
                }
            } catch (InputMismatchException var5) {
                System.out.println("Debes escribir un numero");
            }
        }


    }
}
