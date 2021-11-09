package n2ejercicio2;

public class Hamster extends Roedor {

	public Hamster(String especieRoedor) {
		super("Hamster");
	}
	
	public void comer() {
		super.comer();
		System.out.println(" zanahoria.");
	}
	
	public void saltar() {
		super.saltar();
		System.out.println(" la jaula");
	}
}
