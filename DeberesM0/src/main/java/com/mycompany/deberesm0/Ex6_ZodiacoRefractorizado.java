package com.mycompany.deberesm0;



import java.util.Scanner;

public class Ex6_ZodiacoRefractorizado {

    /**
     *  6) Obre la classe Ex6_Zodiaco i aplica les següents refraccions:
        1. Canvia el nom de la classe per Ex6_ZodiacoRefractorizado
        2. Canvia el nom de dues variables, les que vulguis.
        3. Converteix el número 31 i el número 12 en constants.
        4. Ubica el codi al voltant de la fase 3 en un mètode apart.
     */
    public static void main(String[] args) {
        //Fase uno (Coge los datos del usuario)
        System.out.println("Adivina tu signo del Zodiaco.");
        Scanner sc = new Scanner(System.in);
        boolean respuestasOK = true;
        
        final int DiasMAX=31;
        final int MesMAX=12;
        
        System.out.println("¿Que dia naciste?(1-31)");
        int diaNACIMIENTO = sc.nextInt();

        System.out.println("¿En que mes naciste?(1-12)");
        int mesNACIMIENTO = sc.nextInt();

        //Fase dos (Verifica los datos del usuario)
        respuestasOK = diaNACIMIENTO > 0 && diaNACIMIENTO <= DiasMAX;
        respuestasOK = respuestasOK && mesNACIMIENTO > 0 && mesNACIMIENTO <= 12;

        System.out.println();
        String Signo="";
        if (respuestasOK) {
            //Fase tres (Calculando datos)
            System.out.println("Calculando");
            if (diaNACIMIENTO >= 21 && mesNACIMIENTO == 3 || diaNACIMIENTO <= 20 && mesNACIMIENTO == 4) {
                Signo="Aries";
            }

            if (diaNACIMIENTO >= 21 && mesNACIMIENTO == 4 || diaNACIMIENTO <= 21 && mesNACIMIENTO == 5) {
                Signo="Tauro";
            }

            if (diaNACIMIENTO >= 22 && mesNACIMIENTO == 5 || diaNACIMIENTO <= 21 && mesNACIMIENTO == 6) {
                Signo="Geminis";
            }

            if (diaNACIMIENTO >= 21 && mesNACIMIENTO == 6 || diaNACIMIENTO <= 27 && mesNACIMIENTO == 7) {
                Signo="Cancer";
            }

            if (diaNACIMIENTO >= 24 && mesNACIMIENTO == 7 || diaNACIMIENTO <= 23 && mesNACIMIENTO == 8) {
                Signo="Leo";
            }

            if (diaNACIMIENTO >= 24 && mesNACIMIENTO == 8 || diaNACIMIENTO <= 23 && mesNACIMIENTO == 9) {
                Signo="Virgo";
            }

            if (diaNACIMIENTO >= 24 && mesNACIMIENTO == 9 || diaNACIMIENTO <= 23 && mesNACIMIENTO == 10) {
                Signo="Libra";
            }

            if (diaNACIMIENTO >= 24 && mesNACIMIENTO == 10 || diaNACIMIENTO <= 22 && mesNACIMIENTO == 11) {
                Signo="Escorpio";
            }

            if (diaNACIMIENTO >= 23 && mesNACIMIENTO == 11 || diaNACIMIENTO <= 21 && mesNACIMIENTO == 12) {
                Signo="Sagitario";
            }

            if (diaNACIMIENTO >= 22 && mesNACIMIENTO == 11 || diaNACIMIENTO <= 20 && mesNACIMIENTO == 1) {
                Signo="Capricornio";
            }

            if (diaNACIMIENTO >= 21 && mesNACIMIENTO == 1 || diaNACIMIENTO <= 19 && mesNACIMIENTO == 2) {
                Signo="Acuario";
            }

            if (diaNACIMIENTO >= 20 && mesNACIMIENTO == 2 || diaNACIMIENTO <= 20 && mesNACIMIENTO == 3) {
                Signo="Picis";
            } 
            //Fin fase tres (Calculando datos)

            //Fase cuatro, mostrar resultado.
            System.out.println("Tu signo es " + Signo);
        } else {
            System.out.println("El mes o el dia no son correctos.");
        }
    }
}


//ejemplo comentar