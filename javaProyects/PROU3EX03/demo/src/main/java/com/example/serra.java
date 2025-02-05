package com.example; // defineix el paquet com.example

/**************************************/
/* Nom: Albert Bergas Consuegra                 */
/* DNI/NIE: 45185379Q           */
/* Data: 13 / 12 / 2024                 */
/* Exercici: PROU3EX03              */
/**************************************/

public class serra extends eina {  // classe serra que hereta de la classe base eina
    private String nom;  // atribut privat per emmagatzemar el nom especific de la serra

    public serra(double peso, String material) {  // constructor per inicialitzar el pes i el material de la serra
        super(peso, material);  // crida al constructor de la classe base eina per assignar pes i material
        this.nom = "serra";  // assigna el nom especific "serra" a l'atribut "nom"
    }
    
    @Override  // indica que aquest metode sobrescriu la implementacio del metode utilitzar() de la classe base
    public void utilitzar() {  // metode get per utilitzar la serra
        System.out.println("Tallant amb la serra");  // imprimeix un missatge indicant que s'esta utilitzant la serra
    }

    public void setNom(String newNom) {  // metode set per canviar el nom de la serra
        this.nom = newNom; // assigna el nom proporcionat a l'atribut nom 
    }
    
    @Override  // indica que aquest metode sobrescriu el metode getNom() de la classe base
    public String getNom() {  // metode get per obtenir el nom de la serra
        return this.nom; // retorna el valor de l'atribut nom(que es "serra")
    }
}
