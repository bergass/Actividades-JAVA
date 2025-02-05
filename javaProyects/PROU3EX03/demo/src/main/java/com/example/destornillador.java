package com.example; // defineix el paquet com.example

/**************************************/
/* Nom: Albert Bergas Consuegra                 */
/* DNI/NIE: 45185379Q           */
/* Data: 13 / 12 / 2024                 */
/* Exercici: PROU3EX03              */
/**************************************/

public class destornillador extends eina {  // classe destornillador que hereta de la classe base eina
    private String nom;  // atribut privat per emmagatzemar el nom especific del destornillador

    public destornillador(double peso, String material) {  // constructor per inicialitzar el pes i el material del destornillador
        super(peso, material);  // crida al constructor de la classe base eina per assignar pes i material
        this.nom = "destornillador";  // assigna el nom especific "destornillador" a l'atribut "nom"
    }
    
    @Override  // indica que aquest metode sobrescriu la implementacio del metode utilitzar() de la classe base
    public void utilitzar() {  // metode per utilitzar el destornillador
        System.out.println("Tornant cargols amb el destornillador");  // imprimeix un missatge indicant que s'esta utilitzant el destornillador
    }

    public void setNom(String newNom) {  // metode per canviar el nom del destornillador
        this.nom = newNom; // assigna el nom proporcionat a l'atribut nom 
    }
    
    @Override  // indica que aquest metode sobrescriu el metode getNom() de la classe base
    public String getNom() {  // metode get per obtenir el nom del destornillador
        return this.nom;  // retorna el valor de l'atribut nom(que es "destornillador")
    }
}
