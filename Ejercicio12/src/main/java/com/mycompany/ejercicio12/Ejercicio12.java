/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio12;

import java.util.Scanner;

/**
 *
 * @author nicoc
 * Esta clase nos permite preguntar hasta 3 personas una serie de datos personales y luego no los muestra
 */
public class Ejercicio12 {

    /**Sirve para preguntar hasta 3 personas una serie de datos personales y luego no los muestra
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner sc=new Scanner (System.in);
          
            String nombrePersona;
           String informeFinal="";
            String apellidoPersona;
            byte edadPersona;
            String nacionalidadPersona;
            boolean gen;
            int numeroPersonas=cuantasPersonas();
            for ( int i = 0; i < numeroPersonas; i++) {
                
             System.out.println("Voy a pedir datos de una persona (pedir nombre, nacionalidad)");
             nombrePersona = pideNombre ("Dime tu nombre");
             apellidoPersona= pideNombre ("Dime tu 1º apellido");
             System.out.println("Dime tu edad");
             edadPersona = pideEdad ();
             nacionalidadPersona=pideNombre ("Dime tu nacionalidad");
             gen =generos ("Eres Hombre/Mujer");
                
             informeFinal+=nombrePersona+" "+apellidoPersona+" "+edadPersona+" "+nacionalidadPersona+" "+gen+"\n";
           System.out.println("");
           
             }
             System.out.println("\n"+informeFinal);
         
    }
    /**
     * 
     * @param nombre nombre de la persona
     * @param apellido apellido de la persona
     * @param edad edad de la persona
     * @param nacionalidad nacionalidad de la persona
     * @param genero genero de la persona
     * @return devuelve todos los datos
     */
   public static String informe(String nombre, String apellido, byte edad, String nacionalidad,boolean genero) {
        return nombre +" "+ apellido +", de "+ edad + " años , y nacionalidad " + nacionalidad + " Su género es" + genero;
    }
      /**
       * Este metodo sirve para preguntar el genero de una persona
       * @param pregunta sirve para prenguntar el genero de una persona
       * @return booleano en genero
       */  
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
   
      /**
       * Este metodo sirve para pedir la edad de las personas
       * @return la edad de la persona en byte
       */
    public static Byte pideEdad() {
        Scanner scan = new Scanner(System.in);
        return Byte.parseByte(scan.nextLine());
    }

    
}

    
    

