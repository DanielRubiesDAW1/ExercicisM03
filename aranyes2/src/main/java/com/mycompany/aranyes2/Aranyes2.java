/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aranyes2;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Aranyes2 {

    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   
        System.out.println("Cuantaranyes tens?");
        int aranyes=sc.nextInt();
        
        int potes=potesmutants(aranyes);
       
        System.out.println("El resultado es "+potes);
        
    }

    private static int potesmutants(int aranyes){
    
    
    if (aranyes==0){
    
        return 0;
    
    }
        
    else if(aranyes%2!=0){
    
    return 8+potesmutants(aranyes-1);
        
    }
    
    else if(aranyes%2==0){
    
        return 6+potesmutants(aranyes-1);
    }
    
    
    
        return 0;
    
    }

}