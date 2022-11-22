/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.correcion7funcions;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Correcion7funcions {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        double perimetro;
        double area;
        
        System.out.println("Pon el ancho del rectangulo: ");
        double ancho=sc.nextDouble();
        System.out.println("Pon el alto del rectangulo: ");
        double alto=sc.nextDouble();

        perimetro=perimetroRectangulo(ancho,alto);
        area=areaRectangulo(ancho,alto);
        
        System.out.println("Pon el area es: "+area);
        System.out.println("Pon el perimetro es: "+perimetro);

    
    }



    public static double perimetroRectangulo(double ancho, double alto){
        
        double perimetro;
        
        perimetro=ancho*2+alto*2;
        
        return perimetro;
    }
    
        public static double areaRectangulo(double ancho, double alto){
        
        double area;
        
        area=ancho*alto;
        
        return area;
    }
}
