/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testeo;

import java.util.Scanner;

/**
 *
 * @author nicoc
 */
public class testeo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int aleatorio1, aleatorio2, aleatorio3, aleatorio4, aleatorio5, contador = 0;
        int numero1,numero2,numero3,numero4,numero5;
        int[] bingo = new int[5];

        //El aleatorio sale con decimales habra que multiplicarlo *100
        aleatorio1 = (int) (Math.random() * 100);//Genera un numero aleatorio entre 0-100
        aleatorio2 = (int) (Math.random() * 100);
        aleatorio3 = (int) (Math.random() * 100);
        aleatorio4 = (int) (Math.random() * 100);
        aleatorio5 = (int) (Math.random() * 100);
        bingo[0] = aleatorio1;
        bingo[1] = aleatorio2;
        bingo[2] = aleatorio3;
        bingo[3] = aleatorio4;
        bingo[4] = aleatorio5;
        for (int i = 0; i < bingo.length; i++) {
                System.out.println(bingo[i]);
            }
        
        do {
            System.out.println("Escribe el primer numero haber si aciertas");
          numero1=Integer.parseInt(sc.nextLine());
           if (aleatorio1>numero1) {
              System.out.println("Digite un numero mayor que "+ numero1);
          }else{
              System.out.println("Digite un numero menor");
          }
            System.out.println("Digite segundo numero haber si aciertas");
                     numero2=Integer.parseInt(sc.nextLine());
            if (aleatorio2>numero2) {
                System.out.println("Digite un numero mayor");
            }else{
                System.out.println("Digite un numero menor");
            }
 
           
          contador++;
        } while (numero1!=aleatorio1||numero2!=aleatorio2);
        System.out.println("Bingo adivinastes todos los numeros en "+contador+" intentos");
        /*    do{
          System.out.println("Escribe un numero");
          numero=Integer.parseInt(sc.nextLine());
          if (aleatorio>numero) {
              System.out.println("Digite un numero mayor");
          }else{
              System.out.println("Digite un numero menor");
          }
          contador++;
      }while(numero!=aleatorio);
        System.out.println("Genial!!\n Adivinaste el número en: "+contador +"intentos");*/
    }

}
