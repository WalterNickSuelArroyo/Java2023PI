package graficos;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Frame;
public class CambioEstado {
	public static void main(String[] args) {
		MarcoEstado mimarco = new MarcoEstado();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class MarcoEstado extends JFrame {
	public MarcoEstado() {
		setVisible(true);
		setBounds(300,300,500,350);
		CambiaEstado nuevo_estado = new CambiaEstado();
		addWindowStateListener(nuevo_estado);
	}
}
class CambiaEstado implements WindowStateListener {

	@Override
	public void windowStateChanged(WindowEvent e) {
		//System.out.println("La ventana ha cambiado de estado");
		//System.out.println(e.getNewState());
		if (e.getNewState() == Frame.MAXIMIZED_BOTH) {
			System.out.println("La ventana esta a pantalla completa");
		}else if (e.getNewState() == Frame.NORMAL) {
			System.out.println("La ventana esta normal");
		}else if (e.getNewState() == Frame.ICONIFIED) {
			System.out.println("La ventana esta minimizada");
		}
	}
	
}