import java.util.*;
public class Entrada_ejemplo1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce tu nombre: ");
		String nombre = entrada.nextLine(); 		
		System.out.print("Introduce tu edad: ");
		int edad = entrada.nextInt(); 	
		System.out.println("El nombre es: " + nombre);
		System.out.println("La edad es: " + edad);
	}
}
