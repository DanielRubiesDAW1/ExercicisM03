/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.primerejemplofactorial;

/**
 *
 * @author daru4279
 */
public class PrimerEjemploFactorial {

    public static void main(String[] args) {
        int valor =5;
        
        System.out.println(valor+"! = "+factorial(valor));
    }
    
    public static int factorial(int n){
            
        int resultado;
            if(n==1){
                
                System.out.println("case base 1 retorno 1");

                return 1;
            }
    
            else if(n==0){
                            System.out.println("case base 0 retorno 1");

            return 1;
            }
            
            else{ //if n>1
                System.out.println("crido a "+n+"* factorial("+(n-1)+")");
            
                resultado =n*factorial(n-1);
                System.out.println("factorial("+n+") retorna "+resultado);
                return resultado;
            } 
    }
}
