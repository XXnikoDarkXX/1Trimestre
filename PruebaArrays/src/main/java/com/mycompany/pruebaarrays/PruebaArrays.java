/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebaarrays;

import java.util.Scanner;

/**
 *
 * @author nicoc
 */
public class PruebaArrays {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
      
        Scanner sc=new Scanner (System.in);
        int numeroPersonas = cuantasPersonas();
        String[] nombrePersona = new String[numeroPersonas];
        String[] apellidoPersona = new String[numeroPersonas];
        byte[] edadPersona = new byte[numeroPersonas];
        String[] nacionalidadPersona = new String[numeroPersonas];
        boolean[] gen = new boolean[numeroPersonas];
        for (int i = 0; i < numeroPersonas; i++) {
            System.out.println("Voy a pedir datos de una persona (pedir nombre, nacionalidad)");
            nombrePersona[i] = pideNombre("Dime tu nombre");
            apellidoPersona[i] = pideNombre("Dime tu 1º apellido");
            System.out.println("Dime tu edad");
            edadPersona[i] = pideEdad();
            nacionalidadPersona[i] = pideNombre("Dime tu nacionalidad");
            gen[i] = generos("Eres Hombre/Mujer");
        }

        System.out.println("");

        // Mostrando los datos
        for (int i = 0; i < numeroPersonas; i++) {
            System.out.println("Persona #" + (i + 1));
            System.out.println("Nombre: " + nombrePersona[i]);
            System.out.println("Apellido: " + apellidoPersona[i]);
            System.out.println("Edad: " + edadPersona[i]);
            System.out.println("Nacionalidad: " + nacionalidadPersona[i]);
            System.out.println("Genero: " + (gen[i] ? "Hombre": "Mujer"));

            System.out.println("");
        }
         
    }
    //Aquí para que funcione y no me haga bucle infinito tengo que crear una nueva variables
    //como la String gen; y a esa compararla "Hombre" y "Mujer"
    //Si comparo pregunta no me vale porque esta comparando "Eres Hombre/Mujer" y lo que yo ponga por el scan.nexline 
   public static String informe(String nombre, String apellido, byte edad, String nacionalidad,boolean genero) {
        return nombre +" "+ apellido +", de "+ edad + " años , y nacionalidad " + nacionalidad + " Su género es" + genero;
    }
        
    public static boolean generos (String pregunta){
         Scanner scan = new Scanner(System.in);
         String gen;
        do {
        System.out.println(pregunta);
        gen=scan.nextLine();
        }while (!gen.equals("Hombre")&&!gen.equals("Mujer"));
        if(gen.equals("Hombre")){
            return true;
        }
        return false;
    }
/**Esta funcion sirve para pedir los nombres y los apellidos
 * 
 * @param mensaje el mensaje que vas a pedir
 * @return devuelve dicho mensaje
 */
    public static String pideNombre(String mensaje) {
        Scanner scan = new Scanner(System.in);
        System.out.println(mensaje);
        return scan.nextLine();

    }
    /**
     * Sirve para pedir el total de personas que vamos a pedir los datos
     * @param personas Cantidad de personas que vamos a pedir los datos
     * @return el numero de personas que vamos a pedir los datos
     */
    
    public static int cuantasPersonas ( ){
        Scanner scan=new Scanner (System.in);
        int personas;
            do{
        System.out.println("Cuantas personas quieres pedir los datos, debe de ser entre 1 y 3");
        personas=Integer.parseInt(scan.nextLine());
        } while (personas>=4||personas<1);
        return personas;
        
    
}
   
      
    public static Byte pideEdad() {
        Scanner scan = new Scanner(System.in);
        return Byte.parseByte(scan.nextLine());
    }

    
}

  
   





    
    



