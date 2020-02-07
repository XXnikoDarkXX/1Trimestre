/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prueba;

import java.util.Scanner;

/**
 *
 * @author nicoc
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Dime tu edad");
        Scanner sc = new Scanner(System.in);
        byte edad = Byte.parseByte(sc.nextLine());
        
        if (edad >= 18) {
            System.out.println("Eres mayor de edad. Bébete una cerveza.");
            System.out.println("¿Tienes carnet de conducir? (Si o no)");
            String conCarnet=sc.nextLine();
            if(conCarnet.equals("Si")||conCarnet.equals("si")){
                System.out.println("Pues conduce con cuidado");
            }else{
                System.out.println("¿Querrias sacártelo? (Si/No)");
                String quieroSacarmeCarnet=sc.nextLine();
               if (quieroSacarmeCarnet.equals("Si")||quieroSacarmeCarnet.equals("si"))
                    System.out.println("Que bien");
               
            }
        }else{
            System.out.println("Eres menor de edad. Bébete una fanta");
        }
        System.out.println("No tengo más preguntas");
    }

}
