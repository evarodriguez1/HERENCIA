package n3ejercicio1;

public class Animal {
	private String especieAnimal;
	
	public Animal (String especieAnimal) {
		this.especieAnimal = especieAnimal;
	}
	
	public void ruidoDelAnimal() {
		System.out.println("El "+especieAnimal+" maulla.");
		comidaDelAnimal();
	}
	
	public void comidaDelAnimal() {
		System.out.println("El "+especieAnimal+" come atún.");
	}

}
