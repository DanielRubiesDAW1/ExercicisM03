/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercciciopetardoswii;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Ejercciciopetardoswii {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in); 
        Random rd = new Random();
        int petardo1;
        int petardo2;
        int petardo3;
        
        
        System.out.println("Que petardo quieres (1-3)?");
        
        int petardo_elegido;
        petardo_elegido=sc.nextInt();
        System.out.println("Has elegido el petardo "+petardo_elegido);
        
        petardo1=rd.nextInt(10)+1;
        System.out.println("P1 "+petardo1);
        petardo2=rd.nextInt(10)+1;
        System.out.println("P2 "+petardo2);
        petardo3=rd.nextInt(10)+1;
        System.out.println("P3 "+petardo3);
        
        switch(petardo_elegido){
        
            case 1:
                
                if(petardo1>=petardo2 && petardo1>=petardo3){
                    System.out.println("Has ganado");
                }
                //Podriamos quitar los else y simplemente hacer un boolean que sea falso por defecto por ejemplo win y en vez de else poner win = true en todos
                //asi win=true
                else{
                    System.out.println("Has perdido");
                }
                
                    break;
                    
            case 2: 
                
                if(petardo2>=petardo1 && petardo2>=petardo3){
                    System.out.println("Has ganado");
                }
                
                else{
                    System.out.println("Has perdido");
                }
                
                    break;                    
                    
                
            case 3:
                
                if(petardo3>=petardo1 && petardo3>=petardo2){
                    System.out.println("Has ganado");
                }
                
                else{
                    System.out.println("Has perdido");
                }
                
                    break;
                    
            default:
                    System.out.println("Eleccion incorrecta");
          
        }
      
        
        //asteriscos y espacios
        
        for (int linea =1;linea<=10; linea++){

            if(linea<=petardo1){
            System.out.print("* ");   //le hemos quitadoel ln para que pueda escribir al lado
            }
        
            else{
                System.out.print("  ");
            }
        
            if(linea<=petardo2){
            System.out.print("* ");   //le hemos quitadoel ln para que pueda escribir al lado
            }
        
            else{
                System.out.print("  ");
            }
            
            if(linea<=petardo3){
            System.out.print("* ");   //le hemos quitadoel ln para que pueda escribir al lado
            }
        
            else{
                System.out.print("  ");
            }
            
            System.out.println("");//esto es un return

        
        
                    Thread.sleep(500);

        }
                    
    }      
  }


