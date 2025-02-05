package es.cide.dam.programacio.yaaz;
import java.util.Random;

/**************************************/
/* Nom: Albert Bergas Consuegra 				*/
/* DNI/NIE: 45185379Q 			*/
/* Data: 15/11/2024 				*/
/* Exercici: PROU3EX04 YAAZ3 Evolution				*/
/**************************************/

public class novaCiutat extends ciutat {
    private double probArmaDeFoc = 1.0;/* atribut que representa la probabilitat de que surti un arma de foc */
    private double probArmaDAcer = 4.0;/* atribut que representa la probabilitat de que surti un arma d'acer */
    private double probFarmaciola = 9.0;/* atribut que representa la probabilitat de que surti una farmaciola */
    private double probEscud = 19.0;/* atribut que representa la probabilitat de que surti un escut */
    private artefacte[] arrayArtefactes; /* atribut que representa un array de artefactes */
    private boolean armaDeFocPosicionada; /* atribut que representa si l'arma de foc esta posicionada */
    Random random = new Random(); /* atribut que representa un objecte de la classe Random */

    public novaCiutat(String nomCiutat, int tamanyCiutat) { /* constructor de la classe novaCiutat */
        super(nomCiutat, tamanyCiutat); /* crida al constructor de la classe ciutat */
        this.arrayArtefactes = new artefacte[tamanyCiutat]; /* crea un array de artefactes segons el tamany de la ciutat */
        this.armaDeFocPosicionada = false; /* inicialitza l'atribut armaDeFocPosicionada a false */
        posicionaArtefactes(); /* crida al metode posicionaArtefactes */
    }

    private void posicionaArtefactes() { /* metode que posiciona els artefactes a la ciutat */
        for (int i = 0; i < getTamany(); i++) { /* recorre cada posicio segons el tamany de la ciutat */
            double prob = random.nextDouble() * 100; /* genera un nombre aleatori entre 0 i 100 */
            if (prob < probArmaDeFoc && !armaDeFocPosicionada) { /* si la probabilitat es inferior a 1 i l'arma de foc no esta posicionada */
                arrayArtefactes[i] = new armaDeFoc(2.0); /* crea un artefacte de tipus armaDeFoc amb pes 2 */
                armaDeFocPosicionada = true; /* canvia l'estat de l'atribut armaDeFocPosicionada a true */
            } else if (prob >= probArmaDeFoc && prob < probArmaDAcer) { /* si la probabilitat es superior o igual a 1 i inferior a 4 */
                arrayArtefactes[i] = new armaDAcer(2.0); /* crea un artefacte de tipus armaDAcer amb pes 2 */
            } else if (prob >= probArmaDAcer && prob < probFarmaciola) { /* si la probabilitat es superior o igual a 4 i inferior a 9 */
                arrayArtefactes[i] = new farmaciola(2.0); /* crea un artefacte de tipus farmaciola amb pes 2 */
            } else if (prob >= probFarmaciola && prob < probEscud) { /* si la probabilitat es superior o igual a 9 i inferior a 19 */
                arrayArtefactes[i] = new escud(2.0); /* crea un artefacte de tipus escud amb pes 2 */
            } else {
                arrayArtefactes[i] = null; /* si no es compleix cap condicio, l'artefacte es null */
            }
        }
    }

    public artefacte getArtefacte(int i) { /* metode que retorna l'artefacte de la posicio indicada */
        return arrayArtefactes[i]; /* retorna l'artefacte de la posicio indicada */
    }

    public void lluita(supervivent chuckNorris, zombie zombiePaco, int numZombie) { /* metode de lluita entre el supervivent i el zombie */
        int resultatAtac; /*instancia de la variable resultatAtac */
        int resultatAtacZombie; /*instancia de la variable resultatAtacZombie */
        int salutSupervivent = chuckNorris.getSalut();  /* instanciacio de la variable salutSupervivent amb la salut del supervivent */
        int salutZombie = zombiePaco.getSalut(); /* instanciacio de la variable salutZombie amb la salut del zombie */

        while (salutZombie > 0 && salutSupervivent > 0) { /* mentre la salut del zombie i la del supervivent siguin major que 0, si un dels dos mor s'atura el while */
            resultatAtac = chuckNorris.ataca() - zombiePaco.defensat(); /* asigna al resultat del atac el resultat de l'ataca del supervivent menos el defensat del zombie */
            if (resultatAtac < 0) { /* si el resultat de l'atac es menor que 0 */
                resultatAtac = 0; /* el resultat de l'atac es igual a 0 */
            }

            salutZombie = salutZombie - resultatAtac; /* asigna la salut del zombie al resultat de la salut del zombie menos el resultat de l'atac */
            System.out.println("El ataque ha quitado " + resultatAtac + " de vida"); /* imprimeix el missatge relacionat amb el resultat de l'atac */
            System.out.println("El zombie " + numZombie + " te " + salutZombie + " de vida"); /* imprimeix el missatge relacionat amb el nombre el zombie i la seva salut */

            if (salutZombie > 0) { /* si la salut del zombie es major que 0 */
                resultatAtacZombie = zombiePaco.ataca() - chuckNorris.defensat(); /* asigna al resultat de l'atac del zombie el resultat de l'atac del zombie menos la defensa del supervivent */

                if (resultatAtacZombie < 0) { /* si resultat de l'atac del zombie es menor que 0 */
                    resultatAtacZombie = 0; /* resultat de l'atac del zombie es igual a 0 */
                }
                salutSupervivent = salutSupervivent - resultatAtacZombie; /* asigna al resultat de la salut del supervivent el resultat de salut del supervivent menos el resultat de l'atac del zombie */
                System.out.println("El ataque ha quitado " + resultatAtacZombie + " de vida"); /* imprimeix el missatge relacionat amb l'atac del zombie */
                System.out.println(chuckNorris.getNom() + " te " + salutSupervivent + " de vida"); /* imprimeix el missatge relacionat amb la salut del supervivent */
            }
            
        }

        chuckNorris.setSalut(salutSupervivent); /* actualitza la salut del supervivent després de la lluita */

        if (salutZombie <= 0) { /* si la salut del zombie es menor o igual a 0 */
            System.out.println("El zombie " + numZombie + " ha mort"); /* imprimeix el missatge de mort del zombie */
            
        }
    }
}