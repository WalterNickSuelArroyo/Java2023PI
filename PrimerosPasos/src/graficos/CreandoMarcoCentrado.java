package graficos;
import java.awt.*;
import java.awt.Toolkit;
import javax.swing.*;

public class CreandoMarcoCentrado {
	public static void main(String[] args) {
		MarcoCentrado mimarco = new MarcoCentrado();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}
}
class MarcoCentrado extends JFrame{
	public MarcoCentrado() {
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		Dimension tamanoPantalla = mipantalla.getScreenSize();
		int alturaPantalla = tamanoPantalla.height;
		int anchoPantalla = tamanoPantalla.width;
		setSize(anchoPantalla/2, alturaPantalla/2);
		setLocation(anchoPantalla/4, alturaPantalla/4);
		setTitle("MarcoCentrado");
		Image miIcono = mipantalla.getImage("src/graficos/icono.png");
		setIconImage(miIcono);
	}
}