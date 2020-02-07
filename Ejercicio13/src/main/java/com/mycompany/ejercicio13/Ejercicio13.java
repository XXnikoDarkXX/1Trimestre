/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio13;

import java.util.Scanner;

/**
 *Sirve para preguntar hasta 3 personas una serie de datos personales y luego no los muestra
 * @author nicoc
 * 
 */
public class Ejercicio13 {

    /**Sirve para preguntar hasta 3 personas una serie de datos personales y luego no los muestra
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner (System.in);
          
            String nombrePersona;
           String informeFinal="";
            String apellidoPersona;
            byte edadPersona;
            String nacionalidadPersona;
            String gen;
            int numeroPersonas=cuantasPersonas();
            for ( int i = 0; i < numeroPersonas; i++) {
                
             System.out.println("Voy a pedir datos de una persona (pedir nombre, nacionalidad)");
             nombrePersona = pideNombre ("Dime tu nombre");
             apellidoPersona= pideNombre ("Dime tu 1º apellido");
             System.out.println("Dime tu edad");
             edadPersona = pideedad ();
             nacionalidadPersona=pideNombre ("Dime tu nacionalidad");
             gen=generos("¿Cual es tu género Hombre/Mujer/Bigenero/ Cross–Dresser/Femme");
             informeFinal+=nombrePersona+" "+apellidoPersona+" "+edadPersona+" "+nacionalidadPersona+" "+gen+"\n";
           System.out.println("");
           
             }
             System.out.println("\n"+informeFinal);
         
     
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
        !gen.equalsIgnoreCase("Bigenero")&&!gen.equalsIgnoreCase(" Cross–Dresser")&&!gen.equalsIgnoreCase("Femme")); 
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
