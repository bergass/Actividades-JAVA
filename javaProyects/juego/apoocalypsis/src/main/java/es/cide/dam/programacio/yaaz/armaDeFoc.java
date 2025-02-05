package es.cide.dam.programacio.yaaz; /* relaciona totes les classes i el main */
import java.util.Random; /* importa un random */

/**************************************/
/* Nom: Albert Bergas Consuegra 				*/
/* DNI/NIE: 45185379Q 			*/
/* Data: 15/11/2024 				*/
/* Exercici: PROU3EX04 YAAZ3 Evolution				*/
/**************************************/

public class armaDeFoc extends artefacte { /* classe arma de foc que hereta de artefacte */
    private Random random = new Random(); /* instancia per generar numeros aleatoris */
    private double valorArtefacte; /* instancia per el valor de l'artefacte */

    public armaDeFoc(double pes) { /* constructor de la classe */
        super(pes,0); /* crida al constructor de la classe artefacte */
        this.valorArtefacte = random.nextDouble(0.9, 1.5); /* genera un numero aleatori entre 0.9 i 1.5 */
        super.setValorArtefacte(this.valorArtefacte); /* crida al metode setValorArtefacte de la classe artefacte */
        super.getValorArtefacte();  /* crida al metode getValorArtefacte de la classe artefacte */
    }

}
