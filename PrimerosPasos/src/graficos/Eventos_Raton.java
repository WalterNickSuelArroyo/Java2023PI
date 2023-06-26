package graficos;
import java.awt.event.*;
import javax.swing.JFrame;
public class Eventos_Raton {
	public static void main(String[] args) {
		MarcoRaton mimarco = new MarcoRaton();
		mimarco.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	}
}
class MarcoRaton extends JFrame {
	public MarcoRaton() {
		setVisible(true);
		setBounds(700,300,600,450);
		EventosDeRaton raton = new EventosDeRaton();
		//addMouseListener(raton);
		addMouseMotionListener(raton);
	}
}
/*class EventosDeRaton extends MouseAdapter {
	/*public void mouseClicked(MouseEvent e) {
		//System.out.println("Coordenada X: " + e.getX() + " Coordenada Y: " + e.getY());
		System.out.println(e.getClickCount());
	}
	public void mousePressed(MouseEvent e) {
		//System.out.println(e.getModifiersEx());
		if (e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
			System.out.println("Has pulsado el boton izquierdo");
		}else if(e.getModifiersEx() == MouseEvent.BUTTON2_DOWN_MASK) {
			System.out.println("Has pulsado la rueda del raton");
		}else if (e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK) {
			System.out.println("Has pulsado el boton derecho");
		}
	}
}*/
class EventosDeRaton implements MouseMotionListener{
	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("Estas arrastrando");
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("Estas moviendo");
	}
	
}