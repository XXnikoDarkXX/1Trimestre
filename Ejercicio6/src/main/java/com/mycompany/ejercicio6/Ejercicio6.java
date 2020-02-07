/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio6;

import java.util.Scanner;

/**
 *
 * @author nicoc
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca tres de los siguientes ingredientes");
        System.out.println("Tomate");
        System.out.println("Jamon");
        System.out.println("Aceite");
        System.out.println("Habas");
        System.out.println("Pulpo");
        System.out.println("Patatas");
        System.out.println("Chorizo");
        String ingrediente1 = sc.nextLine();
        String ingrediente2 = sc.nextLine();
        String ingrediente3 = sc.nextLine();
        if (ingrediente1.equals("Tomate") && ingrediente2.equals("Aceite") && ingrediente3.equals("Jamon")
                || (ingrediente1.equals("Aceite") && ingrediente2.equals("Tomate") && ingrediente3.equals("Jamon"))
                || ingrediente1.equals("Aceite") && ingrediente2.equals("Jamon") && ingrediente3.equals("Tomate")
                || (ingrediente1.equals("Tomate") && ingrediente2.equals("Jamon") && ingrediente3.equals("Aceite"))
                || (ingrediente1.equals("Jamon") && ingrediente2.equals("Tomate") && ingrediente3.equals("Aceite"))
                || (ingrediente1.equals("Jamon") && ingrediente2.equals("Aceite") && ingrediente3.equals("Tomate"))) {
            System.out.println("Gazpacho");

        } else if ((ingrediente1.equals("Pulpo") && ingrediente2.equals("Patatas") && ingrediente3.equals("Aceite"))
                || (ingrediente1.equals("Patatas") && ingrediente2.equals("Pulpo") && ingrediente3.equals("Aceite"))
                || ingrediente1.equals("Aceite") && ingrediente2.equals("Pulpo") && ingrediente3.equals("Patatas")
                || (ingrediente1.equals("Pulpo") && ingrediente2.equals("Aceite") && ingrediente3.equals("Patatas"))
                || (ingrediente1.equals("Patatas") && ingrediente2.equals("Aceite") && ingrediente3.equals("Pulpo"))
                || (ingrediente1.equals("Aceite") && ingrediente2.equals("Patatas") && ingrediente3.equals("Pulpo"))) {
            System.out.println("Pulpo a la gallega");
        } else if (ingrediente1.equals("Chorizo") && ingrediente2.equals("Patatas") && ingrediente3.equals("Aceite")
                || (ingrediente1.equals("Chorizo") && ingrediente2.equals("Aceite") && ingrediente3.equals("Patatas"))
                || (ingrediente1.equals("Aceite") && ingrediente2.equals("Chorizo") && ingrediente3.equals("Patatas"))
                || (ingrediente1.equals("Aceite") && ingrediente2.equals("Patatas") && ingrediente3.equals("Chorizo"))
                || (ingrediente1.equals("Patatas") && ingrediente2.equals("Chorizo") && ingrediente3.equals("Aceite"))
                || (ingrediente1.equals("Patatas") && ingrediente2.equals("Aceite") && ingrediente3.equals("Chorizo"))) {
            System.out.println("Zorza");

        } else if ( ingrediente2.equals("Jamon") && ingrediente3.equals("Habas")    
                || (ingrediente1.equals("Jamon") && ingrediente2.equals("Habas"))
                || (ingrediente1.equals("Jamon") && ingrediente2.equals("Habas"))
                || (ingrediente1.equals("Habas") && ingrediente2.equals("Jamon"))
                ||  ingrediente2.equals("Habas") && ingrediente3.equals("Jamon") 
                || (ingrediente1.equals("Jamon") && ingrediente2.equals("Habas"))) {
            System.out.println("Habas con Jamon");

        }else{
            
   
            System.out.println("No hay receta");
        }

    }

}
