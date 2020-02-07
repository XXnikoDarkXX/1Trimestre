/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebadawtema4;

/**
 *
 * @author nicoc
 */
public class PruebaDawTema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String texto = "Batalla de paintball mañana";
        System.out.println("CompareTo: " + texto.compareTo("Batalla de paintball mañana"));
        System.out.println("CompareTo: " + texto.compareTo("Batalla de paintball mañana"));
        System.out.println("CompareTo: " + texto.compareTo("Batalla de paintball mañanas"));
        System.out.println(texto.toLowerCase());//Todo el String lo convierte a minusculas sin modificarlo
        //Para modifciarlo deberemos hacer asi texto=texto.toLowerCase;
        System.out.println(texto.toUpperCase());//Todo el String lo convierte a mayúsculas sin modificarlo
        //Para modificarlo deberemos hacer así texto=texto.toLowerCase

        //Devuelve true: ecuentra int en paintball
        System.out.println(texto.contains("int"));
        //Devuelve true; porque esa cadena pertenece a texto, tiene que ser exactamente igual 
        //lás mayúsculas también importan
        //Devuelve true, porque esa cadena pertenece a texto
        System.out.println(texto.contains(" de Paint"));

        //Devuelve false, porque delante de la palabra de no hay dos espacios
        System.out.println(texto.contains("  de Paint"));

        //Devuelve false, porque una p es mayúscula y la otra minúscula
        System.out.println(texto.contains(" de paint"));

        //Devuelve true porque son la misma cadena, y una cadena se contiene a si misma
        System.out.println(texto.contains("Batalla de Paintball mañANa"));
        //Devuelve 11
        System.out.println(texto.indexOf("Paintball"));
        //Devuelve 10 porque inculye el espacio
        System.out.println(texto.indexOf(" Paintball"));
        //Devuelve 16, que es donde empieza
        System.out.println(texto.indexOf("ball mañ"));
        //Devuelve -1 si no lo encuentra
        System.out.println(texto.indexOf("patata"));

        //Solo funciona con la última palabra del todo que es mañana
        System.out.println(texto.endsWith("ANa"));//False. La contiene pero empieza por mayúsculas
        System.out.println(texto.endsWith("Bata"));//True
        System.out.println(texto.endsWith(texto));//Tue , porque un string acaba por si mismo
        System.out.println(texto.endsWith("lla")); //da false aunque lo contine no empieza por ahí

        //Solo funciona con la palabra que empieza Batalla
        System.out.println(texto.startsWith("Bata" + "lla"));//true porque la coa concaneado formando Batalla
        System.out.println(texto.startsWith(texto));//Devuelve true porque coincide
        System.out.println(texto.startsWith("paint"));//No funciona porque no empieza por paint el texto

        //False porque la p en texto es minuscula
        System.out.println(texto.contains("Paintball"));
        
        //IMPORTANTE COMO USAR EQUALSIGNORECASE 
        //True comprara en caso de que sea igual 
        System.out.println(texto.toLowerCase().contains("paintball"));
        //True
        System.out.println(texto.equals("Batalla de Paintball mañANa con caramelos"));
        
        //False
        System.out.println(texto.equals("Batalla de paintball mañANa con caramelos"));
        
        //True Compara sin mirar las mayúsculas funciona igual que equals
        System.out.println(texto.equalsIgnoreCase("Batalla de paintball mañANa con caramelos"));
        //REPLACEALL Sirve para modificar las letras o palabras de un texto por la que tu quieres que sea
String france="Adêle la cigüeña es una inútil";
        
        //Se reemplaza inútil por enérgica
        System.out.println(france.replace("inútil","enérgica"));
        
        //Se reemplazan todas las letras a por una i
        System.out.println(france.replace("a","i"));
        
        //Se reemplazan todas las letras a por la palabra parábola
        System.out.println(france.replace("a", "parábola"));
 //Primero las ê por e, luego las ü por u, y las ú por u
String resultado=france.replaceAll("ê","e");
resultado=resultado.replace("ü","u");
resultado=resultado.replace("ú","u");
System.out.println(resultado);
        
        
//Lo mismo, pero en una sola línea       System.out.println(texto.replace("ê","e").replace("ü","u").replace("ú","u"));



    }

}
