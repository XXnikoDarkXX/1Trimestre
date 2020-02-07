/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examen1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author nicoc
 * Este programa sirve para pedir un texto por teclado que ese texto lo convierta a arrays separandolos por espacios
 * y luego los vuelva a juntar separandolos con | y por ultimo si escribimos en el texto mensaje nos dira que 
 * estamos hablando de examenes
 * 
 */
public class Examen1 {

    /**
     * @param args the command line arguments
     * Desde el main pedimos un texto por teclado, luego llamamos a la funcion de dimeFrase para convertir
     * dicho texto en arrays, llamamos tambien a imprimearrays para convertir a un string todo el array, y por 
     * ultimo si hemos puesto la palabra examen en el texto que pediamos al inico nos dira estamos hablando de examenes
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
       
        String res[]=dimeFrase();
        System.out.println(imprimeArray(res));
      palabrasClave(res);
}
    /**
     * Este método sirve para convertir el texto escrito en arrays a partir de los espacios 
     * tambien para que el minimo caracter escrito sea 20  y el maximo 100
     * @return nos devuelve un array separando el texto escrito
     */
    public static String [] dimeFrase(){
       Scanner sc = new Scanner(System.in);
       
        
        String texto;
        do {
            System.out.println("Dime un texto asegurate que tenga entre 20 y 100 letras");
            texto = sc.nextLine();
            } while (texto.length() > 100 || texto.length() < 20);
            texto = texto.toLowerCase();
            texto = texto.replace("mierda", "m----a").replace("maldicion", "m-------n");
            texto = texto.replace("Mierda", "m----a").replace("Maldicion", "m-------n");
            
            System.out.println("La censura es: " + texto);
            String[] palabras = texto.split(" ");
            System.out.println("Separacion del texto escrito");
            for (int i = 0; i <palabras.length; i++) {
                System.out.println(palabras[i]);
            }
            
        
    return palabras;
    }
    /**
     * 
     * @param lista sirve para tener el array que esta separado por textos. (explicado regular no me entiendo ni yo)
     * 
     * @return nos devuelve el array list junto en un String separando las palabras por | excepto el último!!
     */
    public static String imprimeArray(String[] lista){
       
            String patata = Arrays.toString(lista);

            patata = patata.substring(1, patata.length()-1);           
            patata=patata.replace(",", "|");
             
return patata;
          }
    /**
     * 
     * @param palabra esta variable sirve para usar el array del texto y en caso de que en alguna parte del array
     * tenga la palabra examen nos diga en un mensaje estamos hablando de examenes
     */
    public static void palabrasClave(String palabra[]){
        for (int i = 0; i <palabra.length; i++) {
            if (palabra[i].equalsIgnoreCase("examen")) {
                System.out.println("Estamos hablando de examenes!");
            }
        }
    }
    
    }
  

