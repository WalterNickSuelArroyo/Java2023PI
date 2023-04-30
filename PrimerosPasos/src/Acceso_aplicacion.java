import javax.swing.*;
public class Acceso_aplicacion {
	public static void main(String[] args) {
		String clave = "Juan";
		String pass="";		
		while(clave.equals(pass)==false) {
			pass = JOptionPane.showInputDialog("Digite la contraseña: ");
			if (clave.equals(pass) == false) {
				System.out.println("Contraseña incorrecta");	
			}
		}
		System.out.println("Contraseña correcta. Bienvenido");
	}
}
