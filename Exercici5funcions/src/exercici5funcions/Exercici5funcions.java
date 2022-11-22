/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici5funcions;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Exercici5funcions {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        double km;
        int millas;

        System.out.println("Escribe las millas que quieres pasar a kilometros");
        millas = sc.nextInt();

        km= millas_a_kilometros(millas);
        
        System.out.println("Los kilemtros son "+km);
    }
    
    
        public static double millas_a_kilometros(int millas){
        
        double kil=0;
        
        kil=millas*1.60934;
        
        return kil;
        
        }

    
    
}
