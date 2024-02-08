/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3_josuebryanhernandezzelaya;
import javax.swing.*;//Libreria para importar mejor la vista

/**
 *
 * Ejercicio3: Escribir un programa que determine cuál es el mayor número de 3 ingresados por el
usuario.
Nota: Usar sus respectivos tipos de datos (byte, short, int, long, float, double, char, boolean)
 */
public class Ejercicio3_JosueBryanHernandezZelaya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String numeroUno = JOptionPane.showInputDialog("Escriba el primer número:");
        double numero1 = Double.parseDouble(numeroUno);

        String numeroDos = JOptionPane.showInputDialog("Escriba el segundo número:");
        double numero2 = Double.parseDouble(numeroDos);

        String numeroTres = JOptionPane.showInputDialog("Escriba el tercer número:");
        double numero3 = Double.parseDouble(numeroTres);
        // Se declara Double para considerar decimales en el resultado
        double mayor = Math.max(numero1, Math.max(numero2, numero3));

        JOptionPane.showMessageDialog(null, "El mumero mayor de todos los ingresados es: " + mayor);
    }
    
}
//Josue Bryan Hernandez Zelaya
