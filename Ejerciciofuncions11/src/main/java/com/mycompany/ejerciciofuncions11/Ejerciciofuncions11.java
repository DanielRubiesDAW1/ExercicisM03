/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejerciciofuncions11;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Ejerciciofuncions11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pon el numero");
        int numero = sc.nextInt();
        
        tablaMultiplicar(numero);
        
    }
    
    
    public static void tablaMultiplicar(int num){
       
        int calculo;
        
     for(int i=1;i<=10;i++){
        calculo= i*num;           
       	System.out.print(num+"*"+i+"= "+calculo);
        
		
		
              
        }
    }

}
