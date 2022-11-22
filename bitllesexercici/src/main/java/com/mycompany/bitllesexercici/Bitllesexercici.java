/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.bitllesexercici;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Bitllesexercici {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
   
        System.out.println("Cuantaranyes tens?");
        int aranyes=sc.nextInt();
        
        int bitlles=Contarbitlles(aranyes);
       
        System.out.println("El resultado es "+bitlles);
        
    }

    private static int Contarbitlles(int files){
    
    int bitlles;
    
    if (files==1){
    
        bitlles=1;
        return bitlles;
    
    }
        
    else if(files>1){
    
    return 8+Contarbitlles(files-1);
        
    }
   
    
    
    
        return 0;
    
    }

}