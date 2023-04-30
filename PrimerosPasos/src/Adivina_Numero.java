import java.util.*;
public class Adivina_Numero {
	public static void main(String[] args) {
		int aleatorio = (int)(Math.random()*100);
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		int intentos = 0;
		do{
			intentos++;
			System.out.print("Digite un numero: ");
			numero = entrada.nextInt();
			if (numero > aleatorio) {
				System.out.println("El numero a adivinar es menor");
			}else if(numero < aleatorio){
				System.out.println("El numero a adivinar es mayor");
			}
		}while (numero != aleatorio); 
		System.out.println("Acertaste, el numero a adivinar es: " + aleatorio + " . Lo lograste en el intento N°" + intentos);
	}
}
