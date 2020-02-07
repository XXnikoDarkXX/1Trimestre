/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.funciones2;

import java.util.Scanner;

/**
 *
 * @author nicoc
 */
public class Funciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {

            String nombreP1 = pideNombre("Dime tu nombre");
            System.out.println("Dime tu edad");
            byte edadP1 = pideedad();
            String nacionalidadP1 = pideNombre("dime tu nacionalidad");
            String emailP1 = pideNombre("Dime tu email persona1");

            String nombreP2 = pideNombre("Dime tu nombre");
            System.out.println("Dime tu edad");
            byte edadP2 = pideedad();
            String nacionalidadP2 = pideNombre("Dime tu nacionalidad");
            String emailP2 = pideNombre("Dime tu email persona2");

            String nombreP3 = pideNombre("Dime tu nombre, persona 3");
            System.out.println("Dime tu edad persona 3");
            byte edadP3 = pideedad();
            String nacionalidadP3 = pideNombre("Dime tu nacionalidad persona 3");
            String emailP3 = pideNombre("Dime tu email persona3");
            System.out.println(informe(nombreP1, edadP1, nacionalidadP1, emailP1));
            System.out.println(Funciones2.informe(nombreP2, edadP2, nacionalidadP2, emailP2));
            System.out.println(informe(nombreP1, edadP1, nacionalidadP1, emailP1));
        }
    }

    public static String pideNombre(String mensaje) {
        Scanner scan = new Scanner(System.in);
        System.out.println(mensaje);
        return scan.nextLine();

    }

    public static Byte pideedad() {
        Scanner scan = new Scanner(System.in);
        return Byte.parseByte(scan.nextLine());
    }

    public static String informe(String nombre, byte edad, String nacionalidad, String email) {
        return nombre + ", de " + edad + " años , y nacionalidad " + nacionalidad + " Su email es" + email;
    }
}
