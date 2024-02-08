/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2_josuebryanhernandezzelaya;
import javax.swing.*;//Libreria para importar mejor la vista

/**
 *
 * Ejercicio2: Escriba un programa que calcule las 4 operaciones básicas (suma, resta, multiplicación
y división), ingresando 2 valores.
Nota: Usar sus respectivos tipos de datos (byte, short, int, long, float, double, char, boolean)
 */
public class Ejercicio2_JosueBryanHernandezZelaya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1, num2, suma, resta, multiplicacion, division;
        String numeroUno, numeroDos;

        do {
            numeroUno = JOptionPane.showInputDialog("Ingrese el primer valor ");
            numeroDos = JOptionPane.showInputDialog("Ingrese el segundo valor ");
            num1 = Double.parseDouble(numeroUno);
            num2 = Double.parseDouble(numeroDos);

            if (num2 == 0) {
                JOptionPane.showMessageDialog(null, "Error: No se puede dividir por cero. Avertencia: Por favor, ingrese los valores nuevamente.");
            }
        } while (num2 == 0);

        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / num2;

        JOptionPane.showMessageDialog(null, "Suma: " + suma + "\nResta: " + resta + "\nMultiplicación: " + multiplicacion + "\nDivisión: " + division);
       
    }
    
}

//Josue Bryan Hernandez Zelaya