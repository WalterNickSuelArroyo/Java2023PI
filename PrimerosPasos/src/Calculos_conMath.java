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
