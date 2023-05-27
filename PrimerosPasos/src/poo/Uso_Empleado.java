package poo;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
public class Uso_Empleado {
	public static void main(String[] args) {
		Jefatura jefe_RRHH = new Jefatura("Juan", 55000, 2006, 9, 25);
		jefe_RRHH.estableceIncentivo(2570);
		Empleado[] misemEmpleados = new Empleado[6];
		misemEmpleados[0] = new Empleado("Paco Gomez", 85000, 1990, 12, 17);
		misemEmpleados[1] = new Empleado("Ana Lopez", 95000, 1995, 06, 02);
		misemEmpleados[2] = new Empleado("Maria Martin", 105000, 2002, 03, 15);
		misemEmpleados[3] = new Empleado("Antonio Fernandéz");
		misemEmpleados[4] = jefe_RRHH;	//Polimorfismo en accion. Principio de sustitucion
		misemEmpleados[5] = new Jefatura("Maria", 95000, 1999, 5, 26);
		Jefatura jefa_Finanzas = (Jefatura) misemEmpleados[5];
		jefa_Finanzas.estableceIncentivo(55000);
		System.out.println(jefa_Finanzas.tomar_decisiones("Dar mas dias de vacaciones a los empleados"));
		
		/*Empleado director_comercial = new Jefatura("Sandra",85000,2012,05,05);
		Comparable ejemplo = new Empleado("Elizabeth",95000,2011,06,07);
		if (director_comercial instanceof Empleado) {
			System.out.println("Es de tipo Jefatura");
		}
		if (ejemplo instanceof Comparable) {
			System.out.println("Implementa la interfaz comparable");
		}
		*/
		
		for (Empleado e : misemEmpleados) {
			e.subeSueldo(5);
		}
		Arrays.sort(misemEmpleados);
		for (Empleado e : misemEmpleados) {
			System.out.println("Nombre: " + e.dameNombre() + " Sueldo: " 
					+ e.dameSueldo() + " Fecha de alta: " + e.dameFechaContrato());
		}
	}
}
class Empleado implements Comparable {
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		nombre = nom;
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno,mes-1,dia);
		altaContrato = calendario.getTime();	
		++IdSiguiente;
		Id = IdSiguiente;
	}
	public Empleado(String nom) {
		this(nom,30000,2000,01,01);
	}
	public String dameNombre() {	//GETTER
		return nombre + " Id: " + Id;
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
	public int compareTo(Object miObjeto) {
		Empleado otroEmpleado = (Empleado) miObjeto;
		if (this.sueldo < otroEmpleado.sueldo) {
			return -1;
		}
		if (this.sueldo > otroEmpleado.sueldo) {
			return 1;
		}
		return 0;
	}
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private static int IdSiguiente;
	private int Id;
}
class Jefatura extends Empleado implements Jefes { 	//Con final le decimos que otra clase no puede heredar de ella
	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
		super(nom, sue, agno, mes, dia);
	}
	public String tomar_decisiones(String decision) {
		return "Un miembro de la direccion ha tomado la decision de: " + decision;
	}
	public void estableceIncentivo(double b) {
		incentivo = b;
	}
	public double dameSueldo() {
		double sueldoJefe = super.dameSueldo();
		return sueldoJefe + incentivo;
	}
	private double incentivo;
}
/*class Director extends Jefatura {
	public Director(String nom, double sue, int agno, int mes, int dia) {
		super(nom, sue, agno, mes, dia);
	}
}*/




