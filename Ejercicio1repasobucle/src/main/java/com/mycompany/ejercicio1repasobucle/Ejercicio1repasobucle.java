/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio1repasobucle;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Ejercicio1repasobucle {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        
        int num;
        int contador_div3=0;
        int acum_num=0;
        int contador_num=0;
        
        do{
        System.out.println("Pon numeros cuando lleves 3 disibiles por 3 para");
        num=sc.nextInt();
        contador_num++; //esto es para contar los numeros totales
        
        if(num%3==0){
            
            acum_num=acum_num+num;
            contador_div3++; //mientras que este cuenta solo los divisibles entre 3 para que termine el programa

        
        }
        
        }while(contador_div3<3);
        
            System.out.println("Has introducido "+contador_num+" numeros");

            System.out.println("La suma acumulada de los 3 numeros es "+acum_num);

        
    }
}
