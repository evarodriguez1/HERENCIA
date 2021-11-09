package n2ejercicio2;

public class Raton extends Roedor {

	public Raton(String especieRoedor) {
		super("Raton");
	}
	
	public void comer() {
		super.comer();
		System.out.println(" queso.");
	}
	
	public void saltar() {
		super.saltar();
		System.out.println(" una alcantarilla.");
	}
}
