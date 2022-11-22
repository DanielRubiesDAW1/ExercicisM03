/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.utilitats;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Utilitats {

    
    public static int pedirValorPositivo(){
    
        Scanner sc = new Scanner(System.in);
        int valor;
        
        do{
        
            System.out.println("Pon un valor positivo ");
            valor=sc.nextInt();
        }while(valor<=0);
        
        return valor;    
        
        
    }
    
     public static int pedirValorPositivoFrase(String frase){
    
        Scanner sc = new Scanner(System.in);
        int valor;
        
        do{
        
            System.out.println(frase);
            valor=sc.nextInt();
        }while(valor<=0);
        
        return valor;    
        
        
    }
     
    public static int pedirValorEntreDosNumeros(){
    
        Scanner sc = new Scanner(System.in);

    
    }
    
}






    
//        Millas a KM:
     
//        Scanner sc = new Scanner(System.in);
//        int millas;
//        double km;
//        System.out.println("Escribe las millas que quieres pasar a kilometros"); 
//        millas = sc.nextInt();
//        km = millas_a_kilometros(millas);
//        
//        System.out.println("Los kilometros son " +km);
//     
//    ------




