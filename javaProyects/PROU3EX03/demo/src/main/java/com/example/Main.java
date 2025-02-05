package com.example;  // defineix el paquet com.example

/**************************************/
/* Nom: Albert Bergas Consuegra                 */
/* DNI/NIE: 45185379Q           */
/* Data: 13 / 12 / 2024                 */
/* Exercici: PROU3EX03              */
/**************************************/

public class Main {  // defineix la classe principal Main que conte el metode principal del programa
    public static void main(String[] args) {  // metode principal, punt d'entrada del programa
        eina martell1 = new martell(5, "metall");  // crea un objecte de tipus martell amb un pes de 5 i material "metall"
        eina destornillador1 = new destornillador(1.5, "acer");  // crea un objecte de tipus destornillador amb un pes de 1.5 i material "acer"
        eina serra1 = new serra(2, "fusta");  // crea un objecte de tipus serra amb un pes de 2 i material "fusta"
        mostrarEina(martell1);  // crida el metode mostrarEina per mostrar la informacio del martell
        mostrarEina(destornillador1);  // crida el metode mostrarEina per mostrar la informacio del destornillador
        mostrarEina(serra1);  // crida el metode mostrarEina per mostrar la informacio de la serra
    }

    public static void mostrarEina(eina miEina) {  // metode estatic per mostrar la informacio de qualsevol eina o derivada
        miEina.utilitzar();  // executa el metode utilitzar() associat a cada eina
        System.out.println("Eina: " + miEina.getNom() + ", Pes: " + miEina.getPes() + " kg, Material: " + miEina.getMaterial() + "\n -----------------------"); 
        // imprimeix la informacio de l'eina, incloent el nom, pes i material, amb una linia divisoria
    }
}
