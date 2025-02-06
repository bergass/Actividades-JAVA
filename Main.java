package com.example; // define el paquete donde se encuentra la clase

import javax.swing.*; // importa la libreria swing para crear interfaces graficas
import java.awt.*; // importa la libreria awt para manejar componentes graficos
import java.awt.event.ActionEvent; // importa la clase ActionEvent para manejar eventos de accion
import java.awt.event.ActionListener; // importa la interfaz ActionListener para escuchar eventos de accion

/**************************************/
/* Nom: Albert Bergas Consuegra */
/* DNI/NIE: 45185379Q */
/* Data: 14/02/2025	*/
/* Exercici: PROU6EX01 */
/**************************************/

public class Main { // define la clase principal
    public static void main(String[] args) { // metodo principal que se ejecuta al iniciar el programa
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); // establece el look and feel de la aplicacion para que se vea como una aplicacion de windows
        } catch (Exception e) {
            e.printStackTrace(); // imprime el error si ocurre una excepcion
        }
        JFrame calculadora = new JFrame("Calculadora"); // crea una ventana con el titulo "Calculadora"
        calculadora.setSize(400, 300); // establece el tamaño de la ventana a 400x300 pixeles
        calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // establece que la aplicacion se cierre cuando se cierra la ventana
        calculadora.setLayout(new BorderLayout()); // establece el layout de la ventana como BorderLayout

        JPanel panel = new JPanel(); // crea un panel para contener los componentes
        panel.setLayout(new GridLayout(4,2,10,10)); // establece el layout del panel como una cuadricula de 4 filas y 2 columnas con 10 pixeles de espacio entre componentes

        JTextField num1 = new JTextField(3); // crea un campo de texto para el primer numero con un ancho de 3 columnas
        panel.add(num1); // añade el campo de texto al panel

        JTextField num2 = new JTextField(3); // crea un campo de texto para el segundo numero con un ancho de 3 columnas
        panel.add(num2); // añade el campo de texto al panel

        JLabel resultat = new JLabel("Resultat",SwingConstants.CENTER); // crea una etiqueta para mostrar el resultado, centrada horizontalmente
        resultat.setFont(new Font("Arial", Font.BOLD, 16)); // establece la fuente de la etiqueta a Arial, negrita, tamaño 16        

        JButton boto1 = new JButton("Suma"); // crea un boton con el texto "Suma"
        boto1.addActionListener(new ActionListener() { // añade un listener al boton para que cuando se haga clic, se llame al metodo suma con los campos de texto y la etiqueta de resultado
            @Override
            public void actionPerformed(ActionEvent e) {
                suma(num1, num2, resultat); // llama al metodo suma con los campos de texto y la etiqueta de resultado
            }
        });
        panel.add(boto1); // añade el boton al panel

        JButton boto2 = new JButton("Resta"); // crea un boton con el texto "Resta"
        boto2.addActionListener(new ActionListener() { // añade un listener al boton para que cuando se haga clic, se llame al metodo resta con los campos de texto y la etiqueta de resultado
            @Override
            public void actionPerformed(ActionEvent e) {
                resta(num1, num2, resultat); // llama al metodo resta con los campos de texto y la etiqueta de resultado
            }
        });
        panel.add(boto2); // añade el boton al panel

        JButton boto3 = new JButton("Multiplicacio"); // crea un boton con el texto "Multiplicacio"
        boto3.addActionListener(new ActionListener() { // añade un listener al boton para que cuando se haga clic, se llame al metodo multiplicacio con los campos de texto y la etiqueta de resultado
            @Override
            public void actionPerformed(ActionEvent e) {
                multiplicacio(num1, num2, resultat); // llama al metodo multiplicacio con los campos de texto y la etiqueta de resultado
            }
        });
        panel.add(boto3); // añade el boton al panel

        JButton boto4 = new JButton("Divisio"); // crea un boton con el texto "Divisio"
        boto4.addActionListener(new ActionListener() { // añade un listener al boton para que cuando se haga clic, se llame al metodo divisio con los campos de texto y la etiqueta de resultado
            @Override
            public void actionPerformed(ActionEvent e) {
                divisio(num1, num2, resultat); // llama al metodo divisio con los campos de texto y la etiqueta de resultado
            }
        });
        panel.add(boto4); // añade el boton al panel

        panel.add(resultat); // añade la etiqueta de resultado al panel

        calculadora.add(panel, BorderLayout.CENTER); // añade el panel a la ventana en el centro del BorderLayout
        calculadora.setVisible(true); // hace visible la ventana
    }

    public static void suma(JTextField num1, JTextField num2, JLabel resultat) { // metodo para sumar los numeros de los campos de texto y mostrar el resultado en la etiqueta
        try {
            int numero1 = Integer.parseInt(num1.getText().trim()); // convierte el texto del primer campo de texto a un entero
            int numero2 = Integer.parseInt(num2.getText().trim()); // convierte el texto del segundo campo de texto a un entero
            int suma = numero1 + numero2; // suma los dos numeros
            resultat.setText(String.valueOf(suma)); // muestra el resultado de la suma en la etiqueta
        } catch (NumberFormatException e) {
            resultat.setText("Error:("); // si hay un error de formato, muestra "Error:(" en la etiqueta
        }
    }

    public static void resta(JTextField num1, JTextField num2, JLabel resultat) { // metodo para restar los numeros de los campos de texto y mostrar el resultado en la etiqueta
        try {
            int numero1 = Integer.parseInt(num1.getText().trim()); // convierte el texto del primer campo de texto a un entero
            int numero2 = Integer.parseInt(num2.getText().trim()); // convierte el texto del segundo campo de texto a un entero
            int resta = numero1 - numero2; // resta los dos numeros
            resultat.setText(String.valueOf(resta)); // muestra el resultado de la resta en la etiqueta
        } catch (NumberFormatException e) {
            resultat.setText("Error:("); // si hay un error de formato, muestra "Error:(" en la etiqueta
        }
    }

    public static void multiplicacio(JTextField num1, JTextField num2, JLabel resultat) { // metodo para multiplicar los numeros de los campos de texto y mostrar el resultado en la etiqueta
        try {
            int numero1 = Integer.parseInt(num1.getText().trim()); // convierte el texto del primer campo de texto a un entero
            int numero2 = Integer.parseInt(num2.getText().trim()); // convierte el texto del segundo campo de texto a un entero
            int multiplicacio = numero1 * numero2; // multiplica los dos numeros
            resultat.setText(String.valueOf(multiplicacio)); // muestra el resultado de la multiplicacion en la etiqueta
        } catch (NumberFormatException e) {
            resultat.setText("Error:("); // si hay un error de formato, muestra "Error:(" en la etiqueta
        }
    }

    public static void divisio(JTextField num1, JTextField num2, JLabel resultat) { // metodo para dividir los numeros de los campos de texto y mostrar el resultado en la etiqueta
        try {
            int numero1 = Integer.parseInt(num1.getText().trim()); // convierte el texto del primer campo de texto a un entero
            int numero2 = Integer.parseInt(num2.getText().trim()); // convierte el texto del segundo campo de texto a un entero
            int divisio = numero1 / numero2; // divide los dos numeros
            resultat.setText(String.valueOf(divisio)); // muestra el resultado de la division en la etiqueta
        } catch (ArithmeticException e) {
            resultat.setText("Error:("); // si hay un error aritmetico, muestra "Error:(" en la etiqueta
        } catch (NumberFormatException e) {
            resultat.setText("Error:("); // si hay un error de formato, muestra "Error:(" en la etiqueta
        }
    }
}