/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio11;

import java.util.Scanner;

/**
 *
 * @author nicoc
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner (System.in);
        
      
             System.out.println("Cuantas plantas quieres");
            short vecesplantas=Short.parseShort(sc.nextLine());
                 System.out.println("Cuantas casas quieres");
            short vecescasas=Short.parseShort(sc.nextLine());
            System.out.println("|----------------------------|\n" +
"| 13 Rue del Percebe |\n" +
"|----------------------------|");
            for (int i = 1; i <= vecesplantas; i++) {
               for (int j = 1; j <= vecescasas; j++) {
                   System.out.print("|----|");
               }
                System.out.print("\n");
                for (int j = 1; j <= vecescasas; j++) {
                    System.out.print("|    |");
                } System.out.print("\n");
                for (int j = 1; j <= vecescasas; j++) {
                    System.out.print("|    |");
                }
                System.out.println("");
                /*String mensaje="|------|\n" 
                        +"|     |\n" 
                        +"|     |";    
                for (int j = 1; j <= vecescp; j++) {
                    String mensaje2="|------||     ||     |";    
                    System.out.print(mensaje+mensaje2);
                }*/
            }

        
    }
    public static String piso (String mensaje){
        Scanner scan = new Scanner(System.in);
        mensaje="|       |";
        System.out.println(mensaje);
        return scan.nextLine();
    }
    
}
