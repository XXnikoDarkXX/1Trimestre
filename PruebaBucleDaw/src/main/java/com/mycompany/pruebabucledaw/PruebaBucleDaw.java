/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebabucledaw;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nicoc
 */
public class PruebaBucleDaw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("Dime un numero");
        Scanner sc = new Scanner(System.in);
        /* long numero=Long.parseLong(sc.nextLine());
        //un numero es primo si sus únicos divisores son 1 y el mismo
        boolean esPrimo=true;
        for (int i=2;i<=numero/2;i++){
            if (numero%i==0){
                System.out.println(numero+" no es primo. Lo divide: "+i);
                esPrimo=false;
            }
            
        }
        if (esPrimo==true){
            System.out.println(numero+" es primo");
        }*/
        String careto = "0_0";
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.print("(");
            switch (r.nextInt(3)) {
                case 0:
                    System.out.print("0");
                    break;
                case 1:
                    System.out.print("^");
                    break;
                case 2:
                    System.out.print("-");
                    break;
            }
            switch (r.nextInt(3)) {
                case 0:
                    System.out.print("_");
                    break;
                case 1:
                    System.out.print("x");
                    break;
                case 2:
                    System.out.print("w");
                    break;
                case 3:
                    System.out.print("o");
                    break;
            }
            switch (r.nextInt(3)) {
                case 0:
                    System.out.print("0");
                    break;
                case 1:
                    System.out.print("^");
                    break;
                case 2:
                    System.out.print("-");
                    break;
            }
           
            
        }
           
    }

}
