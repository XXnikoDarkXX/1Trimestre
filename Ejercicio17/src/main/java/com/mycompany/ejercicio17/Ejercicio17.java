/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio17;

import java.util.Scanner;

/**
 *
 * @author nicoc
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
           Scanner sc=new Scanner (System.in);
          int numeroPersonas=cuantasPersonas();
           String [] nombrePersona =new String [numeroPersonas];
           String informeFinal="";
            String [] apellidoPersona=new String [numeroPersonas];
            byte[] edadPersona=new byte [numeroPersonas];
            String [] nacionalidadPersona=new String [numeroPersonas];
            String[] gen=new String [numeroPersonas];
            
            for ( int i = 0; i < numeroPersonas; i++) {
                
             System.out.println("Voy a pedir datos de una persona (pedir nombre, nacionalidad)");
             nombrePersona [i] = pideNombre ("Dime tu nombre");
             apellidoPersona [i]=pideNombre ("Dime tu 1º apellido");
             System.out.println("Dime tu edad");
             nacionalidadPersona[i]=pideNombre("Dime tu nacionalidad");
             System.out.println("Dime tu edad");
             edadPersona [i]=pideedad();
             gen [i]=generos("Eres hombre/mujero/Bigenero/Cross–Dresser/Femme");
             
                
             }
            for (int i = 0; i < numeroPersonas; i++) {
             
             System.out.print("los nombres son "+nombrePersona [i]);
                System.out.print(" Los apellidos son "+apellidoPersona[i]);
                System.out.print(" Las edades son  "+edadPersona[i]);
                System.out.println("La nacionalidad es "+nacionalidadPersona[i]);
                System.out.println("Tu genero es  "+gen[i]);
                System.out.println("\n");
            }
    }
    //Aquí para que funcione y no me haga bucle infinito tengo que crear una nueva variables
    //como la String gen; y a esa compararla "Hombre" y "Mujer"
    //Si comparo pregunta no me vale porque esta comparando "Eres Hombre/Mujer" y lo que yo ponga por el scan.nexline 
   public static String informe(String nombre, String apellido, byte edad, String nacionalidad,boolean genero) {
        return nombre +" "+ apellido +", de "+ edad + " años , y nacionalidad " + nacionalidad + " Su género es" + genero;
    }
    
       /**
     * Este metodo nos compara 5 tipos de generos y nos devuelve uno
     * @param pregunta Para mandar el mensaje a preguntar
     * @return Devuelve el genero que hayas escrito
     */
      public static String generos (String pregunta){
         Scanner scan = new Scanner(System.in);
          String gen;
        do {
            System.out.println(pregunta);
            gen=scan.nextLine();
        }while (!gen.equalsIgnoreCase("Hombre")&&!gen.equalsIgnoreCase("Mujer")&&
        !gen.equalsIgnoreCase("Bigenero")&&!gen.equalsIgnoreCase("Cross–Dresser")&&!gen.equalsIgnoreCase("Femme")); 
        if(gen.equalsIgnoreCase("Hombre")){
            return  "Eres Hombre";
    }else if(gen.equalsIgnoreCase("Mujer")){
            return  "Eres Mujer";
    }else if(gen.equalsIgnoreCase("BiGenero")){
      return  "Eres Bigenero";
    }else if (gen.equalsIgnoreCase("Cross–Dresser")){
        return "Eres  Cross–Dresser";
    }else if (gen.equalsIgnoreCase("Femme")) {
              return "Eres Femme";
          }
       return "";
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
    /**
       * Este metodo sirve para pedir la edad de las personas
       * @return la edad de la persona en byte
       */
      
    public static Byte pideedad() {
        Scanner scan = new Scanner(System.in);
        return Byte.parseByte(scan.nextLine());
    }
}
