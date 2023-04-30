import javax.swing.*;
public class Entrada_ejemplo2 {
	public static void main(String[] args) {
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre: ");
		//String edad = ;
		
		//Convirtiendo a int un string
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad: "));
		System.out.println("Hola " + nombre + ", tu edad en un año es " + (edad + 1));
	}
}
