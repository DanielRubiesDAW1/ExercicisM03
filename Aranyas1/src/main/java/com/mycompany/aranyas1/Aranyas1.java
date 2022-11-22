/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aranyas1;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Aranyas1 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   
        System.out.println("Cuantaranyes tens?");
        int aranyes=sc.nextInt();
        
        int potes=potesaranyes(aranyes);
       
        System.out.println("El resultado es "+potes);
        
    }

    private static int potesaranyes(int aranyes){
    
    
    if (aranyes==0){
    
        return 0;
    
    }
    if(aranyes<=1){
    
        return 8;
    }
        
    else if(aranyes>1){
    
    return 8+potesaranyes(aranyes-1);
    }
    
        return 0;
    
    }

}

