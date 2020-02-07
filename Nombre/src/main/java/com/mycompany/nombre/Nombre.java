/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nombre;

import java.util.Scanner;

/**
 *
 * @author nicoc
 */
public class Nombre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Que edad tiene");
        byte edad = Byte.parseByte(sc.nextLine());
        if (edad > 17 && edad <= 65) {
            //Primero comprueba si eres mayor de edad pero no para jubilarte
            System.out.println("eres mayor de edad, ponte a trabajar");

        } else {
            if (edad > 65) {
                System.out.println("Estas en edad para jubilarte");
            } else {

                System.out.println("Eres menor de edad");
            }
        }
        //Después comprueba si estas en edad de jubilarte

        System.out.println("Forma2");
        if (edad <= 17) {
            System.out.println("Eres menor de edad ponte a  estudiar");
        } else if (edad > 65) {
            System.out.println("Estas en edad de jubilarte");
        } else {
            System.out.println("Eres mayor de edad ponte a trabajar");
        }
    }

}
