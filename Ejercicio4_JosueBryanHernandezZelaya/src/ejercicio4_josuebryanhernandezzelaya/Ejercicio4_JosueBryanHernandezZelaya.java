/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4_josuebryanhernandezzelaya;
import javax.swing.*;//Libreria para importar mejor la vista

/**
 *
 * Ejercicio4: Escribir un programa que calcule el perímetro y área de un rectángulo, pidiendo los
valores de los lados. La formula del perimetro es P=2*L + 2*W, la fórmula del área es
A=L*W, donde L y W son los lados del rectángulo.
* Nota: Usar sus respectivos tipos de datos (byte, short, int, long, float, double, char, boolean)
 */
public class Ejercicio4_JosueBryanHernandezZelaya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String datoUno = JOptionPane.showInputDialog("Usuario ingrese el primer lado del rectángulo:");
        double ladoUno = Double.parseDouble(datoUno);

        String datoDos = JOptionPane.showInputDialog("Usuario ingrese el segundo lado del rectángulo:");
        double ladoDos = Double.parseDouble(datoDos);

        //Formula de la ecuacion 
        double R_perimetro = 2 * (ladoUno + ladoDos);
        double R_area = ladoUno * ladoDos;

        JOptionPane.showMessageDialog(null, "El perímetro del rectángulo es: " + R_perimetro + "\nEl área del rectángulo es: " + R_area);
    }
    
}
//Josue Bryan Hernandez Zelaya