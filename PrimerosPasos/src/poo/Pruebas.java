package poo;
public class Pruebas {
	public static void main(String[] args) {
		Empleados trabajador1 = new Empleados("Paco");
		Empleados trabajador2 = new Empleados("Ana");
		
		trabajador1.cambiarSeccion("RRHH");
		
		System.out.println(trabajador1.devuelveDatos());
		System.out.println(trabajador2.devuelveDatos());
		System.out.println(Empleados.dameIdSiguiente());
		
	}
}
class Empleados {
	public Empleados(String nom) {
		nombre = nom;
		seccion = "Administracion";
		id = IdSiguiente;
		IdSiguiente++;
	}
	public void cambiarSeccion(String seccion) {	//SETTER
		this.seccion = seccion;
	}
	public String devuelveDatos() {	//GETTER
		return "El nombre es: " + nombre + " la seccion es: " + seccion + " y el Id = " + id;
	}
	public static String dameIdSiguiente() {
		return "El IdSiguiente es: " + IdSiguiente;
	}
	private final String nombre;
	private String seccion;
	private int id;
	private static int IdSiguiente = 1;
}