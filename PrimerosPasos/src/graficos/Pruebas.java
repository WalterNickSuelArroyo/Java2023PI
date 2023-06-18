package graficos;

import java.awt.GraphicsEnvironment;
import javax.swing.*;

public class Pruebas {

	public static void main(String[] args) {
		String fuente = JOptionPane.showInputDialog("Introduce fuente");
		boolean estalafuente = false;
		String [] nombresDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		for (String nombredelafuente : nombresDeFuentes) {
			if (nombredelafuente.equals(fuente)) {
				estalafuente = true;
			}
		}
		if (estalafuente) {
			System.out.println("Esta la fuente instalada");
		} else {
			System.out.println("No esta instalada la fuente");
		}
	}

}
