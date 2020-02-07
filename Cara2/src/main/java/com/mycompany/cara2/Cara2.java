/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cara2;

import java.util.Scanner;

/**
 *
 * @author nicoc
 */
public class Cara2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Programa que pide por telado qué tipo de "cara" queremos dibujar
        //hasta que le digamos que pare, y depués nos pida cuántas veces queremos dibujarlas
        //Tipos de cara: Seria, Sorprendida, contenta
        Scanner sc=new Scanner(System.in);
        byte opcion;
        do {
            System.out.println("Dime el tipo de cara a imprimir (seria, sorprendida, contenta"
            +"\n\t 1 - seria"
            +"\n\t 2 - sorprendida"
            +"\n\t 3 - contenta"
            +"\n\t 4 - salir");
             opcion=Byte.parseByte(sc.nextLine());
             if (opcion!=4) {
             System.out.println("Dime cuantas veces");
             short veces=Short.parseShort(sc.nextLine());
                 for (int i = 0; i < veces; i++) {
                     //imprimo una cara del tipo que se me dice
                     switch (opcion){
                         case 1:
                             System.out.print("(-_-)");
                             break;
                         case 2:
                             System.out.print("(ºoº)");
                             break;
                         case 3:
                             System.out.print("(:D)");
                             break;
                     }
                     
                 }
                 System.out.println("");
             }
        }while (opcion!=4);
    }
    
}
