/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici6funcions;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Exercici6funcions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        double precio;
        double IVA;
       
        for(int i=0;i<5;i++){
            
        System.out.print("Introduce el primer precio: ");
        precio= sc.nextDouble();
        
        IVA=precioConIVA(precio);
        System.out.println("Tu precio con IVA es "+IVA);
        }
        
    }
    
    public static double precioConIVA(double precio){

    double precioIVA;
            
    precioIVA=precio+1.21;
    
    return precioIVA;
    
}
}

//iva 1.21