/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio15;

import java.util.Scanner;

/**
 *Esta clase sirve para sacar todos los divisores de un numero
 * @author nicoc
 */
public class Ejercicio15 {

    /**Escribimos un numero luego llamamos al metodo divisoresRecursivo para que nos imprima todos los divisores 
     * del numero escrito antes
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número");
        int numero = Integer.parseInt(sc.nextLine());
        
    
        
        
        divisoresRecursivo(1,numero);
       
    }
/**
 * Este metodo sirve para sacar todos los divisores desde 1 hasta el numero indicado RECURSIVAMENTE
 * @param cont es el contador por defecto es 1 y se va sumando
 * @param numParada es el numero indicado desde este número se sacará todos los divisores
 */
    public static void divisoresRecursivo(int cont, int numParada) {
      if((cont<=numParada)){
          if (numParada % cont == 0) {
                System.out.println(cont + " es multiple de 3");
            }
          divisoresRecursivo( cont+1,numParada);
      }
     /* if (cont!=0&&numParada %cont==0) {//caso base
                System.out.print(cont+" es divisor de "+numParada+"\n");
                    busquedaRecursiva( cont+1,numParada);
                //Equivalente al ámbito del for
               // System.out.println(cont+"no fuck "+numParada);   
                //Equivalente a i+i
                 }else if (cont<numParada){
                busquedaRecursiva( cont+1,numParada);
            }*/
    }
}
