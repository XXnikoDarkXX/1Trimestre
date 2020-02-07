/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebarecursividad;

/**
 *
 * @author nicoc
 */
public class PruebaRecursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int numeroInicial=45;
        int numeroQueQuiero=51;
        /*for (int i = 0; i < 10; i++) {
            System.out.print(i+" ");
        }*/
        //paso por parámetro el valor con el que inicializaría el contador del for
        unoADiezRecursiva(numeroInicial,numeroQueQuiero);
    }
   
    
        public static void unoADiezRecursiva (int cont, int numParada){
            if (cont>=numParada) {//caso base
                System.out.print(cont+" ");
                
            }else{
                //Equivalente al ámbito del for
                System.out.print(cont+" ");   
                //Equivalente a i+i
                unoADiezRecursiva(cont+1,numParada);
            }
    }
    
    
}
