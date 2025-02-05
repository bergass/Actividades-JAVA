package es.cide.dam.programacio.yaaz; /* relaciona totes les classes i el main */
import java.util.Random; /* importa un random */

/**************************************/
/* Nom: Albert Bergas Consuegra 				*/
/* DNI/NIE: 45185379Q 			*/
/* Data: 15/11/2024 				*/
/* Exercici: PROU3EX04 YAAZ3 Evolution				*/
/**************************************/

public class armaDAcer extends artefacte {  /* classe arma d'acer que hereta de artefacte */
    private Random random = new Random(); /* instancia per generar numeros aleatoris */
    private double valorArtefacte; /* instancia de la variable valorArtefacte */

    public armaDAcer(double pes) { /* constructor de la classe */
        super(pes, 0); /* crida al constructor de la classe artefacte */
        this.valorArtefacte = random.nextDouble(1, 15); /* asigna a la variable valorArtefacte un numero aleatori entre 1 i 15 */
        super.setValorArtefacte(this.valorArtefacte); /* crida al metode setValorArtefacte de la classe artefacte */
    }
}