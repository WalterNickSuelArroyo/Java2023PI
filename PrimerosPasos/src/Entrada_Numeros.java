import javax.swing.*;
public class Entrada_Numeros {
	public static void main(String[] arg) {
		//double x = 1000.0;
		//Dando formato, dandole dos decimales al resultado
		//System.out.printf("%1.2f",x/3);
		
		String num1 = JOptionPane.showInputDialog("Introduce un numero");
		double num2 = Double.parseDouble(num1);
		System.out.print("La raiz de " + num2 + " es ");
		System.out.printf("%1.2f",Math.sqrt(num2));
	}
}
