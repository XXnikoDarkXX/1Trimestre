/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.recurpatata;

/**
 *
 * @author nicoc
 */
public class RecurPatata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               String almuerzo="Hola voy a comer patatas con chorizo "
               + "y huevo. Pero sobre todo, voy a comer "
               + "patatas, que son lo que más me gusta.";
    
               System.out.println(" Se encuentra en: "+busquedaRecursiva(0,almuerzo,0,"voy"));
    }

    
      public static int busquedaRecursiva(
            int cont,String texto,int letraDePalabraBuscadaPorDondeVoy,
            String palabraQueBusco){
        if(cont>=texto.length()){
            //caso base
            return -1;//simboliza que no encuentra patata
        }else{
            //caso recursivo
            if(texto.charAt(cont)==palabraQueBusco.charAt(
                    letraDePalabraBuscadaPorDondeVoy)){
                    if(letraDePalabraBuscadaPorDondeVoy>=palabraQueBusco.length()-1){
                        return cont-palabraQueBusco.length();
                    }
                    return busquedaRecursiva(cont+1,texto,
                            letraDePalabraBuscadaPorDondeVoy+1,palabraQueBusco);
            }
            //Como cont++ en el bucle
            
            return busquedaRecursiva(cont+1,texto, 0, palabraQueBusco);
        
        }
    }

}