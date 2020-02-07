/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplofor;

import java.util.Scanner;

/**
 *
 * @author nicoc
 */
public class EjemploFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Dime un numero");
        Scanner sc=new Scanner(System.in);
        long numero=Long.parseLong(sc.nextLine());
        for (long i =1;i< numero/2;i++){
            if(numero%i==0){
                System.out.println(i+"es divisor de"+numero);
            }
        }
    }
    
}
