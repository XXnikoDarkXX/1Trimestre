/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prueba2tema4;

import java.util.Scanner;

/**
 *
 * @author nicoc
 */
public class Prueba2Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola que tal?     ".trim()); //Imprime Hola que tal?
        System.out.println("        ¿Todo bien?   ".trim()); //Imprime ¿Todo bien?
        System.out.println("Escribe tu usuario");
        Scanner sc = new Scanner(System.in);
        String usuario = sc.nextLine();
        if (usuario.trim().equalsIgnoreCase("miguel")) {
            System.out.println("Login ok");
        } else {
            System.out.println("Falló login");
        }
        String texto2 = "HolaQueHacesPorAqui";
        System.out.println(texto2.substring(7)); //Devuelve HacesPorAqui
        System.out.println(texto2.substring(7, 12)); //Devuelve Haces

        String precio = "12€";
        int precioNum = Integer.parseInt(precio.substring(0, precio.length() - 1));
        //Devuelve 12
        System.out.println(precioNum);
        String nombreFichero = "algo.jpg";
        //Devuelve algo
        System.out.println("Fichero sin extension: "
                + nombreFichero.substring(0, nombreFichero.length() - 4));

    }

}
