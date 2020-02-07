/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.primosbucledoble;

import java.util.Scanner;

/**
 *
 * @author nicoc
 */
public class PrimosBucleDoble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner (System.in);
        System.out.println("Dime el primer numero (mas pequeño)");
        long numero=Long.parseLong(sc.nextLine());
        // por el do quitar y ponerlo simplemete
        // whyle System.out.println("Dime el segundo numero (tiene que se mas grande)");
        long numero2;//Long.parseLong(sc.nextLine());
         do{
            System.out.println("Dime el segundo numero (más grande)."
            +"ASEGURATE QUE ES MAS GRANDE QUE "+numero);
            numero2=Long.parseLong(sc.nextLine());
       } while(numero2<=numero) ; 
        for (long actual = numero; actual < numero2; actual++) {
         //   System.out.println("Comprobando si " +actual+ " es primo");
       
        
        boolean esPrimo=true;
        for (int i = 2; i <= actual/2; i++) {
            if (actual%i==0) {
                esPrimo=false;
                break;
            }
            
        }
        if (esPrimo) {
            System.out.println(actual+ " es primo");
        }else{
        //    System.out.println(actual +" no es primo");
        }
        }
    }
    
}
