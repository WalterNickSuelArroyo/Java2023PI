package poo;
import java.util.Date;
import java.util.GregorianCalendar;
public class Uso_Empleado {
	public static void main(String[] args) {
		Empleado[] misemEmpleados = new Empleado[4];
		misemEmpleados[0] = new Empleado("Paco Gomez", 85000, 1990, 12, 17);
		misemEmpleados[1] = new Empleado("Ana Lopez", 95000, 1995, 06, 02);
		misemEmpleados[2] = new Empleado("Maria Martin", 105000, 2002, 03, 15);
		misemEmpleados[3] = new Empleado("Antonio Fernandéz");

		for (Empleado e : misemEmpleados) {
			e.subeSueldo(5);
		}
		for (Empleado e : misemEmpleados) {
			System.out.println("Nombre: " + e.dameNombre() + " Sueldo: " 
					+ e.dameSueldo() + " Fecha de alta: " + e.dameFechaContrato());
		}
	}
}
class Empleado {
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		nombre = nom;
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno,mes-1,dia);
		altaContrato = calendario.getTime();		
	}
	public Empleado(String nom) {
		this(nom,30000,2000,01,01);
	}
	public String dameNombre() {	//GETTER
		return nombre;
	}
	public double dameSueldo() {	//GETTER
		return sueldo;
	}
	public Date dameFechaContrato() {	//GETTER
		return altaContrato;
	}
	public void subeSueldo(double porcentaje) {	//SETTER
		double aumento = sueldo*porcentaje/100;
		sueldo += aumento;
	}
	private String nombre;
	private double sueldo;
	private Date altaContrato;
}