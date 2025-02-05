package es.cide.dam.programacio.yaaz; /* relaciona totes les classes i el main */

/**************************************/
/* Nom: Albert Bergas Consuegra 				*/
/* DNI/NIE: 45185379Q 			*/
/* Data: 15/11/2024 				*/
/* Exercici: PROU3EX04 YAAZ3 Evolution				*/
/**************************************/

public class superZombie extends zombie { /* classe superZombie que hereta de zombie */

    public superZombie(){ /* constructor de la classe */
        super(); /* crida al constructor de la classe zombie */
        setSalut(getSalut()*3); /* multiplica la salut per 3 */
        setAtaque(getAtaque()*2); /* multiplica l'atac per 2 */
    }    
}
