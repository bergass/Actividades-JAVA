package es.cide.dam.programacio.yaaz;

import java.util.Scanner;
import java.util.Random;

/**************************************/
/* Nom: Albert Bergas Consuegra 				*/
/* DNI/NIE: 45185379Q 			*/
/* Data: 15/11/2024 				*/
/* Exercici: PROU3EX04 YAAZ3 Evolution				*/
/**************************************/

public class Main {
    public static void main(String[] args) { 
        int numZombie = 1; /* instancia la variable del numero que surt el zombie */
        Scanner sc = new Scanner(System.in); /* crea un escaner */
        Random random = new Random(); /* crea un random, per poder fer numeros aleatoris */

        System.out.println("Dim el nom del Supervivent"); /* imprimeix el missatge */
        supervivent chuckNorris = new supervivent(sc.nextLine()); /* crea un supervivent anomenat chuckNorris, pero es el nom que "veu" la maquina, l'usuari l'hi posara el nom que vulgui */
        
        System.out.println("Dim el nom de la ciutat on es lluitara la batalla"); /* imprimeix el missatge  */
        novaCiutat palma = new novaCiutat(sc.nextLine(), random.nextInt(6) + 5); /* crea una ciutat anomenada palma, que es la que "veu" la maquina */
        
        for (int i = 0; i < palma.getTamany(); i++) { /* bucle for per recorre zombies els zombies */
            zombie zombiePaco = palma.posicioRuta(i); /* asigna un zombie del metode posicio.ruta de la ciutat segons la i del bucle  */
            if (random.nextInt(10) == 0) { /* si el numero aleatori es 0, per tant 10% */
                zombiePaco = new superZombie(); /* crea un superzombie */
            } else {
                zombiePaco = new zombie(); /* sino crea un zombie */
            }
           
            palma.lluita(chuckNorris, zombiePaco, numZombie); /* crida al metode lluita de la ciutat */

            if (chuckNorris.getSalut() <= 0) { /* si la salut del supervivent es menor o igual a 0 */
                System.out.println(chuckNorris.getNom() + " ha mort"); /* imprimeix que el supervivent ha mort */
                break; /* surt del bucle */
            } else { /* si la salut del supervivent es major a 0 */
                System.out.println(chuckNorris.getNom() + " ha sobreviscut"); /* imprimeix que el supervivent ha sobreviscut */
            }
            
            artefacte obtenirArtefacte = palma.getArtefacte(i); /* asigna a obtenir artefacte el artefacte de la posicio i de la ciutat */
            if (obtenirArtefacte != null) {
                if (obtenirArtefacte.getClass().equals(armaDAcer.class)) { /* si l'artefacte es de tipus armaDAcer */
                    System.out.println("Has trobat un arma d'acer"); /* imprimeix el missatge */
                    chuckNorris.setAtaque(chuckNorris.getAtaque() + (int) obtenirArtefacte.getValorArtefacte()); /* augmenta l'ataque del supervivent */
                } else if (obtenirArtefacte.getClass().equals(armaDeFoc.class)) { /* si l'artefacte es de tipus armaDeFoc */
                    System.out.println("Has trobat un arma de foc"); /* imprimeix el missatge */
                    chuckNorris.setAtaque(chuckNorris.getAtaque() * (int) obtenirArtefacte.getValorArtefacte()); /* augmenta l'ataque del supervivent */
                } else if (obtenirArtefacte.getClass().equals(farmaciola.class)) { /* si l'artefacte es de tipus farmaciola */
                    System.out.println("Has trobat una farmaciola"); /* imprimeix el missatge */
                    chuckNorris.setSalut(chuckNorris.getSalut() + (int) obtenirArtefacte.getValorArtefacte()); /* augmenta la salut del supervivent */
                } else if (obtenirArtefacte.getClass().equals(escud.class)) { /* si l'artefacte es de tipus escud */
                    System.out.println("Has trobat un escut"); /* imprimeix el missatge */
                    chuckNorris.setDefensa(chuckNorris.getDefensa() * (int) obtenirArtefacte.getValorArtefacte()); /* augmenta la defensa del supervivent */
                }
            } else {
                System.out.println("No has trobat cap artefacte"); /* imprimeix el missatge */
            }

            if (i != (palma.getTamany() - 1)) { /* quan i sigui el numero abans del tamany de la ciutat no fara l'if quan aparegui el darrer zombie de l'array  */
                numZombie++; /* incrementa el numero del zombie */
                System.out.println("Surt al pas el zombie " + numZombie); /* imprimeix el missatge relacionat amb el zombie següent */
            }
        }
        
        

        sc.close(); /* tanca l'escaner */
    }
}