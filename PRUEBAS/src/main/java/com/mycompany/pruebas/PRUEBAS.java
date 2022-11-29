/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pruebas;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class PRUEBAS {

    public static void main(String[] args) {
 
      Scanner sc = new Scanner(System.in);
         int id;
        int any;
        int menu;
        int respuestamenu;
        int generarpassword=0;
        boolean verificar;
        System.out.println("umero de usuario");
        id=llegirNumero();
        System.out.println("Escribe el año");
        any=sc.nextInt();
        int respuesta;
        System.out.println("Conoces la contraseña? 0=no 1=si");
        respuesta=sc.nextInt();
        if(respuesta==0){
        
        generarpassword=generarContrasenya(id, any);
        
        }
        if(respuesta==1){
            System.out.println("Escriba la password para verificar la identidad");
            verificar=verificarCredencials(id, any, generarpassword);
            if(verificar==true){
                
                
                do{
                System.out.println("*****Menu*****");
                System.out.println("0.Sortir");
                System.out.println("1.Mostrar perfil usuario");
                System.out.println("Entra una opcion");
                respuestamenu=sc.nextInt();
                if(respuestamenu==1){
                    menu=mostrarPerilUsario(id, any, generarpassword);}
                if(respuestamenu==0){
                System.out.println("Fins aviat");
                }
                
                
                
                }while(respuestamenu!=0);
                
                
                
                
            
            }
            
            else{
            
                System.out.println("Fin programa");
            
            }
            
            
            
            
        }
        
        
        
    }
    
    private static int llegirNumero(){
    int num;
    //Esta funcion hace que tengamos que escribir un numero entre 999 y 9.999
    
    do{
    System.out.println("Escribe un numero entre 1.000 y 10.000");
    Scanner sc= new Scanner(System.in);
    num=sc.nextInt();
    }while(num <=1000 || num>=10000);
    
    return num;
    
    
    }
    
    
    private static int generarContrasenya(int num,int anyo){
    //aqui genera la contraseña con los datos del numero de id y el año de nacimiento
    int password;
    password=num*anyo;
    password=password%10000;
    
        System.out.println("La password generada es : "+password);
    //801
    return password;
    }
    
    private static boolean verificarCredencials(int num,int anyo,int password){
        //en esta funcion verificamos si la contraseña que pusimos es correcta o no
        boolean respuesta;
        Scanner sc= new Scanner(System.in);
        System.out.println("Verificación credencial");
        System.out.println("id:"+num+" Anyo"+anyo);
        System.out.println("Ingrese la password");
        password=sc.nextInt();
        
        if(password==num*anyo/10000){
            System.out.println("Correcto");
            respuesta=true;
        
        }
        else{
            System.out.println("Error, valores incorrectos");
            respuesta=false;
        }
    
    
    return respuesta;
    }
    
    
    private static int mostrarPerilUsario(int num,int anyo,int password){
        anyo=2022-anyo;
        //aqui muestra los datos
        System.out.println("*********");
        System.out.println(num+"-"+anyo+"-"+password);
        System.out.println("*********");
        
    
    
    
    return anyo;
    }
    
    
    
    
}

