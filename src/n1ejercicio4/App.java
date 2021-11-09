package n1ejercicio4;

public class App {

	public static void main(String[]args) {
		
		Vehicle volvo = new Vehicle(120,0);
		volvo.iniciar();
		volvo.acelerar();
		Vehicle.parar();
	}
}
