/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioo8;

import java.util.Scanner;

/**
 *
 * @author nicoc
 */
public class Ejercicioo8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String texto;
        String patata = "";

        texto = new String("Tras años soportando en silencio la humillación de que la marca de patatas fritas Lay’s "
                + "\n venda impunemente unas patatas fritas sabor vinagreta, "
                + "los fabricantes de salsas y aderezos han lanzado al mercado "
                + "una vinagreta sabor patatas fritas Lay’s. «Había que pararle los pies "
                + "a esta gente», declara al otro lado del teléfono el director general de la marca Borges.\n"
                + "\n"
                + "«Ahora estos piratas Lay’s y otras marcas de ‘snacks’ comprobarán lo que jode que te roben tu sabor característico», dice. "
                + "\n«Vamos a ver si así aprendemos a no tocar los cojones a otros fabricantes porque a lo mejor esos"
                + " fabricantes están ya hasta la polla de aguantar tonterías. Hay que tener un poquito de educación y saber dónde acaba tu terreno y empieza el de otro», sentencia.\n"
                + "\n"
                + "Esta misma semana un grupo de veterinarios alertó de que las gallinas se han enterado de que hay patatas sabor «huevo frito» y llevan semanas intentando poner huevos con sabor a patatas fritas.");
      
       
        for (int i = 0; i < texto.length(); i++) {

           if ((texto.charAt(i)=='p') && (texto.charAt(i+1)=='a') && (texto.charAt(i+2)=='t')&& (texto.charAt(i+3)=='a')
                   && (texto.charAt(i+4)=='t')&& (texto.charAt(i+5)=='a')&& (texto.charAt(i+6)=='s')) {
      
           
                System.out.println("la palabra patatas empieza en "+i);
                
            }
        }

    }
}
