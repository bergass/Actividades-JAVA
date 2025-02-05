package es.cide.dam.programacio.yaaz; /* relaciona totes les classes i el main */

/**************************************/
/* Nom: Albert Bergas Consuegra 				*/
/* DNI/NIE: 45185379Q 			*/
/* Data: 15/11/2024 				*/
/* Exercici: PROU3EX04 YAAZ3 Evolution				*/
/**************************************/

public class ciutat { /* comenca a definir la classe ciutat */
    private String nom; /*instancia de la variable nom */
    private int tamany; /*instancia de la variable tamany */
    private zombie[] ruta; /* instancia de l'array de zombies en la ruta */

    public ciutat(String nomCiutat, int tamanyCiutat) { /* constructor de la classe ciutat */
        this.nom = nomCiutat; /* assigna el nom passat com a parametre al atribut nom */
        this.tamany = tamanyCiutat; /* assigna el tamany passat com a parametre al atribut tamany */
        this.ruta = new zombie[tamanyCiutat]; /* crea un array de zombies segons el tamany de la ciutat */
        System.out.println("he creat la ciutat"); /* imprimeix un missatge */
        for (int i = 0; i < this.tamany; i++) { /* recorre cada posicio segons el tamany */
            this.ruta[i] = new zombie(); /* crea un nou zombie a cada posicio de l'array ruta */
        }
    }

    public void setNom(String nom1) { /* metode public per assignar un nou nom a la ciutat */
        this.nom = nom1; /* assigna el valor de nom1 al atribut nom */
        System.out.println("he ficat un nom nou"); /* imprimeix un missatge */
    }

    public String getNom() { /* metode public per obtenir el nom de la ciutat */
        return nom; /* retorna el valor actual del nom */
    }

    public void setTamany(int tamany1) { /* metode public per assignar un nou tamany a la ciutat */
        this.tamany = tamany1; /* assigna el valor de tamany1 al atribut tamany */
        System.out.println("he ficat un tamany nou"); /* imprimeix un missatge */
    }

    public int getTamany() { /* metode public per obtenir el tamany de la ciutat */
        return tamany; /* retorna el valor actual del tamany */
    }

    public zombie posicioRuta(int posicio) { /* metode public per obtenir el zombie en una posicio de la ruta */
        return this.ruta[posicio]; /* retorna el zombie que hi ha a la posicio indicada */
    } /*holaaaa*/
}
