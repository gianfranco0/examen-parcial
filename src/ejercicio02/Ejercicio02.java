/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("EXAMEN PARCIAL");
        System.out.println("GianFranco Bustamante");
        System.out.println("");
        System.out.println("CATALOGO DE TELEFONOS MOVILES");
        System.out.println("");
        System.out.println("TELEFONOS MOVILES");
        System.out.println(" [1] SAMSUNG S7 ");
        System.out.println(" [2] HUAWEI P10 ");
        System.out.println(" [3]  LG G6");
        System.out.println("SELECCIONE UN MODELO: ");
        
        char opcion = input.next().charAt(0);
        
        switch(opcion){
            case '1':
                System.out.println("PANTALLA        : 5.1\"");
                System.out.println("CAMARA          : 12Mp");
                System.out.println("PROCESADOR      : 1.6Ghz"); 
                break;
                
            case '2':
                System.out.println("PANTALLA        : 5.1\"");
                System.out.println("CAMARA          : 20Mp");
                System.out.println("PROCESADOR      : 1.84Ghz"); 
                break;
                
            case '3':
                System.out.println("PANTALLA        : 5.7\"");
                System.out.println("CAMARA          : 13Mp");
                System.out.println("PROCESADOR      : 2.35Ghz");
                break;
                
            default:                
                break;
    }
        
        System.out.println("");
        System.out.println("OPERADORES");
        System.out.println(" [1] CLARO ");
        System.out.println(" [2] MOVISTAR ");
        System.out.println(" [3]  ENTEL ");
        System.out.println("\nSELECCIONE UN OPERADOR: ");
        
        char operador = input.next().charAt(0);
        
        switch(operador){
            case '1':
                System.out.println("\nSELECCIONE UN PLAN: ");
                System.out.println("[a] CLARO MAX 99: ");
                System.out.println("[b] CLARO MAX 149 ");
                System.out.println("[c] CLARO MAX 199 ");
                
                char plan = input.next().charAt(0);
                switch(plan){
                    case 'a':
                        System.out.println("Claro Max 99:");
                System.out.println("Precio S/ 99");
                System.out.println("Minutos Ilimitados"); 
                System.out.println("RPC Ilimitados"); 
                System.out.println("Internet 6 GB"); 
                System.out.println("SMS Ilimitados"); 
                break;
                    case 'b':
                        System.out.println("Claro Max 149:");
                System.out.println("Precio S/ 149");
                System.out.println("Minutos Ilimitados"); 
                System.out.println("RPC Ilimitados"); 
                System.out.println("Internet 6 GB"); 
                System.out.println("SMS Ilimitados"); 
                break;
                    case 'c':
                System.out.println("Claro Max 199:");
                System.out.println("Precio S/ 199");
                System.out.println("Minutos Ilimitados"); 
                System.out.println("RPC Ilimitados"); 
                System.out.println("Internet 6 GB"); 
                System.out.println("SMS Ilimitados"); 
                break;
                    default:
                       System.out.println("");
                        break;
                }                  
            default:
                break;
    }
        
        
    }
    
}
