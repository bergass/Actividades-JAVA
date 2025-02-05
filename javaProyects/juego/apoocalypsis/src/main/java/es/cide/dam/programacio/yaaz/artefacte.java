package es.cide.dam.programacio.yaaz; /* relaciona totes les classes i el main */

/**************************************/
/* Nom: Albert Bergas Consuegra 				*/
/* DNI/NIE: 45185379Q 			*/
/* Data: 15/11/2024 				*/
/* Exercici: PROU3EX04 YAAZ3 Evolution				*/
/**************************************/

public class artefacte { /* classe artefacte */
        private double pes; /* instancia de la variable pes */
        private double valorArtefacte; /* instancia de la variable valorArtefacte */
        public artefacte(double pes, double valorArtefacte) { /* constructor de la classe artefacte */
            this.pes = pes; /* inicialitza l'atribut pes */
            this.valorArtefacte = valorArtefacte; /* inicialitza l'atribut valorArtefacte */
        }
    
        public double getPes() { /* metode que retorna el pes */
            return this.pes; /* retorna el pes */
        }
    
        public void setPes(double pes) { /* metode que assigna el pes */
            this.pes = pes; /* asigna el pes */
        }
        public double getValorArtefacte() {  /* metode que retorna el valor de l'artefacte */
            return this.valorArtefacte;  /* retorna el valor de l'artefacte */
        }
    
        public void setValorArtefacte(double valorArtefacte) { /* metode que assigna el valor de l'artefacte */
            this.valorArtefacte = valorArtefacte; /* asigna el valor de l'artefacte */
        }
    }
