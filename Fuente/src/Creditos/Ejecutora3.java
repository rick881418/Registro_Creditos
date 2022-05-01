package Creditos;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.Scanner;


public class Ejecutora3 {
    private static Scanner sc = new Scanner(System.in);
    private static int filas = 50;
    private static String matriz[][] = new String[filas][4];
    private static Queue<String> colaPedido = new LinkedList<>();

    public static void main(String[] args) {
        matriz[0][0] = "WHI1";
        matriz[0][1] = "JHONNIE WALKER RED LABEL - BOTELLA 750 ML";
        matriz[0][2] = "120";
        matriz[0][3] = "55";
        matriz[1][0] = "WHI2";
        matriz[1][1] = "JHONNIE WALKER BLACK LABEL - BOTELLA 750 ML";
        matriz[1][2] = "200";
        matriz[1][3] = "100";
        matriz[2][0] = "PIS1";
        matriz[2][1] = "PISCO CUATRO GALLOS - BOTELLA 750 ML";
        matriz[2][2] = "150";
        matriz[2][3] = "100";
        matriz[3][0] = "PIS2";
        matriz[3][1] = "PISCO PORTON - BOTELLA 750 ML";
        matriz[3][2] = "200";
        matriz[3][3] = "95";
        matriz[4][0] = "RON1";
        matriz[4][1] = "RON FLOR DE CAÑA 4 AÑOS - BOTELLA 750 ML";
        matriz[4][2] = "150";
        matriz[4][3] = "50";
        matriz[5][0] = "RON2";
        matriz[5][1] = "RON ZACAPA AMBAR - BOTELLA 750 ML";
        matriz[5][2] = "100";
        matriz[5][3] = "100";
        matriz[6][0] = "VIN1";
        matriz[6][1] = "VINO SANTIAGO QUEIROLO - BOTELLA 750 ML";
        matriz[6][2] = "300";
        matriz[6][3] = "15";
        matriz[7][0] = "VIN2";
        matriz[7][1] = "VINO TABERNERO - BOTELLA 750 ML";
        matriz[7][2] = "300";
        matriz[7][3] = "17";
        matriz[8][0] = "CER1";
        matriz[8][1] = "CAJA DE CERVEZA PILSEN (12 BOTELLAS)";
        matriz[8][2] = "250";
        matriz[8][3] = "60";
        matriz[9][0] = "CER2";
        matriz[9][1] = "CAJA DE CERVEZA CUSQUEÑA (12 BOTELLAS)";
        matriz[9][2] = "200";
        matriz[9][3] = "70";
        inicio();
    }

    private static void inicio() {
        System.out.println("------------------------------------------------------------");
        System.out.println("       SISTEMA DE INVENTARIO Y PEDIDOS - HAPPY HOUR");
        System.out.println("------------------------------------------------------------");
        System.out.println("Ingrese una opción:");
        System.out.println("1. Inventario");
        System.out.println("2. Ingreso de pedido");
        System.out.println("3. Cola de pedido");
        String opcion = sc.nextLine();
        switch (opcion){
            case "1":
                inventario();
                break;
            case "2":
                ingresoPedido();
                break;
            case "3":
                colaPedido();
                break;
            default:
                System.out.println("Opción inválida");
                inicio();
                break;
        }
    }

    private static void inventario() {
        System.out.println("------------------------------------------------------------");
        System.out.println("                       INVENTARIO");
        System.out.println("------------------------------------------------------------");
        System.out.println("Ingrese una opción:");
        System.out.println("0. Menú anterior");
        System.out.println("1. Ingreso de nuevo producto");
        System.out.println("2. Visualizar inventario");
        System.out.println("3. Eliminar producto");
        String opcion = sc.nextLine();
        switch (opcion){
            case "0":
                inicio();
                break;
            case "1":
                for(int i=0; i<filas; i++){
                    if(matriz[i][0]==null){
                        System.out.println("Ingrese codigo:");
                        matriz[i][0] = sc.nextLine();
                        System.out.println("Ingrese descripción:");
                        matriz[i][1] = sc.nextLine();
                        System.out.println("Ingrese stock:");
                        matriz[i][2] = sc.nextLine();
                        System.out.println("Ingrese precio de venta:");
                        matriz[i][3] = sc.nextLine();
                        System.out.println("Nuevo producto ingresado satisfactoriamente");
                        inventario();
                    }else if(matriz[filas - 1][0] != null){
                        System.out.println("La matriz se encuentra llena");
                        inventario();
                    }
                }
                break;
            case "2":
                boolean revisar = false;
                for(int i=0; i<filas; i++) {
                    if (matriz[i][0] != null) {
                        revisar = true;
                    }
                }
                if(revisar == false){
                    System.out.println("La matriz se encuentra vacía");
                    inventario();
                }
                System.out.printf("%-10s%-50s%-10s%s \n", "CODIGO", "DESCRIPCIÓN", "STOCK", "PRECIO S/.");
                System.out.println("--------------------------------------------------------------------------------");
                for(int i=0; i<filas; i++){
                    if (matriz[i][0] != null) {
                        for (int j = 0; j < 4; j++) {
                            if(j==0){
                                System.out.printf("%-10s", matriz[i][j]);
                            }else if(j==1){
                                System.out.printf("%-50s", matriz[i][j]);
                            }else if(j==2){
                                System.out.printf("%-10s", matriz[i][j]);
                            }else{
                                System.out.print(matriz[i][j]);
                            }
                        }
                        System.out.println("");
                    }
                }
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("Presione ENTER para continuar");
                String salir = sc.nextLine();
                inventario();
                break;
            case "3":
                System.out.println("Ingrese codigo a eliminar:");
                String codigo=sc.nextLine();
                for(int i=0; i<filas; i++) {
                    if (Objects.equals(matriz[i][0], codigo)) {
                        matriz[i][0] = null;
                        matriz[i][1] = null;
                        matriz[i][2] = null;
                        matriz[i][3] = null;
                        System.out.println("Codigo eliminado");
                        inventario();
                    }
                }
                System.out.println("Codigo no existe");
                inventario();
                break;
            default:
                System.out.println("Opción inválida");
                inventario();
                break;
        }
    }

    private static void ingresoPedido() {
        System.out.println("Ingrese codigo o 0 para regresar al menú anterior:");
        String codigo=sc.nextLine();
        if(codigo.equals("0")){
            inicio();
        }
        for(int i=0; i<filas; i++) {
            if(Objects.equals(matriz[i][0], codigo)){
                System.out.println("Ingrese cantidad:");
                int cantidad=sc.nextInt();
                sc.nextLine();
                int aux = Integer.parseInt(matriz[i][2]);
                if (aux < cantidad) {
                    System.out.println("Cantidad superior al stock");
                    System.out.println("Stock: " + matriz[i][2] + " unidad(es)");
                    System.out.println("Informar al cliente");
                    System.out.println("-----------------------------------------------------");
                    ingresoPedido();
                }else{
                    colaPedido.add(matriz[i][1] + " " + cantidad + " unidad(es)");
                    int aux2 = aux - cantidad;
                    matriz[i][2] = String.valueOf(aux2);
                    System.out.println("Pedido ingresado satisfactoriamente");
                    inicio();
                }
            }
        }
        System.out.println("Codigo no existe");
        System.out.println("--------------------------------------------------");
        ingresoPedido();
    }

    private static void colaPedido() {
        boolean estaVacia = colaPedido.isEmpty();
        if(estaVacia == true){
            System.out.println("No hay pedidos pendientes");
            inicio();
        }
        System.out.println("El siguiente pedido por despachar es: " + colaPedido.peek());
        System.out.println("¿Se despachó?");
        System.out.println("S / N ");
        String opcion = sc.nextLine();
        switch (opcion){
            case "S":
            case "s":
                colaPedido.remove();
                System.out.println("Pedido despachado");
                System.out.println("--------------------------------------------------");
                colaPedido();
                break;
            case "N":
            case "n":
                System.out.println("Pendiente despachar");
                inicio();
                break;
            default:
                System.out.println("error");
                colaPedido();
                break;
        }
    }
}