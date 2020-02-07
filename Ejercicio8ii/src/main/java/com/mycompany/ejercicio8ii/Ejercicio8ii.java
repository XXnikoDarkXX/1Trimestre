/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio8ii;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nicoc
 */
public class Ejercicio8ii {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Random aleatorio=new Random();
        char letraRand=(char)(97+aleatorio.nextInt(25));
        int numeroRand=(int)letraRand;
        System.out.println(numeroRand+":"+letraRand);*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una frase para codificar");
        String original = sc.nextLine();
        System.out.println("Tu frase tiene " + original.length() + " letras");
        //para cada letra, concatenarle "mi"
        String codificado = "";
        Random rand = new Random();
        for (int i = 0; i < original.length(); i++) {

            //igual qee codificado=codificado+original.charAt(i)
            System.out.println(original.charAt(i));
            codificado += "" + original.charAt(i) + (char) (97 + rand.nextInt(26))
                    + (char) (97 + rand.nextInt(26));

        }
        System.out.println("Cadena codificada:" + codificado);

        System.out.print("Cadena Original:");
        for (int i = 0; i < codificado.length(); i += 3) {
            System.out.print(codificado.charAt(i));
        }
        String codificado2="";
        System.out.println("\nCodificiaon2 ");
        for (int i = 0; i < original.length(); i++) {
            codificado2+=""+(char)(original.charAt(i)*2+3);}
            System.out.println("Codificado V2: "+codificado2);
            System.out.println("Longitud decodificado2 : "+codificado2.length());
            
            
            //Decodificadondo conv2
            String decodificando2="";
                    for (int i=0;i<codificado2.length();i++){
                       decodificando2+=""+(char)((codificado2.charAt(i)-3)/2);
                    }
                    System.out.println(decodificando2);
            
        
    }

}
