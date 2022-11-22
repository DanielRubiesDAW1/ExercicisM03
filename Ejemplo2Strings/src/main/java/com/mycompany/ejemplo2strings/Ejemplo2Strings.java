/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejemplo2strings;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Ejemplo2Strings {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
            System.out.println("Pon la frase que quieras");
    String frase=sc.nextLine();

    
    int contarvocales=contaraVocales(frase);
        System.out.println("El numero de vocales es "+contarvocales);

        
        System.out.println("Pon el caracter que quieres contar de la frase: ");
        
        char letrabuscada= sc.next().charAt(0);
        int numCar=contarCaracterFrase(frase,letrabuscada);
        System.out.println("La letra "+letrabuscada+"esta en la posicion "+numCar);
        
        
    }

    public void  MayusculayMinuscula(String[] args) {
  
        String MayusculaYMinuscula = "Frase de ejemplo minuscula y mayuscula";

        System.out.println(MayusculaYMinuscula.toUpperCase());
        System.out.println(MayusculaYMinuscula.toLowerCase());


}
    
    public static int contaraA(String frase) {
        
       int contarA=0; 
        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i)=='a'){
            
                System.out.println("incremento contador");
                contarA++;
            
            }
        }
        
        return contarA;
    }
    
        public static int contaraVocales(String frase) {
        
       int contarvocales=0; 
        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i)=='a' || frase.charAt(i)=='e' || frase.charAt(i)=='i' || frase.charAt(i)=='o' || frase.charAt(i)=='u') {
            
                System.out.println("incremento contador");
                contarvocales++;
            
            }
        }
        
        return contarvocales;
    }
        
        private static int contarCaracterFrase(String frase, char letra){
        
            int contarcaracters=0;
            for (int i = 0; i < frase.length(); i++) {
            
                if(frase.charAt(i)==letra){}
            
                contarcaracters++;
                
                
            }
            
        return contarcaracters;
            
        }
        
        public static void  FrasesinEspacios(String frase) {

            System.out.println(frase.replace(' ', ' '));
        
            for (int i = 0; frase.charAt(i) < 10; i++) {
                
                System.out.println(frase.charAt(i));
            }
        }
}