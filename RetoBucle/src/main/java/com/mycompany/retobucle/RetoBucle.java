/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.retobucle;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author nicoc
 */
public class RetoBucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
String[] miarray = new String[]{"Java", "PHP", ".NET", "PERL", "C", "COBOL"};

            String patata = Arrays.toString(miarray);

            patata = patata.substring(1, patata.length()-1);           

             System.out.println("New New String: " + patata); 

          }
}
        
                                                      
    
    
        
