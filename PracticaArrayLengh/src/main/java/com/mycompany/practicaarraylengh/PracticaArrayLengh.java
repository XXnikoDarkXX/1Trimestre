package com.mycompany.practicaarraylengh;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author nicoc
 */
public class PracticaArrayLengh {

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author cenec
 */


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        // antes con 8 monedas char[] pacman = {'P', '©', '©', '©', '©', '©', '©', '©'};
        System.out.println("Dime la longitu del pacman");
        int longitud=Integer.parseInt(sc.nextLine());
        char [] pacman=new char[longitud];
        Arrays.fill(pacman, '©');
        pacman[0]='P';
        char teclaPulsada;
        byte posPacman=0;
        do{
            System.out.println(imprimirArray(pacman));
            System.out.println("Pulsa A para ir atrás, o D para ir adelante");
            teclaPulsada=sc.nextLine().charAt(0);
            if (teclaPulsada=='a') {
                //En vez de no moverme si estoy en los extremos, hago otra cosa
                if (posPacman==0) {
                    intercambiarValores(pacman,0,pacman.length-1);
                   
                    posPacman=(byte)(pacman.length-1);
                    
                }else{
                    
                intercambiarValores(pacman,posPacman,posPacman-1);
               
               
                posPacman--;
                
                }
            }else if (teclaPulsada=='d'){
                 if(posPacman==pacman.length-1){
                     intercambiarValores(pacman,0,pacman.length-1);
                    
                     posPacman=0;
                 }else{
                  intercambiarValores(pacman,posPacman,posPacman+1);
                    posPacman++;
                 }
            }

        }while(teclaPulsada!='q');
        
    }
    
    
    public static String imprimirArray(char[] array){
        String res="";
        for (int i = 0; i < array.length; i++) {
            res+=array[i] + " ";
        }
        return res;
    }
    /**
     * Intercambia en el array los valores que haya en pos1 y pos2
     * Prerequisito: pos1 y pos3 deben estar entre 0 y array.length-1
     * @param array el arrray donde se intercambian los valores
     * @param pos1 una de las posiciones a intercambiar
     * @param pos2 la otra posición a intercambiar
     */
    public static void intercambiarValores (char[] array, int pos1, int pos2){
       
        char aux=array[pos1];
        array [pos1]=array[pos2];
        array [pos2]=aux;
    }
}

