/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebajuega;

import java.util.Scanner;

/**
 *
 * @author nicoc
 */
public class Pruebajuega {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu nombre");
        String nombre = sc.nextLine();
        System.out.println("Dime tu edad");
        byte edad=Byte.parseByte(sc.nextLine());
        boolean y=edad>=18;
        System.out.println("¿Es mayor de edad?");
        System.out.println(y);
        System.out.println("Dime tu altura");
        float altura = Float.parseFloat(sc.nextLine());
        System.out.println("¿Puede montarse en la montaña rusa?");
        boolean atraccion=edad>6 || altura>1.1;
        System.out.println(atraccion);
        System.out.println("Dime tu peso");
        float peso=Float.parseFloat(sc.nextLine());
        System.out.println("¿Estas en el peso correcto?");
        boolean pesoCorrecto=edad<7 || peso<26 && peso>17;
        System.out.println(pesoCorrecto);
        System.out.println("¿Tiene mucha altura para su edad?");
        boolean muchaAltura=edad==5 && altura>11 || edad==6 && altura>1.15 || edad==7 && altura>1.22 ||
                edad==8 && altura>1.26 || edad>8 && altura>1.50; 
        System.out.println(muchaAltura);
        System.out.println("Indice de masa corporal");
        float masa=peso/(altura*altura);
        System.out.println(masa);
        System.out.println("Masa corporal >30");
        
    }
    
}
