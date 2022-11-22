/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exerciciturro;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class ExerciciTurro {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Pon el dia: ");
        int dia=sc.nextInt();
     
        
        int sortida=Contartrozos(dia);
        
                System.out.println("Sortida: "+sortida);
        

    }
    
    public static int Contarcalorias(int dia){
    
        int calorias=91;
        
        if(dia==0){
        
            
            return 0;
            
        }
        
        else if(dia==1){
        
        return 4*calorias;
        
        }
        
        else if(dia%3==0){

        return (1*calorias)+Contartrozos(dia-1);

        }
         
        else if(dia>0){
        
            return (4*calorias)+Contartrozos(dia-1);
        
        }
        
       
    
        
        return -1;
        
    }
    
       public static int Contartrozos(int dia){
    
        if(dia==0){
        
            
            return 0;
            
        }
        
        else if(dia==1){
        
        return 4;
        
        }
        
        else if(dia%3==0){

        return 1+Contartrozos(dia-1);

        }
         
        else if(dia>1){
        
            return 4+Contartrozos(dia-1);
        
        }
        
       
    
        
        return -1;
       
       } 
    
    
}
