/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio9;

import java.util.Scanner;

/**
 *
 * @author nicoc
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
       
        byte opcion;
        do {
            System.out.println("\nEscribe una de las siguientes opciones"
                    + "\n1 - Multiple de 3 en intervalo"
                    + "\n2 - Todas las letras en un intervalo"
                    + "\n3 - Salir");
            opcion = Byte.parseByte(sc.nextLine());

            
            switch (opcion) {
                case 1:
                    System.out.println("Dime un numero");
                    long numero = Long.parseLong(sc.nextLine());
                    long numero2;
                    do {
                        System.out.println("Dime un numero (tiene que ser grande que el primero)");
                        numero2 = Long.parseLong(sc.nextLine());
                    } while (numero2 < numero);

                    for (long actual = numero; actual <= numero2; actual++) {
                        if (actual % 3 == 0) {
                            System.out.println(actual + " es multiple de 3");
                        }
                    }
                    break;
                case 2:
                    System.out.println("dime una letra");
                    char letra = sc.nextLine().charAt(0);
                    char letra2;
                    do {
                        System.out.println("Dime una letra (tiene que ser mas grande que el primero)");
                        letra2 = sc.nextLine().charAt(0);
                    } while (letra > letra2);
                    for (char i = letra; i <= letra2; i++) {

                        System.out.println(i);

                    }
                    break;
                case 3:
                    System.out.println("Fin del programa");
                    
                    break;
                default:
                    System.out.println("Error");
                    break;
            }

        } while (opcion != 3);
    }
 public static void letrasRecursiva(int cont, int numParada) {
      
      if (cont!=0&&numParada %cont==0) {//caso base
                System.out.print(cont+" es divisor de "+numParada+" ");
                
                    letrasRecursiva( cont+1,numParada);
           
                
                //Equivalente al ámbito del for
               // System.out.println(cont+"no fuck "+numParada);   
                //Equivalente a i+i
                 }else if (cont<numParada){
                letrasRecursiva( cont+1,numParada);
            }
    }
}
