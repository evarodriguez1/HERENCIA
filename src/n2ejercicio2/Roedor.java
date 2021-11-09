package n2ejercicio2;

public class Roedor {
	private String especieRoedor;
	
	public Roedor(String especieRoedor) {
		this.especieRoedor = especieRoedor;
	}

	public void comer() {
		System.out.print("El "+especieRoedor+" está comiendo");
	}

	public void saltar() {
		System.out.print("El "+especieRoedor+" está saltando en");	
	}
	
	public String especieRoedor() {
		return especieRoedor;
	}
}
