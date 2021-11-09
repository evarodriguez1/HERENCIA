package n2ejercicio2;

public class Jerbo extends Roedor {

	public Jerbo(String especieRoedor) {
		super("Jerbo");
	}

	public void comer() {
		super.comer();
		System.out.println(" una fruta.");
	}
	
	public void saltar() {
		super.saltar();
		System.out.println(" un árbol.");
	}
}
