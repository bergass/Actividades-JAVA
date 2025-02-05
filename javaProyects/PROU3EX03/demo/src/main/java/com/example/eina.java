package com.example; // defineix el paquet com.example

/**************************************/
/* Nom: Albert Bergas Consuegra                 */
/* DNI/NIE: 45185379Q           */
/* Data: 13 / 12 / 2024                 */
/* Exercici: PROU3EX03              */
/**************************************/


public class eina {  // classe base "eina" que representa una eina generica
    private double pes;  // atribut privat per emmagatzemar el pes de l'eina
    private String material;  // atribut privat per emmagatzemar el material de l'eina
    private String nom;  // atribut privat per emmagatzemar el nom de l'eina

    public eina(double newPes, String newMaterial) {  // constructor per inicialitzar el pes i el material de l'eina
        this.pes = newPes;  // assigna el pes proporcionat a l'atribut "pes"
        this.material = newMaterial;  // assigna el material proporcionat a l'atribut "material"
    }

    public void setPes(double newPes) {  // metode set per canviar el pes de l'eina
        this.pes = newPes; // assigna el pes proporcionat a l'atribut "pes"
    }

    public double getPes() {  // metode get per obtenir el pes de l'eina
        return this.pes;  // retorna el valor de l'atribut "pes"
    }

    public void setMaterial(String newMaterial) {  // metode set per canviar el material de l'eina
        this.material = newMaterial; // assigna el material proporcionat a l'atribut material
    }

    public String getMaterial() {  // metode get per obtenir el material de l'eina
        return this.material;  // retorna el valor de l'atribut "material"
    }

    public void utilitzar() {  // metode per utilitzar l'eina
        System.out.println("Utilitzant una eina generica");  // imprimeix un missatge generic indicant que s'esta utilitzant una eina
    }

    public String getNom() {  // metode get per obtenir el nom de l'eina
        return this.nom;  // retorna el valor de l'atribut "nom"
    }
}
