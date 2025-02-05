package com.example;

import java.util.Scanner;

/**************************************/
/* Nom: Albert Bergas Consuegra 				*/
/* DNI/NIE: 45185379Q 			*/
/* Data: 08/11/2024 				*/
/* Exercici: PROU2EX03				*/
/**************************************/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); /* Crea un nou objecte Scanner que li deim sc per llegir la entrada del usuari. */
        int numUsuari = 0; /* Definim la variable numUsuari amb int perque és un número sencer. */
        int cantidadUsu = 0; /* Definim la variable cantidadUsu amb int perque és un número sencer. */
        double dolarEur = 0.85; /* Definim la variable dolarEur amb double perque és un número decimal. */
        double dolarMxn = 20; /* Definim la variable dolarMxn amb double perque és un número decimal. */
        double eurMxn = 1.18; /* Definim la variable eurMxn amb double perque és un número decimal. */
        double eurDolar = 23.50; /* Definim la variable eurDolar amb double perque és un número decimal. */
        double mxnDolar = 0.05; /* Definim la variable mxnDolar amb double perque és un número decimal. */
        double mxnEur = 0.042; /* Definim la variable mxnEur amb double perque és un número decimal. */

        while (numUsuari != 7) { /* Mentre numUsuari no sigui 7 que fagi tot lo que esta dedins dels corchetes o com se digui. */

            System.out.println( /* Li deim al sistema que imprimeixi tot el que està dedins dels parentesis. */
                    "Que quieres hacer? \n" /* \n fa que boti a la següent linea. */ +
                            "1) Dòlars a Euros \n" +
                            "2) Dòlars a Pesos Mexicans \n" +
                            "3) Euros a Dòlars \n" +
                            "4) Euros a Pesos Mexicans \n" +
                            "5) Pesos Mexicans a Dòlars \n" +
                            "6) Pesos Mexicans a Euros \n" +
                            "7) Sortir"); /* He fet Shift+Alt+F i se me identa així, trob que queda feo pero per si conta malament. */

            numUsuari = sc.nextInt(); /* Definim que la variable numUsuari sigui la que l'usuari introdueixi. */

            while (numUsuari <= 0 || numUsuari > 7) { /* Mentre numUsuari sigui menor o igual que 0 o major que 7 que fagi el que està dedind dels corxetes. */
                System.out.println("Número invàlid"); /* No entenc perque me surt x: automaticament a cualcuns. Li deim al sistema que imprimeixi Número invàlid. */
                numUsuari = sc.nextInt(); /* Definim que la variable numUsuari sigui la que l'usuari torna a introduir. */
            }

            switch (numUsuari) { /* Segons el valor de la variable numUsuari fara una cosa o una altre.  */
                case 1: /* Quan numUsuari sigui 1 fara tot aixo. */
                    System.out.println("Introdui la quantitat en Dolars"); /* Li deim al sistema que imprimeixi tot el que està dedins dels parentesis. */
                    cantidadUsu = sc.nextInt();  /* Definim que la variable numUsuari sigui la que l'usuari introdueixi. */
                    System.out.println("La quantitat en Euros es " + cantidadUsu * dolarEur); /* Li deim al sistema que imprimeixi tot el que està dedins dels parentesis. */
                    break; /* Quan hagi acabat les ordres surt del switch. */
                case 2:
                    System.out.println("Introdui la quantitat en Dolars"); /* Li deim al sistema que imprimeixi tot el que està dedins dels parentesis. */
                    cantidadUsu = sc.nextInt();  /* Definim que la variable cantidadUsu sigui la que l'usuari introdueixi. */
                    System.out.println("La quantitat en Pesos Mexicans es " + cantidadUsu * dolarMxn); /* Li deim al sistema que imprimeixi tot el que està dedins dels parentesis. */
                    break; /* Quan hagi acabat les ordres surt del switch. */
                case 3:
                    System.out.println("Introdui la quantitat en Euros"); /* Li deim al sistema que imprimeixi tot el que està dedins dels parentesis. */
                    cantidadUsu = sc.nextInt(); /* Definim que la variable cantidadUsu sigui la que l'usuari introdueixi. */
                    System.out.println("La quantitat en Dolars es " + cantidadUsu * eurDolar); /* Li deim al sistema que imprimeixi tot el que està dedins dels parentesis. */
                    break; /* Quan hagi acabat les ordres surt del switch. */
                case 4:
                    System.out.println("Introdui la quantitat en Euros"); /* Li deim al sistema que imprimeixi tot el que està dedins dels parentesis. */
                    cantidadUsu = sc.nextInt(); /* Definim que la variable cantidadUsu sigui la que l'usuari introdueixi. */
                    System.out.println("La quantitat en Pesos Mexicans es " + cantidadUsu * eurMxn); /* Li deim al sistema que imprimeixi tot el que està dedins dels parentesis. */
                    break; /* Quan hagi acabat les ordres surt del switch. */
                case 5:
                    System.out.println("Introdui la quantitat en Peso Mexicans"); /* Li deim al sistema que imprimeixi tot el que està dedins dels parentesis. */
                    cantidadUsu = sc.nextInt(); /* Definim que la variable cantidadUsu sigui la que l'usuari introdueixi. */
                    System.out.println("La quantitat en Dolars es " + cantidadUsu * mxnDolar); /* Li deim al sistema que imprimeixi tot el que està dedins dels parentesis. */
                    break; /* Quan hagi acabat les ordres surt del switch. */
                case 6:
                    System.out.println("Introdui la quantitat en Peso Mexicans"); /* Li deim al sistema que imprimeixi tot el que està dedins dels parentesis. */
                    cantidadUsu = sc.nextInt(); /* Definim que la variable cantidadUsu sigui la que l'usuari introdueixi. */
                    System.out.println("La quantitat en Euros es " + cantidadUsu * mxnEur); /* Li deim al sistema que imprimeixi tot el que està dedins dels parentesis. */
                    break; /* Quan hagi acabat les ordres surt del switch. */

                default: /* Si numUsuari no es ningun del case definits. */
                    numUsuari = 7; /*  numUsuari sera igual a 7 per tant sortira del bucle while que engloba el switch. */
            }
        }
        System.out.println("Gracias por usar el conversor"); /* Li deim al sistema que imprimeixi tot el que està dedins dels parentesis. */
        sc.close(); /* Tanca l'escaner.  */
    }
}