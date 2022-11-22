/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2examenbucles2;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Ejercicio2Examenbucles2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in); 

    double temp_min;
    double temp_max;
    double graus_fah;
    double graus_c;
    double cont = 0;
    
    System.out.println("Introduce la temperatura minima: ");
        temp_min=sc.nextDouble();
    //comprobacion guardada de System.out.println(temp_min);
    System.out.println("Introduce la temperatura maxima: ");
        temp_max=sc.nextDouble();
        //comprobacion guardada de System.out.println(temp_max);

   
                    System.out.println("------------------");

    
    
  
            for (graus_c = temp_min; graus_c <=temp_max; graus_c++) {
                        
                cont++;
                        graus_fah=(double) 9/5*cont+32;
                        System.out.println(graus_fah+" F ");
                    
                        System.out.println("------------------");

                         System.out.print(graus_c+" C | ");



    
    }
    }
}
