/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercici18;

import java.util.Scanner;

/**
 *
 * @author daru4279
 */
public class Exercici18 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int horas,h_extra;
        double precio_horas;
        double salario,salario_extra,salario_hnormales, salario_bruto = 0;
        final int horas_normales = 35, salario_sin_impuestos = 500;
        
        System.out.println("Escribe las horas trabajadas ");
        horas = sc.nextInt();
        System.out.println("Escribe el precio por hora ");
        precio_horas = sc.nextDouble(); 
        
        if(horas > horas_normales){
        
        salario_hnormales = horas_normales * precio_horas;
        h_extra = horas - horas_normales;
        salario_extra = precio_horas * h_extra * 1.5;
        salario= salario_hnormales+salario_extra;
        salario_bruto = salario_hnormales + salario_extra;
    
        }
        
        else{
        
        salario = horas * precio_horas;
        }
        
                System.out.println("Te pagaran " + salario + "Extra");

        
       //parte 2 18 
       double salario_final;
       double salario_aplicat_impostos,impuestos = 0;
       
        if(salario_bruto > salario_sin_impuestos){

            salario_aplicat_impostos = salario_bruto - salario_sin_impuestos;
            impuestos = salario_aplicat_impostos * 0.25;
            salario_final = salario_bruto - impuestos;
        } 
        
        else{
        
        salario_final = salario_bruto;
        }
        
        System.out.println("El salario bruto es "+salario_bruto);
        System.out.println("Los impuestos seran "+ impuestos);
        System.out.println("Salario neto " +salario_final+"Euros");

        

    }

}

