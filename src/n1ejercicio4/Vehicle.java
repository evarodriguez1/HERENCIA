package n1ejercicio4;

public class Vehicle {
	private static int kilometraje;
	private final int maxVelocidad;
	private static final int numPlaca = 123;
	
	public Vehicle(final int maxVelocidad, int kilometraje) {
		this.maxVelocidad = maxVelocidad;
		this.kilometraje = kilometraje;
		System.out.println("El veh�culo tiene una velocidad m�x de: "+maxVelocidad+" y un kilometraje de: "+kilometraje+" Km");
	}
	
	public void iniciar() {
		System.out.println("M�todo iniciar vehicle");
	}

	public static void parar() {
		System.out.println( "M�todo parar vehicle");
	
	}
	
	public void acelerar() {
		System.out.println("M�todo acelerar vehicle");
	}
}
