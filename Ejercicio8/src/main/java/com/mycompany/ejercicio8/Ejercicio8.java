/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio8;

import java.util.Scanner;

/**
 *
 * @author nicoc
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclea dos números con o sin decimales");
        float numero1 = Float.parseFloat(sc.nextLine());
        float numero2 = Float.parseFloat(sc.nextLine());
        System.out.println("Introduce una operacion: suma, resta, multiplicacion, division o resto ");
        String operacion = sc.nextLine();
        switch (operacion) {
            case "suma":
                float suma = numero1 + numero2;
                System.out.println(suma);
                break;
            case "resta":
                float resta = numero1 - numero2;
                System.out.println(resta);
                break;
            case "multiplicacion":
                float multiplicacion = numero1 * numero2;
                System.out.println(multiplicacion);
                break;
            case "division":
                float division=numero1/numero2;
                System.out.println(division);
                break;
            case "resto":
                float resto=numero1%numero2;
                System.out.println(resto);
                break;
             default:
           System.out.println("Operacion no valida" );
           break;
        }

    }

}
