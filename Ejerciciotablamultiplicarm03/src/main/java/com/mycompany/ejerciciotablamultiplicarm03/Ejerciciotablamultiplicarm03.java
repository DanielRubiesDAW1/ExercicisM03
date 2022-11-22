/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejerciciotablamultiplicarm03;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Ejerciciotablamultiplicarm03 {

    public static void main(String[] args) {
        
             Scanner sc = new Scanner(System.in); 
        Random rd = new Random();
        
        int aleatori = 0;
        int numero = 0;
        int numero_tabla;
        int contador=0;
        int calculo;
        contador=1;
        
        System.out.println("Dime el numero de la tabla que quieras saber");
        numero_tabla =sc.nextInt();
        
           
            
        
           
        for (int i= 1; i<=10;i++){
            
        {
            
                        aleatori = rd.nextInt(9)+1;

            contador++;
        }
        

        
                System.out.println("--------------- ");


        System.out.println(numero_tabla +"*"+i+"="+aleatori);

        }
        
               // System.out.println("Has fallado "+contador+ "veces");

    }
}


















     //for(int i=1;i<=9;i++){
             
       	//System.out.println(numero_tabla+"*"+i+"="+aleatori);
        //respuesta=sc.nextInt();
	//
        
			//if(respuesta!=calculo_tabla){
				//System.out.println("La resposta correcta és "+calculo_tabla);
				//cont_errores++;
                                                    System.out.println("Has tenido"+cont_errores+"errores");

			}
              
                   // System.out.println("Has tenido"+cont_errores+"errores");

        }
           

    }