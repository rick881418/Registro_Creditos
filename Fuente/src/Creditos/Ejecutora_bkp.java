package Creditos;

public class Ejecutora_bkp {
    public static void main(String[] args) {
        boolean conError = false;

        try{
            Administracion_Persona objAdmPersona = new Administracion_Persona();

            Joya objJoya1 = new Joya("J001","Aro de oro", "Desgastado", 18, 10,213);
            Joya objJoya2 = new Joya("J002","Pulcera de oro", "Con piedras de cuarzo", 18, 0,213);
            //Registrar Joyas
            objAdmPersona.RegistrarJoya(objJoya1);
            objAdmPersona.RegistrarJoya(objJoya2);
            //Listar Joyas
            objAdmPersona.ListarJoyas();
            //Registrar Cliente
            Cliente objCliente1 = new Cliente("CLI001","EDWIN", "COSTILLA", "BRINGAS", "DNI", 10287497, "Casado", "Masculino", "08/03/1977", "Surco", "Av. Don Diego de Día 254", true, "pecostilla@yahoo.com", true, true, true, true, "", 0, 0);
            objAdmPersona.RegistrarPersona(objCliente1);

            //Registrar Joyas
            Joya objJoya3 = new Joya("J003","Cadena de oro", "NUeva", 18, 20,213);
            objAdmPersona.RegistrarJoya(objJoya3);
            objAdmPersona.ListarJoyas();
            //Registrar Cliente
            Cliente objCliente2 = new Cliente("CLI002","JOSE", "COSTILLA", "AGUIRRE", "DNI", 14578588, "Soltero", "Masculino", "14/01/2010", "La Molina", "Ca. Arequipa 394", false, "jose@gmai.com", true, true, false, false, "BCP", 123456, 123456780);
            objAdmPersona.RegistrarPersona(objCliente2);

            Joya objJoya4 = new Joya("J004","Gargantilla de oro", "Nueva", 18, 5,213);
            Joya objJoya5 = new Joya("J005","Aretes de oro", "Con piedras", 18, 4,213);
            Joya objJoya6 = new Joya("J006","Sortija de compromiso de oro", "Con piedra", 18, 12,213);
            //Registrar Joyas
            objAdmPersona.RegistrarJoya(objJoya4);
            objAdmPersona.RegistrarJoya(objJoya5);
            objAdmPersona.RegistrarJoya(objJoya6);
            //Listar Joyas
            objAdmPersona.ListarJoyas();
            //Registrar Cliente
            Cliente objCliente3 = new Cliente("CLI003","CCCC", "EEEEEEE", "FFFFFF", "DNI", 12345678, "Casado", "Masculino", "08/03/1977", "Surco", "Av. Don Diego de Día 254", true, "pecostilla@yahoo.com", true, true, true, true, "", 0, 0);
            objAdmPersona.RegistrarPersona(objCliente3);


            Joya objJoya7 = new Joya();
            objJoya7.setCodigo_joya("J007");
            objJoya7.setDescripcion("Reloj de oro");
            objJoya7.setObservacion("Rolex analogo, sin funcionamiento");
            objJoya7.setKilataje(18);
            objJoya7.setPeso(7);
            objJoya7.setPrecio_oro(213);
            //Registrar Joyas
            objAdmPersona.RegistrarJoya(objJoya7);
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
