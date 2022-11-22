/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercici4recursivitat;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Exercici4Recursivitat {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Pon un numero de entrada: ");
        int num1=sc.nextInt();
        System.out.println("Pon un segundo numero de entrada: ");
        int num2=sc.nextInt();
        
        int sortida=Algoritmerecursiu(num1,num2);
        
                System.out.println("Sortida: "+sortida);
    }
    
    public static int Algoritmerecursiu(int minimo, int maximo){
        
        int v1;

        if(minimo>maximo){ //intercambiar valores
            
        v1=maximo;
        maximo=minimo;
        minimo=v1;
        
        }
        
        
        if(minimo==maximo){
        
            return maximo; //podira ser tambine n1 porque como serian igual.
            
        }
        
        else if(maximo>minimo){
        
            return maximo+Algoritmerecursiu(minimo,maximo-1);
            
        }
    return -1;    
         
    }
    
   }
    
    

