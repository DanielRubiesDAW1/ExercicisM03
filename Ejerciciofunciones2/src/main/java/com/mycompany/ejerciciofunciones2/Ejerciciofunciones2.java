/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejerciciofunciones2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Ejerciciofunciones2 {

    public static void main(String[] args) {

        int saldo=100;
        int bola_player,apuesta;
        int ball, dinero_ganado;
        boolean winner;
        char seguir;
        
        do{
        bola_player=pedirNumero();        
        apuesta=pedirDineroApuesta(saldo);
        saldo=saldo-apuesta;
        System.out.println("Salida "+ saldo);
        ball=caidaBola();
        pintaAsteriscos(ball);
        winner = comprobarResultado(ball,bola_player);
        
        if(winner ==true){
            
            System.out.println("¡Has ganado!");
            dinero_ganado=ganancias(apuesta,bola_player);
            saldo= saldo+dinero_ganado;
            
        }
        else{
        
            System.out.println("Has fallado");
        }
        
        seguir=seguirJugando();
        }while(continuarJugando(seguir,saldo));
        
        System.out.println("Tu saldo es "+saldo);
    }

    
        public static int caidaBola() {

        Random rd = new Random();
        
        int tiradaazar = rd.nextInt(37);

            
            return tiradaazar;
        }
        
         public static boolean comprobarResultado (int bola, int num_apostado) {
            boolean comprobacionresultado=false;
  
            //if(num_apostado==num_apostado || bola%3==0 && num_apostado==37 || bola%2==0 && num_apostado==38){
            
            if(bola==num_apostado){
            
                return true;
            }
            
            else if(bola%2==1 && num_apostado==38){
            
                return true;
            }
                
            else if(bola%2==1 && num_apostado==37){
            
                return true;
            }
            
            else{
            
                return false;
            }
    
            
            }
             
        
         
         
                 //SEPARACION
             public static boolean continuarJugando (char respuesta, int dinero) {
                boolean seguirjugando=false;
                if((respuesta=='s' || respuesta=='S' && dinero>0)){
                
                seguirjugando=true;
                }
                
            return seguirjugando;
             }
             
             
                 //SEPARACION
             public static int ganancias (int dinero_apostado, int num_apostado){
             
                 int dinero_ganado = 0;
                 
                 if(num_apostado>=1 && num_apostado<=36){
                 
                     dinero_ganado=dinero_apostado*35;
                 
                }
                 
                 else if(num_apostado==37 || num_apostado==38){
                 
                dinero_ganado=dinero_apostado*2;
                     
                 }

                 
             return dinero_ganado;
             }
             
             
             //SEPARACION
             public static int pedirDineroApuesta(int dinero_tienes){
                Scanner sc = new Scanner(System.in); 
               
                int dineroapuesta;
                
                do{
                System.out.println("Cuanto dinero quieres apostar? (Aun tienes"+dinero_tienes+")");
                dineroapuesta=sc.nextInt();
                
                }while(dineroapuesta>dinero_tienes || dineroapuesta<=0);
                
                
                 return dineroapuesta;
             }
             
             
            //SEPARACION
            public static int pedirNumero(){
                 
            Scanner sc = new Scanner(System.in); 
            int numero;
            
            do{
            
                System.out.println("Escribe un numero del 1 al 36, 37 (impar),38(par)");
                numero=sc.nextInt();
             
             }while(numero>0 || numero<39);
        
            return numero;
    
             }
                 
            //SEPARACION
            public static void pintaAsteriscos​(int num){
     
            for (int i = 0; i < num; i++) {

                System.out.println("*");
            }
                System.out.println("--> "+num);

        }
    
            //SEPARACION
            public static char seguirJugando(){
            Scanner sc = new Scanner(System.in); 
            char eleccio=' ';
            
            do{
            
                System.out.println("Quieres seguir jugando? (S/s o n/N)");
                eleccio=sc.next().charAt(0);
            }while(!(eleccio=='s' || eleccio=='S' || eleccio=='n' || eleccio=='N'));
            
            return eleccio;
            }
    
            
    
    
    
}   

