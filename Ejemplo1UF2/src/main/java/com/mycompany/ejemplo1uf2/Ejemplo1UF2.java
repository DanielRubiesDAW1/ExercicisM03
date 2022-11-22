/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejemplo1uf2;

/**
 *
 * @author daru4279
 */
public class Ejemplo1UF2 {

    public static void main(String[] args) {
   
        int idioma=1;
        int calculo=0;
        int julia=2;
        //char hello_goodbye='A';
        //System.out.println("idioma en main antes de llamar funcion"+idioma);
        imprimeHelloWorldidiomas(idioma);
        //System.out.println("idioma en main despues de llamar funcion"+idioma);
        System.out.println("Antes de llamar al doble "+calculo);
        calculo=doble(julia);
        System.out.println("Antes de despues de llamar al doble "+calculo);
        
        calculo=doble(idioma);
        System.out.println("Antes de llamar al doble "+calculo);
        int variabledoble=doble(idioma);
        System.out.println("Despues de llamar al doble "+variabledoble);
        System.out.println("El doble es "+doble(julia));
        
    }
    
    //ejemplo2
    
    public static int doble(int a) {
    int resultado = a * 2;
    return resultado; //public static int quiere decir que l avariable return debede ser tipo int
    }
    
    /**
     * devuelve el doble de un numero
     * @param a entero que sera el numero 
     */ 
    
    
    
    
    
    public static void imprimeHelloWorldidiomas(int idioma){
    
                
        
        System.out.println("idioma o el valor de x que me ha llegado "+idioma);
                
        switch(idioma){
        
            case 1:
                
                System.out.println("Hello World!");
                System.out.println("goodbye");
                
                break;
                
                
            case 2:
                
                System.out.println("Hola mundo");
                System.out.println("adios");                
        
                break;
                
                
            case 3: 
                
                System.out.println("Hola mon");
                System.out.println("adeu");
                
                break;
        
        }
            idioma=7;
        System.out.println("idioma en helloworld final "+idioma);

        
    }

    public static void imprimeHelloWorldidiomasadios(int idioma,char hello_goodbye){


        if(idioma==1){
            
            if(hello_goodbye=='h'){
                    
                System.out.println("Hello World!");
                
            }
            else if(hello_goodbye=='A'){
                
                System.out.println("goodbye");

            }
            
                
            
        System.out.println("Hello World!");
        System.out.println("goodbye");
        }
        else if(idioma==2){
        System.out.println("Hola mundo");
        System.out.println("adios");
                }
        else{
                
         System.out.println("Hola mon");
        System.out.println("adeu");
                }
        
        
    }
    
}
    
    

