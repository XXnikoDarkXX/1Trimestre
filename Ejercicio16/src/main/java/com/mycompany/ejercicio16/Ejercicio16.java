/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio16;

import java.util.Scanner;

/**
 * Esta clase sirve para pedir  dos letras y de forma recursiva imprima todas las que está en medio
 * @author nicoc
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     * pedimos una letra y hacemos unas llamadas a los metodos para que recursivamente nos imprima todas las sucessiones
     * de letras desde la primera ya escrita hasta la última y que la segunda letra siempre sea mayor que la primera letra
     */
    public static void main(String[] args) {
        
        char letra2;
        
        // TODO code application logic here
        Scanner sc=new Scanner (System.in);
        System.out.println("Dime una letra");
        char letra=sc.nextLine().charAt(0);
        
        letrasRecursiva(letra, pedirLetraMayor(letra));
    }
    
    /**
     * Sirve para hacer que letra2 sea obligatoriamente más grande que letra1
     * @param orig es el origen letra1
     * @return nos devolverá letra2 en caso de que sea mas grande que letra1 o la funcion pedirletramayor
     */
    public static char pedirLetraMayor (char orig) {
        char letra2;
          Scanner sca=new Scanner (System.in);
          System.out.println("Dime otra letra(tiene que ser mayor que)"+orig);
          letra2=sca.nextLine().charAt(0);
          if (letra2>orig) {
              return letra2;
              
            
        }else{
              return pedirLetraMayor(orig);
          }
    
    }

    /**
     * Metodo que imprime recursivamente a partir de dos letras todas las letras succesores hasta la segunda letra
     * @param letraInicial la letra primera donde empezará a imprimir
     * @param letraParada la letra ultima que imprimirá segun la letraInicial
     */
     public static void letrasRecursiva(char letraInicial, char letraParada) {
    
 
     if (letraInicial<=letraParada) {//caso base
         
              System.out.print(letraInicial);
              letrasRecursiva(++letraInicial,letraParada);
         
                
                //Equivalente al ámbito del for
             
                //Equivalente a i+i
                 }else if (letraInicial>=letraInicial){
              
            }
    }
} 
        