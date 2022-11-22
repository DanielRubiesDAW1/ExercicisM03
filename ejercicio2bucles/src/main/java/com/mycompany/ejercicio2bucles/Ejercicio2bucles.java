/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio2bucles;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Ejercicio2bucles {

    public static void main(String[] args) {

    int num;
    
    Scanner sc = new Scanner(System.in); 
    
    
    do{
    
    System.out.println("Pon numeros para terminar escribe 0");
    num=sc.nextInt();
    
    if(num<0){
            System.out.println("numero negativo no vadilo");

    }
    
    else if (num>0){
    
            System.out.println("Has escruti --> "+num);

    }
    
    }
    while(num!=0);//!= significa diferente de X el numero que sea

        System.out.println("Fin del programa");

        
       // while(!(num=0)); Esta condicion sirve para que continue es decir lo invertiria (si pusiera un 6 no seria iguala 0 pero la tener ! si seria )
    }
}
