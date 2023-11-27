/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.argumentos;
public class Argumentos {

        public static void main(String[] args) {
       
        String argumento0 = args[0];
        //String argumento1 = args[1];
        
      
        System.out.println("Argumemto 0: " +argumento0);  
        //System.out.println("Argumemto 1: " +argumento1);
        
        
        switch (argumento0){
            case "1":{
                System.out.println("Idioma Español");
                break;
            }
            case "2":{
                System.out.println("Hi! I´m Muzzy");
                break;
            }
            default:{
                System.out.println("Argumento equivocado");
                break;
            }
        }
                   
        
    }
}
