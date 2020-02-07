/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.funciones;

import java.util.Scanner;

/**
 *
 * @author nicoc
 */
public class Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(Funciones.pruebaTexto("llegas tarde"));
        System.out.println("Dime que tabla de multiplicar quieres");
        Scanner sc=new Scanner (System.in);
        byte numero=Byte.parseByte(sc.nextLine());
        System.out.println(tablaDel(numero));
        
        
        }
        
   //Todas las tablas
    /*    for (byte i = 1; i <= 10; i++) {
            Funciones.tablaDel(i);
            System.out.println("\n -------");
        }
    }
    
    public static void tablaDel(byte numero){
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero+" x "+
                    i+" = "+(numero*i));
        }*/

    public static String pruebaTexto(String inicio){
        String yTumas="y tú más";
        for (int i = 0; i <2; i++) {
            inicio=inicio+yTumas;
        }
        return inicio;
        
    }
    
    //Tabla que tu pongas
    public static String tablaDel (byte num){
        String res="";
        for (int i = 0; i <=10; i++) {
            res+=num+"x"+i+"="+(num*i)+"\n";
        }
        return res;
    }
}
           
        
        
    
