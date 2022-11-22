/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio3examenbucles;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Ejercicio3examenbucles {

    public static void main(String[] args) {
        
    
        Scanner sc = new Scanner(System.in); 
            Random rd = new Random();
            int num_aleatori= rd.nextInt(9)+1;

        int resultado;
        int cont_errores=0;
        int respuesta;
        int calculo;
        
        System.out.println("Taula de multiplicar del: ");
        System.out.println(num_aleatori);

        
        for(int i=1;i<=10;i++){
            
        calculo=i*num_aleatori;
        
       	System.out.print(num_aleatori+"*"+i+"= ");
        respuesta=sc.nextInt();
		
		if(respuesta!=calculo){
                    
                    System.out.println("La resposta correcta és "+calculo);
                    cont_errores++;
                    
		}
              
        }
        
            System.out.println("Has tenido "+cont_errores+" errores");


    }
}



    

    