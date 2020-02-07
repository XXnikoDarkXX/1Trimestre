/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio10;

import java.util.Scanner;

/**
 *
 * @author nicoc
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        //Pedir dos números, y que me calcule todos los nº primos entre ellos
        System.out.println("Introduce el 1º Número (más pequeño)");
        long primerN = Long.parseLong(sc.nextLine());
        long segundoN;
       
    
        int segundo;
        Math.abs(primerN);
        
        do {
            System.out.println("El 2º Número debe ser más grande que el 1º");
            segundoN = Long.parseLong(sc.nextLine());
            Math.abs(segundoN);
        } while (segundoN <= primerN);
        for (long i = primerN; i <= segundoN; i++) {
           // System.out.println("Comprobando si "+i+" es primo");
           boolean esPrimo = true;
            for (int j =2; j <= Math.abs(i) / 2; j++) {
                //System.out.println("Mirando si "+j+" divide a "+i);
               if (i % j == 0) {
                    //System.out.println(i+" No es primo. Lo divide: "+j);
                    esPrimo = false;
                }
            }
            if (esPrimo) {
                System.out.println(i+" es primo.");
            
        }
    }
    }
}
