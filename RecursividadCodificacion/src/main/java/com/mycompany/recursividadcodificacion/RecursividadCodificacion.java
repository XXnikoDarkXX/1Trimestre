/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.recursividadcodificacion;

import java.util.Scanner;

/**
 *
 * @author nicoc
 */
public class RecursividadCodificacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner (System.in);
        System.out.println("Dime un texto a codificar");
        String texto=sc.nextLine();
        String textoSalida="";
        /*for (int i = 0; i <texto.length(); i++) {
            textoSalida+=texto.charAt(i)+"mi";
            
        }
        System.out.println(textoSalida);*/
        System.out.println(mimimiR(0,texto));
    }
     /**
     * patata recursiva
     * @param cont contador, deberia empezar desde 0 y debería llegar a la longitud de textop
     * @param texto texto donde se va a buscar patata
     * @return numero de posicion de la primera vez que encuentra patata o -1 si no la encuentra
     */
    public static String mimimiR(int cont, String texto){
        if (cont>=texto.length()) {
            //Caso base
            return"";
        }else{
            //Caso iterativo
            String devolver=texto.charAt(cont)+"mi";
            return devolver+mimimiR(cont+1,texto);
        }
    }
}
