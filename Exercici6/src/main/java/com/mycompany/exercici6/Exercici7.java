/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercici6;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Exercici7 {

    public static void main(String[] args) {
        
        int milla;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon millas que transformare a metros");
        milla = sc.nextInt();
        final int MILLA_METROS = 1852;
        
        int metros = milla * MILLA_METROS;
        System.out.println(milla + " millas son  en metros  " + metros);

        
    }
}
