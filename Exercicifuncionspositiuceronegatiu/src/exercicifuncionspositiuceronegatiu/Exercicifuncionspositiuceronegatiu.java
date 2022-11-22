/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicifuncionspositiuceronegatiu;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Exercicifuncionspositiuceronegatiu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
                Scanner sc=new Scanner(System.in);
                
        int num;
        int signo;

        System.out.println("Introduce un numero: ");
        num = sc.nextInt();
        
        signo=dimeSigno(num);
        
        if(num > 0){
            
            System.out.println("El numero es positivo");

        }
        
        if(num < 0){
           
            System.out.println("El numero es negativo");

        }        
        
        
        else{
            
            System.out.println("El numero es cero");

        }
            
        }
        
    
    
    public static int dimeSigno(int num){
    
 
        int signo;
        
        if (num==0){
        
        signo=0;;
        
        }
        
        else if(num>0){
        
        signo=1;
        
        }
        else{
        
         signo=-1;
            
        }
        
       return signo;       
}  
    

        
    
    
}