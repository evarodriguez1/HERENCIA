package n1ejercicio4;

public class Vehicle {
	private static int kilometraje;
	private final int maxVelocidad;
	private static final int numPlaca = 123;
	
	public Vehicle(final int maxVelocidad, int kilometraje) {
		this.maxVelocidad = maxVelocidad;
		this.kilometraje = kilometraje;
		System.out.println("El vehículo tiene una velocidad máx de: "+maxVelocidad+" y un kilometraje de: "+kilometraje+" Km");
	}
	
	public void iniciar() {
		System.out.println("Método iniciar vehicle");
	}

	public static void parar() {
		System.out.println( "Método parar vehicle");
	
	}
	
	public void acelerar() {
		System.out.println("Método acelerar vehicle");
	}
}
