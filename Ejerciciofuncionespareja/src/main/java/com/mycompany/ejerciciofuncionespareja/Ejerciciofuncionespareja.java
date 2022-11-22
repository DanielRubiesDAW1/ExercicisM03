/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejerciciofuncionespareja;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Ejerciciofuncionespareja {

    public static void main(String[] args) {
        int jugada,jugadaordenador,ganador,playerchoose;
        int point_player2=0, point_player1=0;
        int jugadas=0;
        
        jugada=jugada();
        System.out.print("Jugador");
        imp_jugada(playerchoose);
        jugadaordenador=jugada_ordenador();
        imp_jugadaordenador(computerchoose);
        System.out.print("Ordenador");
        
        ganador=resultado();
        
        
        if(ganador==1){
        
            point_player1++;
        }
        
        else if(ganador==2){
        
            point_player2++;
            
        }
        
        jugadas++;
        marcador(point_player1,point_player2);
    }while(point_player1<3 && point_player2<3 && jugadas<6);
            
    }
    public static int jugada(){
        Scanner sc = new Scanner(System.in); 

        int eleccionjugador;
        
        do{
            
            System.out.print("Introduce un valor piedra(0), papel(1), tijera(2): ");
            eleccionjugador=sc.nextInt();
            
         
            
        }while(eleccionjugador<0 || eleccionjugador>2);
        return eleccionjugador;
    }
         
        public static int jugada_ordenador(){
        Random rd = new Random();
        int jugadaordenador = rd.nextInt(3);
        
        return jugadaordenador;
           }
        
        
        
      public static void imp_jugada(int player){

        
        if(playerchoose==0){
            
        System.out.println("PIEDRA");
            
        }
        
        else if(playerchoose==1){
                        
            System.out.println("PAPEL");
                        
                }
                        
        else if(playerchoose==2){
                        
            System.out.println("TIJERA");
        }
        else
        {
            System.out.println("opcion incorrecta");
        }
                        

      }
      
       //SEPARACION GANADOR
        public static int ganador(int choose_player1, int choose_player2){
        Scanner sc = new Scanner (System.in);   
        
        int resultado=0;
        if(choose_player1==choose_player2){
            
            System.out.println("0");
            resultado=0;
        }
        
        else if(choose_player1==0 && choose_player2==1){
        
                    System.out.println("2");
                   resultado = 2;
        }
        
         else if(choose_player1==1 && choose_player2==0){
        
                    System.out.println("1");
                    resultado = 1;
        
        }
        
            else if(choose_player1==0 && choose_player2==2){
        
                    System.out.println("1");
                    resultado=1;
        
        }
            
           else if(choose_player1==2 && choose_player2==0){
        
                    System.out.println("2");
                    resultado=2;
        
        }
        
        
           else if(choose_player1==1 && choose_player2==1){
        
                    System.out.println("0");
                    resultado=0;
        }
        
           else if(choose_player1==1 && choose_player2==2){
        
                    System.out.println("2");
                    resultado=2;
        
        }
        
           else if(choose_player1==2 && choose_player2==1){
        
                    System.out.println("1");
                    resultado=1;
        
        }
        
           else if(choose_player1==2 && choose_player2==2){
        
                    System.out.println("0");
                    resultado=0;

        }
        return resultado;
       }
        
        public static void imp_ganador(int ganador){
            if (ganador==1) {
                System.out.println("JUGADOR 1 GANA");
            }
            else if (ganador==2) {
                System.out.println("JUGADOR 2 GANA");
                
            }
            else if(ganador==0){
                System.out.println("EMPATE");
            }
            
        }
        
        //SEPARACION MARCADOR
        public static void marcador(int point_player1, int point_player2){    

            System.out.println("******************************************");
            System.out.println("Marcador: JUGADOR1 = "+point_player1+" JUGADOR2= "+point_player2);
            System.out.println("******************************************");

        }
     }


    
    

