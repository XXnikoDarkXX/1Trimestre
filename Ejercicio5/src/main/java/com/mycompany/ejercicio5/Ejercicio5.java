/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author nicoc
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu peso");
       float peso = Float.parseFloat(sc.nextLine());
        System.out.println("Peso en Marte");
       float pesoMarte=peso*0.99f;
        System.out.println(pesoMarte);
        System.out.println("Peso en Saturno");
        float pesoSaturno=peso*8.96f;
        System.out.println(pesoSaturno);
        System.out.println("Teclea un año");
        short año=Short.parseShort(sc.nextLine());
        System.out.println("Teclee dias");
        short dias=Short.parseShort(sc.nextLine());
        int tiempo=año*365+dias;
        System.out.println("Cuantas horas hay en total");
        int horas=tiempo*24;
        System.out.println(horas);
        System.out.println("Total en Segundos");
        long segundos=horas*60*60;
        System.out.println(segundos);
        System.out.println("Teclee longitud del radio del circulo");
        float radio=Float.parseFloat(sc.nextLine());
        System.out.println("Area del círculo");
        float area=(radio*radio)*3.14f;
        System.out.println(area);
       
        int diaAño=291;
        int añoHoy=2019;
        long horaActual=diaAño*24+(añoHoy*365)+15;
        long segundosActual=horaActual*60*60;
        System.out.println("Total segundos");
        System.out.println(segundosActual);
        System.out.println("Notas trimestrales");
        int diasFaltan=((354*24+10)-(diaAño*24+15))/24;
        int horasFaltan=((354*24+10)-(diaAño*24+15))%24;
        int minutosFaltan=horasFaltan*60%60;
        System.out.println("quedan "+diasFaltan+" dias "+horasFaltan+" Horas "+minutosFaltan+"minutos hasta las notas");
    }
    
}
