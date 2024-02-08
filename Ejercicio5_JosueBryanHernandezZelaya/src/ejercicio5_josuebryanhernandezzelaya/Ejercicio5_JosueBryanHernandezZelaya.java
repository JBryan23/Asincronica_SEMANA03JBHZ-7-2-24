/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5_josuebryanhernandezzelaya;
import javax.swing.*;//Libreria para importar mejor la vista

/**
 *
 * Ejercicio5: Escribir un programa que ingresado el radio de una circunferencia, calcule el área y
volumen tomando en cuenta la fórmula del área de un círculo a = pi X r X r. Para el valor
de PI, utilizar 3.141592653
* Nota: Usar sus respectivos tipos de datos (byte, short, int, long, float, double, char, boolean)
 */
public class Ejercicio5_JosueBryanHernandezZelaya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double PI = 3.141592653; // Nota el "final" se pone para que indique que la variable es constante

        String pregunta = JOptionPane.showInputDialog("Escriba el radio de la circunferencia:");
        double radio = Double.parseDouble(pregunta);

        double R_area = PI * Math.pow(radio, 2);
        double R_volumen = (4.0 / 3.0) * PI * Math.pow(radio, 3);

        JOptionPane.showMessageDialog(null, "El área de la circunferencia es: " + R_area);
        JOptionPane.showMessageDialog(null, "El volumen del circulo con radio igual al de la circunferencia es: " +  R_volumen);
        
    }
    
}
//Josue Bryan Hernandez Zelaya 