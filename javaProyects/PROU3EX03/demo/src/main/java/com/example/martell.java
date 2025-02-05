package com.example; // defineix el paquet com.example

/**************************************/
/* Nom: Albert Bergas Consuegra                 */
/* DNI/NIE: 45185379Q           */
/* Data: 13 / 12 / 2024                 */
/* Exercici: PROU3EX03              */
/**************************************/

public class martell extends eina {  // classe martell que hereta de la classe base eina
    private String nom;  // atribut privat per emmagatzemar el nom especific del martell

    public martell(double peso, String material) {  // constructor per inicialitzar el pes i el material del martell
        super(peso, material);  // crida al constructor de la classe base eina per assignar pes i material
        this.nom = "martell";  // assigna el nom especific "martell" a l'atribut "nom"
    }
    
    @Override  // indica que aquest metode sobrescriu la implementacio del metode utilitzar() de la classe base(eina)
    public void utilitzar() {  // metode especific per utilitzar el martell
        System.out.println("Colpejant amb el martell");  // imprimeix un missatge indicant que s'esta colpejant amb el martell
    }

    @Override  // indica que aquest metode sobrescriu el metode getNom() de la classe base
    public String getNom() {  // metode set per obtenir el nom del martell
        return this.nom; // retorna el valor de l'atribut nom(que es "martell")
    }

    public void setNom(String newNom) {  // metode set per canviar el nom del martell
        this.nom = newNom; // assigna el nom proporcionat a l'atribut nom
    }
}
