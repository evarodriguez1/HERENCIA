package n2ejercicio1;

public class Biciclo extends Ciclo {

	public Biciclo() {
		super(2);
	}
	
	public void ride() {
		super.ride();
		System.out.println("Está andandando en el biciclo");
	}
	
	public void balance() {
		super.balance();
		System.out.println("El balance del biciclo está listo");
	}

}
