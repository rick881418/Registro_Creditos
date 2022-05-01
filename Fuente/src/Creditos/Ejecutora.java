package Creditos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Ejecutora {
    public static void main(String[] args) {
        boolean conError = false;

        try{
            Administracion_Persona objAdmPersona = new Administracion_Persona();

            //**********REGISTRO 1**********//
            //Registrar Joyas
            Joya objJoya1 = new Joya(); //Joya("J001","Aro de oro", "Desgastado", 18, 10,213);
            objJoya1.setCodigo_joya("J001");
            objJoya1.setDescripcion("Aro de oro");
            objJoya1.setObservacion("Desgastado");
            objJoya1.setKilataje(18);
            objJoya1.setPeso(10);
            objJoya1.setPrecio_oro(213);
            objAdmPersona.RegistrarJoya(objJoya1);

            Joya objJoya2 = new Joya();//Joya("J002","Pulcera de oro", "Con piedras de cuarzo", 18, 10,213);
            objJoya2.setCodigo_joya("J002");
            objJoya2.setDescripcion("Pulcera de oro");
            objJoya2.setObservacion("Con piedras de cuarzo");
            objJoya2.setKilataje(18);
            objJoya2.setPeso(10);
            objJoya2.setPrecio_oro(213);
            objAdmPersona.RegistrarJoya(objJoya2);
            //Listar Joyas
            objAdmPersona.ListarJoyas();

            //Registrar Cliente
            Cliente objCliente1 = new Cliente("CLI001","EDWIN", "COSTILLA", "BRINGAS", "DNI", 10287497, "Casado", "Masculino", "08/03/1977", "Surco", "Av. Don Diego de Día 254", true, "pecostilla@yahoo.com", true, true, true, true, "", 0, 0);
            objAdmPersona.RegistrarPersona(objCliente1);

            //**********REGISTRO 2**********//
            //Registrar Joyas
            Joya objJoya3 = new Joya("J003","Cadena de oro", "Nueva", 18, 20,213);
            /*
            Joya objJoya3 = new Joya();//Joya("J003","Cadena de oro", "Nueva", 18, 20,213);
            objJoya3.setCodigo_joya("J003");
            objJoya3.setDescripcion("Cadena de oro");
            objJoya3.setObservacion("Nueva");
            objJoya3.setKilataje(18);
            objJoya3.setPeso(20);
            objJoya3.setPrecio_oro(213);
             */
            objAdmPersona.RegistrarJoya(objJoya3);
            //Listar Joyas
            objAdmPersona.ListarJoyas();

            //Registrar Cliente
            Cliente objCliente2 = new Cliente("CLI002","JOSE", "COSTILLA", "AGUIRRE", "DNI", 14578588, "Soltero", "Masculino", "14/01/2010", "La Molina", "Ca. Arequipa 394", false, "jose@gmai.com", true, true, false, false, "BCP", 123456, 123456780);
            objAdmPersona.RegistrarPersona(objCliente2);

            //**********REGISTRO 3**********//
            //Registrar Joyas
            Joya objJoya4 = new Joya(); //Joya("J004","Gargantilla de oro", "Nueva", 18, 5,213);
            objJoya4.setCodigo_joya("J004");
            objJoya4.setDescripcion("Gargantilla de oro");
            objJoya4.setObservacion("Nueva");
            objJoya4.setKilataje(18);
            objJoya4.setPeso(5);
            objJoya4.setPrecio_oro(213);
            objAdmPersona.RegistrarJoya(objJoya4);

            Joya objJoya5 = new Joya(); //Joya("J005","Aretes de oro", "Con piedras", 18, 4,213);
            objJoya5.setCodigo_joya("J005");
            objJoya5.setDescripcion("Aretes de oro");
            objJoya5.setObservacion("Con piedras");
            objJoya5.setKilataje(18);
            objJoya5.setPeso(4);
            objJoya5.setPrecio_oro(213);
            objAdmPersona.RegistrarJoya(objJoya5);

            Joya objJoya6 = new Joya(); //Joya("J006","Sortija de compromiso de oro", "Con piedra", 18, 12,213);
            objJoya6.setCodigo_joya("J006");
            objJoya6.setDescripcion("Sortija de compromiso de oro");
            objJoya6.setObservacion("Con piedra");
            objJoya6.setKilataje(18);
            objJoya6.setPeso(12);
            objJoya6.setPrecio_oro(213);
            objAdmPersona.RegistrarJoya(objJoya6);
            //Listar Joyas
            objAdmPersona.ListarJoyas();

            //Registrar Cliente
            Cliente objCliente3 = new Cliente("CLI003","CCCC", "EEEEEEE", "FFFFFF", "DNI", 12345678, "Casado", "Masculino", "08/03/1977", "Surco", "Av. Don Diego de Día 254", true, "pecostilla@yahoo.com", true, true, true, true, "", 0, 0);
            objAdmPersona.RegistrarPersona(objCliente3);

            //**********REGISTRO 3**********//
            //Registrar Joyas
            Joya objJoya7 = new Joya();
            objJoya7.setCodigo_joya("J007");
            objJoya7.setDescripcion("Reloj de oro");
            objJoya7.setObservacion("Rolex analogo, sin funcionamiento");
            objJoya7.setKilataje(18);
            objJoya7.setPeso(7);
            objJoya7.setPrecio_oro(213);
            objAdmPersona.RegistrarJoya(objJoya7);
            //Listar Joyas
            objAdmPersona.ListarJoyas();
            //Registrar Cliente
            Cliente objCliente4 = new Cliente("CLI004","xxx", "wddw", "eee", "ce", 55677, "Divorciado", "Masculino", "04/03/2000", "ddd", "Av. Don Diego de Día 254", true, "dddd@yahoo.com", true, true, true, true, "", 0, 0);
            objAdmPersona.RegistrarPersona(objCliente4);

            //**************************************************************//
            //REPORTES
            //**************************************************************//
            //Listado de Clientes o Trabajadores
            objAdmPersona.ListarPersonas();

            //Listado de Joyas x Clientes
            objAdmPersona.ListarJoyasXCliente ("CLI001");
            objAdmPersona.ListarJoyasXCliente ("CLI002");
            objAdmPersona.ListarJoyasXCliente ("CLI003");
            objAdmPersona.ListarJoyasXCliente ("CLI004");


        } catch (Exception ex){
            conError = true;
            System.out.println(ex.getMessage());
        }finally {
            if(conError){
                System.out.println("Se han encontrado errores en el registro de datos, por favor verificar.");
            }else {
                System.out.println("El programa ha finalizado.");
            }
        }

    }
}
