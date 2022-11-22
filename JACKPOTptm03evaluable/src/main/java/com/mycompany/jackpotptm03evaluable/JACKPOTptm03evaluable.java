/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.jackpotptm03evaluable;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class JACKPOTptm03evaluable {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    
        
        
    }
    public static int Quantitat_apostada( int saldo){
    
    int apostado = 0;
    
    do{
        
        System.out.println("Cuanto dinero quieres apostar?");
        
        if(apostado>=0 && apostado<saldo){
        
            System.out.println("Quantitat incorrecta");
            
        }
        
    }while (apostado>saldo); {
            
        }
        
        return apostado;
    
    }
    

public static int tirada_disc(){
        Random rd = new Random();
          
        int caracteraleatori; //HACERLO EN NUMERICO Y DESPUES PONERLE A ESOS VALORES QUE LETRA ES
        caracteraleatori = rd.nextInt(3);
   
       switch (caracteraleatori){
            case '0','A','a':
                if (caracteraleatori == 0){
                    System.out.println("A");
                }
              
                break;
            case '1','B','b':
                 if (caracteraleatori == 1){
                    System.out.println("B");
                }
              
                break;
            case '2','C','c':
                 if (caracteraleatori == 2){
                    System.out.println("C");
                }
                break;
            default:
                System.out.println("Opcion incorrecta");
        }
        
        return caracteraleatori;
}

public static void mostrar_tirada(char char1,char char2, char char3 ){

    
    System.out.println("*****************************");
    System.out.println("*"+char1+"-"+char2+"-"+char3+"*");  
    System.out.println("*****************************");

}

public static int Calcular_premi(){

    char parametre1 = 0;
    char parametre2 = 0;
    char parametre3 = 0;
    int parametre4;

    if(parametre1=='A' && parametre2=='A' && parametre3=='A'){
    
        System.out.println("Has ganado 5 monedas");
            
    }
    
     if(parametre2=='B' && parametre2=='B' && parametre3=='B'){
    
        System.out.println("Has ganado 2 monedas");
        
    }
     
      if(parametre3=='C' && parametre2=='C' && parametre3=='C'){
    
        System.out.println("Has ganado el doble de monedas");
          
    }
      
      else{
      
          System.out.println("No has ganado ninguna moneda");
          
      }
    
    
    
return 0;
}


public static boolean Seguir_jugant(int saldo){
    boolean correcta=true;

do{
  

if(saldo<=25 || saldo<=0){

        correcta=true;

}

else{
    
    correcta=false;

}

}while(saldo<=25);



        return correcta;
    
}


}
