package n2ejercicio1;

public class Ciclo {

	protected int cantidadRuedas;
	
	public Ciclo (int cantidadRuedas) {
		this.cantidadRuedas = cantidadRuedas;
	}
	
	public void ride () {
		System.out.println("");
		System.out.println("Cantidad de ruedas: " + ruedas());	
	}
	
	public int ruedas() {
		return cantidadRuedas;
	}
	
	public void balance() {
		System.out.println("");
	}
	
	

}
