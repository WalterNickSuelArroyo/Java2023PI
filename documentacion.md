# 1. Presentacion

**Temario Parte 1**
- Descarga e instalacion de Eclipse
- Introduccion a Java
- Estructuras principales del lenguaje
- Objetos y clases
- Herencia
- Clases internas e interfaces
- Programacion de graficos
- Eventos
- Componentes Swing
- Aplicaciones y Applets
- Tratamientos de errores (excepciones) y depuracion
- Programacion generica
- Colecciones
- Programacion multihilo (multithreading)

**Temario parte 2**
- Programacion con archivos
- XML
- Programacion para redes
- Programacion para BBDD
- Programacion cliente - servidor (objetos distribuidos)
- Swing Avanzado
- AWT Avanzado
- JavaBeans
- Seguridad
- Programacion internacional
- Metodos nativos
- Anotaciones

# 2. Instalacion JRE y Eclipse

![](imagenes/1.PNG)

![](imagenes/2.PNG)

![](imagenes/3.PNG)

![](imagenes/4.PNG)

```java
public class PrimeraClase {
	public static void main(String[] args) {
		System.out.println("Hola mundo");
	}
}
```

# 3. Introduccion 

![](imagenes/5.PNG)

![](imagenes/6.PNG)

![](imagenes/7.PNG)

![](imagenes/8.PNG)

![](imagenes/9.PNG)

# 4. Estructuras principales I

**Tipos de programas**
- Aplicaciones de consola
- Aplicaciones de proposito general
- Applets

![](imagenes/10.PNG)

Es case sensitive(sensible a mayusculas y minusculas)

# 5. Estructuras principales del lenguaje II

![](imagenes/11.PNG)

![](imagenes/12.PNG)

# 6. Estructuras principales del lenguaje III

```java
public class Variables {
	public static void main(String[] args) {
		/*byte edad;
		edad=35;*/
		
		byte edad = 35; //Declaracion e iniciacion de una variable
		edad = 75;
		System.out.print("Mi edad es: " + edad);
	}
}
```

# 7. Estructuras principales del lenguaje IV - Constantes y Operadores I

![](imagenes/13.PNG)

![](imagenes/14.PNG)

```java
public class Declaraciones_Operadores {
	public static void main(String[] args) {
		int a = 5;
		int b;
		b = 7;
		int c = b + a;
		//c++;
		//c += 6;
		//c -= 6;
		
		/*Si quisieramos hacer una division, es necesario que todas
		 * las variables sean flotantes o double, y no solo la variable de resultado
		 * double a = 5;
		 * double b;
		 * b = 7;
		 * double c = b / a;
		 * */
		System.out.println(c);
	}
}
```

# 8. Estructuras principales del lenguaje V - Constantes y Operadores II

```java
public class Declaraciones_Operadores {
	public static void main(String[] args) {
		//final int c = 5; Declaracion y asignacion de una constante
		
		final double apulgadas = 2.54;
		double cm = 6;
		double resultado = cm / apulgadas;
		
		System.out.println("En " + cm + " cm hay " + resultado + " pulgadas");
		
		/*Otra forma de declarar las variables
		 * int operador1, operador2, resultado;
		 * operador1 = 8;
		 * operador2 = 7;
		 * resultado = operador1 + operador2;
		 * System.out.println(resultado);*/
	}
}
```

# 9. Estructuras principales del lenguaje VI - Clase Math

Biblioteca de clases (API):

 https://docs.oracle.com/javase/7/docs/api/


https://docs.oracle.com/en/java/javase/20/docs/api/index.html

![](imagenes/15.PNG)

![](imagenes/16.PNG)

```java
public class Calculos_conMath {
	public static void main(String[] args) {		
		double raiz = Math.sqrt(9);
		System.out.println(raiz);
	}
}
```

# 10. Estructuras principales del lenguaje VII - Clase Math II

![](imagenes/17.PNG)

```java
public class Calculos_conMath {
	public static void main(String[] args) {		
		/*double raiz = Math.sqrt(9);
		  double num1 = 5.85;
		  int resultado = Math.round(num1);
		
		  Refundicion: Si queremos forzar a que la variable resultado almacene un entero(ya que el metodo round
		  devuelve un double, solo tenemos que agregarle un parentesis indicandole
		  a que tipo de dato se convertira)
		  double num1 = 5.85;
		  int resultado = (int)Math.round(num1);
		  
		
		  double num1 = 5.85;
		  int resultado = (int)Math.round(num1);
		  System.out.println(resultado);*/
		
		double base = 5;
		double exponente = 3;
		int resultado = (int)Math.pow(base, exponente);
		System.out.println("El resultado de " + base + " elevado a " + exponente + " es " + resultado);
	}
}
```

# 11. Manipulacion de cadenas - Clase String I

![](imagenes/18.PNG)

```java
public class Manipula_Cadenas {
	public static void main(String[] args) {
		String nombre = "Juan";
		System.out.println("Mi nombre es: " + nombre);
		System.out.println("Mi nombre tiene: " + nombre.length() + " letras");
		System.out.println("La primera letra de mi nombre es: " + nombre.charAt(0));
		
		int ultima_letra;
		ultima_letra = nombre.length();
		System.out.println("La ultima letra de mi nombre es: " + nombre.charAt(ultima_letra - 1));
	}
}
```

# 12. Manipulacion de cadenas - Clase String II

```java
public class Manipula_Cadenas_II {
	public static void main(String[] args) {
		String frase = "Hoy es un estupendo dia para aprender a programar en java";
		//String frase_resumen = frase.substring(29, 57);
		String frase_resumen = frase.substring(0, 28) + " irnos a la playa y olvidarnos de todo..." + " y " + frase.substring(29,57);
		System.out.println(frase_resumen);
	}
}
```

```java
public class Manipula_Cadenas_III {
	public static void main(String[] args) {
		String alumno1, alumno2;
		alumno1 = "David";
		alumno2 = "david";
		System.out.println(alumno1.equals(alumno2));  //false
		System.out.println(alumno1.equalsIgnoreCase(alumno2));	//true
	}
}
```

# 13. Acercamiento a la API Paquetes

![](imagenes/19.PNG)

![](imagenes/20.PNG)

![](imagenes/21.PNG)

```java
//import java.util.*;
import java.util.Scanner;
//import java.util.Locale;
public class prueba {
	public static void main(String[] args) {
		String nombre;
		Scanner miObjeto;
		//Locale miobjeto2;
	}
}
```

# 14. Entrada Salida datos I

![](imagenes/22.PNG)

![](imagenes/23.PNG)

```java
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
```

# 15. Entrada Salida datos II

```java
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
```

```java
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
```

# 16. Condicionales I

![](imagenes/24.PNG)

![](imagenes/25.PNG)

```java
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
```

# 17. Condicionales II

```java
import java.util.*;
import javax.swing.*;
public class Areas {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Elige una opcion: \n1: Cuadrado \n2. Rectangulo \n3. Triangulo \n4. Circulo");
		int figura = entrada.nextInt();
		switch (figura) {
		case 1: {			
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado: ")) ;
			System.out.println("El area del cuadrado es: " + Math.pow(lado, 2));
			break;
		}
		case 2: {
			int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base: ")) ;
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura: ")) ;
			System.out.println("El area del rectangulo es: " + base*altura);
			break;
		}case 3: {
			int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base: ")) ;
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura: ")) ;
			System.out.println("El area del triangulo es: " + (base*altura)/2);
			break;
		}case 4: {
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio: ")) ;
			System.out.print("El area del circulo es: ");
			System.out.printf("%1.2f", + Math.PI*Math.pow(radio, 2));
			break;
		}
		default:
			System.out.println("Elija una opcion correcta");
		}
	}
}
```

# 18. Java Bucles I

![](imagenes/26.PNG)

![](imagenes/27.PNG)

```java
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
```

# 19. Java Bucles II

```java
import java.util.*;
public class Adivina_Numero {
	public static void main(String[] args) {
		int aleatorio = (int)(Math.random()*100);
		Scanner entradaScanner = new Scanner(System.in);
		int numero = 0;
		int intentos = 0;
		while (numero != aleatorio) {
			intentos++;
			System.out.print("Digite un numero: ");
			numero = entradaScanner.nextInt();
			if (numero > aleatorio) {
				System.out.println("El numero a adivinar es menor");
			}else if(numero < aleatorio){
				System.out.println("El numero a adivinar es mayor");
			}
		}
		System.out.println("Acertaste, el numero a adivinar es: " + aleatorio + " . Lo lograste en el intento N°" + intentos);
	}
}
```

# 20. Java Bucles III

![](imagenes/28.PNG)

```java
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
```

```java
import javax.swing.*;
public class Peso_ideal {
	public static void main(String[] args) {
		String genero = "";
		do {
			genero = JOptionPane.showInputDialog("Introduce tu genero (H/M)");
		} while (genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false);
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce altura en cm"));
		int pesoideal = 0;
		if (genero.equalsIgnoreCase("H")) {
			pesoideal = altura - 110;
		}else if(genero.equalsIgnoreCase("M")) {
			pesoideal = altura - 120;
		}
		System.out.println("Tu peso ideal es: " + pesoideal + " kg");
	}
}
```
