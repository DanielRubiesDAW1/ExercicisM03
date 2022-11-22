/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejemplom03aleatorio;

import java.util.Random;

/**
 *
 * @author daru4279
 */
public class Ejemplom03aleatorio {

    public static void main(String[] args) {
        Random rd = new Random();
        
        int aleatorio;
        
        System.out.println("Del 1 al 10");
        for (int i= 0; i<10;i++){
    
        aleatorio = rd.nextInt(10)+1;
        
        
        System.out.println(aleatorio +"");
        }
        
        
        System.out.println("-----------");
        System.out.println("Del 5 al 10");

        for (int i= 0; i<10;i++){
    
        aleatorio = rd.nextInt(11)+5;
        System.out.println(aleatorio +"");

        }

    }
}
