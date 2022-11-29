/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejemplo1arrays;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Ejemplo1ARRAYS {

    public static void main(String[] args) {
        
        int [] notes;
        int num_notas=4;
        
        notes=new int[num_notas];//10 son espacios desde el 0 al 9 en estre caso.
        notes[0]=3;
        notes[1]=4;
        notes[2]=7;
        notes[3]=1;

        
        System.out.println("Mostrar posicions array: ");
        System.out.println("notes: "+notes);
   
        //Utilitats.morarArray(notes);
    System.out.println("-----------------------------------------------------");
        
        int suma;
        double media;
        
        suma=calcularSumaNotas(notes);
        

        media=(double)suma/notes.length;
        
        System.out.println("La nota media es "+media);

        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon tus notas: ");
        
        for (int i = 0; i < notes.length; i++) {
        
            System.out.println("introdueix la nota "+(i+1));
            notes[i]=sc.nextInt();
        }
        
             suma=calcularSumaNotas(notes);

        media=(double)suma/notes.length;
        System.out.println("La nota media es "+media);
        
        int []copia_notes=new int[num_notas];
        
        for (int i = 0; i < notes.length; i++) {
        
            copia_notes[i]=notes[i];
        }
        
        System.out.println("Array copia");
        
        
    }

private static int calcularSumaNotas(int[] notes){

        int suma=0;
        
        for (int i = 0; i < notes.length; i++) {
            
            System.out.println("Posocion "+i+" Acumulo el valor "+notes[1]);
            suma=suma+notes[i];
            System.out.println("Acumulado por ahora "+suma);
        
        }
        
        return suma;
       
}





}
            
            


