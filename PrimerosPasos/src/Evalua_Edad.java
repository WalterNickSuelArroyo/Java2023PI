import java.util.*;
public class Evalua_Edad {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce tu edad: ");
		int edad = entrada.nextInt();
		
		/*if (edad >= 18) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Eres menor de edad");
		}*/
		
		if (edad < 18) {
			System.out.println("Eres un adolescente");
		} else if (edad < 40){
			System.out.println("Eres un joven");
		}else if (edad < 65) {
			System.out.println("Eres maduro");
		}else {
			System.out.println("Cuidate");
		}
	}
}
