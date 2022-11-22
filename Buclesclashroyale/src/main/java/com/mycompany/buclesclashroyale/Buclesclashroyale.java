/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.buclesclashroyale;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Buclesclashroyale {

    public static void main(String[] args) throws InterruptedException {
        
        Scanner sc = new Scanner(System.in); 
        
        final int LVL_MAX_LLENYATAIRE=11;
        final int LVL_MIN_LLENYATAIRE=9;
        int nivel_llenyataire=0;
        final int LVL_MAX_TORRE=3;
        final int LVL_MIN_TORRE=1;
        int nivel_torre;
        
        do{
        System.out.println("Quin nivell es el llenyataire ("+LVL_MIN_LLENYATAIRE+"-"+LVL_MAX_LLENYATAIRE+")?");
        nivel_llenyataire=sc.nextInt();
        }while(nivel_llenyataire<LVL_MIN_LLENYATAIRE || nivel_llenyataire>LVL_MAX_LLENYATAIRE);
        
        
        
        do{
        System.out.println("Quin nivell es la torre ?");
        nivel_torre=sc.nextInt();
        }while(nivel_torre<LVL_MIN_TORRE || nivel_torre>LVL_MAX_TORRE);
        
        int vida_llenyataire;
        int vida_torre=0;
        int dany_torre;
        int dany_llenyataire = 0;
        
        

        switch(nivel_llenyataire) {
        
            case 9:
                dany_llenyataire = 200;
                vida_llenyataire = 1060;

                break;
                
            case 10:
                dany_llenyataire = 220;
                vida_llenyataire = 1166;

                break;
            case 11:
                dany_llenyataire = 224;
                vida_llenyataire = 1282;

                break;     
                
            default:
                  dany_llenyataire=1;  
          System.out.println("Nivel incorrecto");              
                throw new AssertionError();
                  

        
        }
        
               switch(nivel_torre) {
        
            case 1:
                vida_torre = 1400;
                dany_torre = 50;

                break;
                
            case 2:
                vida_torre = 1512;
                dany_torre = 54;

                break;
            case 3:
                vida_torre = 1624;
                dany_torre = 58;

                break;     
                
            default:
          System.out.println("Nivel incorrecto");              
          vida_torre=1;      
          throw new AssertionError();
        
        }
        
    int contadorgolpesllenyatiare=0;
               
    //int danytorredoble = dany_torre*2; //-> Esto si quisieramos hacer que la torre pegara mas rapido que el leñador despues cambiariamos en un sout dany_torre por danytorredoble
    
    while((vida_torre > 0 && vida_llenyataire > 0)){  //esto significa que mientras tengan mas vida que cero continuara

    vida_torre= vida_torre-dany_llenyataire;
    vida_llenyataire= vida_llenyataire-dany_torre;
        
        contadorgolpesllenyatiare++;
            Thread.sleep(500);
            System.out.println("Llenyador ataca con fuerza de valor " + dany_llenyataire + ". La torre le queda de vida=" + vida_torre );              
            System.out.println("La torre ataca " + dany_torre + ". Al llenyataire le queda de vida=" + vida_llenyataire );              

    }
    
        if(vida_torre<=0 && vida_llenyataire<=0){
        
        }
        if(vida_torre<=0){
            System.out.println("El Llenyador ha guanyat"); 

        }
        
        else if(vida_llenyataire<=0){
            System.out.println("La torre ha guanyat"); 

        }
        
        System.out.println("Llenyador ha atacat "+contadorgolpesllenyatiare+" vegadas"); 
                    

        
    }
}
