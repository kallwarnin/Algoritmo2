/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Empleado;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 1062076461
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String Nombre="";
     String Codigo="";
     String id="";
     int Año_ingreso=0;
     int bandera=0;
     int Cantidad=0;
     int opc=0;
     
     // creacion de objetos
     Scanner scan = new Scanner(System.in);

     ArrayList<Empleado>listaempleados= new ArrayList<>();
     Empleado objempleado3= new Empleado("Ronald", "12345", 1993);
     Empleado objempleado1= new Empleado("Ady", "123456", 1999);
     Empleado objempleado2= new Empleado("kallwarnin", "2508", 2005);
     Empleado objempleado4= new Empleado("Alexis", "0000", 2003);
     Empleado objempleado5= new Empleado("Andrew", "1234", 2005);
     listaempleados.add(objempleado3);
     listaempleados.add(objempleado1);
     listaempleados.add(objempleado2);
     listaempleados.add(objempleado4);
     listaempleados.add(objempleado5);

     
     
    //Creando menu de opciones
    System.out.println("1. Registrar Empleado");
            System.out.println("2. Editar Empleado");
            System.out.println("3. Consultar Empleado");
            System.out.println("4. Mostrar Empleados");
            System.out.println("5. Eliminar Empleado");
            System.out.println("6. Salir");
     
      //Algoritmo en lenguaje JAVA Registrar
     
     
       
           
            System.out.println("Digite la opcion");
            opc= scan.nextInt();
           
            switch(opc){
               
                case 1:
                    System.out.println("Digite la cantidad de empleados a registrar: ");
                    Cantidad= scan.nextInt();
                    scan.nextLine();
                   
                    for (int i = 1; i <= Cantidad; i++) {
                        scan.nextLine();
                        System.out.println("Digite el nombre del empleado: "+"\t"+i);
                        Nombre= scan.nextLine();
                        System.out.println("Digite el codigo del empleado: "+"\t"+i);
                        Codigo= scan.nextLine();
                        System.out.println("Digite el año de ingreso del empleado: "+"\t"+i);
                        Año_ingreso= scan.nextInt();
                        Empleado objempleado= new Empleado(Nombre, Codigo, Año_ingreso);
                       
                        listaempleados.add(objempleado);
                        System.out.println("El Numero de registrados es: "+"\t"+i);
                    }
                    break;
                    case 2:
                      //Algoritmo en lenguaje JAVA Editar
                        scan.nextLine();
                    System.out.println("Digite el id del empleado a modificar");
                    id=scan.nextLine();
                    for (int i = 0; i < listaempleados.size(); i++) {
                        if(listaempleados.get(i).getCodigo().equals(id))
                        {
                            scan.nextLine();
                            System.out.println("Digite el nombre del empleado");
                            Nombre= scan.nextLine();
                            System.out.println("Digite el codigo del empleado");
                            Codigo= scan.nextLine();
                            System.out.println("Digite el año de ingreso del empleado");
                            Año_ingreso= scan.nextInt();
                           
                           
                            listaempleados.get(i).setNombre(Nombre);
                            listaempleados.get(i).setCodigo(Codigo);
                            listaempleados.get(i).setAño_ingreso(Año_ingreso);
                           
                         
                              if(bandera==0)
                              {
                              } else {
                                  System.out.println("El id del empleado no existe o no se encuentra en el sistema");
                              }
                        }
                    }
                    break;
                   
                    case 3:
                        //Algoritmo en lenguaje JAVA Consultar
                       
                        scan.nextLine();
                        System.out.println("Digite el codigo del empleado a buscar");
                        id=scan.nextLine();
                        double startTime = System.currentTimeMillis();
                        for (int i = 0; i < listaempleados.size(); i++) {
                            if(listaempleados.get(i).getCodigo().equals(id))
                            {

                                System.out.println("\n");
                                System.out.println("Empleado"+"\t"+(i+1));
                                System.out.println("El nombre del empleado es:"+"\t"+listaempleados.get(i).getNombre());
                                System.out.println("El codigo del empleado es:"+"\t"+listaempleados.get(i).getCodigo());
                                System.out.println("El codigo del empleado es:"+"\t"+listaempleados.get(i).getAño_ingreso());
                            }  
                        }
                    break;
                    case 4:
                        //Algoritmo en lenguaje JAVA Mostrar
                        if(listaempleados.size()>0){
                        for (int i = 0; i < listaempleados.size(); i++) {
                                System.out.println("\n");
                                System.out.println("Empleado"+"\t"+(i+1));
                                System.out.println("El nombre del empleado es:"+"\t"+listaempleados.get(i).getNombre());
                                System.out.println("El codigo del empleado es:"+"\t"+listaempleados.get(i).getCodigo());
                                System.out.println("El año de ingreso del empleado es:"+"\t"+listaempleados.get(i).getAño_ingreso());
                               
                               
                            }
                        }else{
                            System.out.println("No hay empleados registrados");
                        }
                    break;
                    case 5:
                         //Algoritmo en lenguaje JAVA Eliminar
                        scan.nextLine();
                        System.out.println("Digite el codigo del empleado a buscar");
                        id=scan.nextLine();
                        for (int i = 0; i < listaempleados.size(); i++) {
                            if(listaempleados.get(i).getCodigo().equals(id))
                            {
                                System.out.println("\n");
                                System.out.println("Empleado"+"\t"+(i+1));
                                listaempleados.remove(i);
                            }
                        }
                    break;
                   
                    case 6:
                        //Algoritmo en lenguaje JAVA Salir
                        System.out.println("***Tarea finalizado con exito***");
                       
                    break;
                    default: System.out.println("Opcion no valida para el menu");
                   
            }
    }  
    
}