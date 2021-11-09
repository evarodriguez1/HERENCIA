package n2ejercicio1;

public class Uniciclo extends Ciclo {
	
	public Uniciclo() {
		super(1);
	}
	
	public void ride() {
		super.ride();
		System.out.println("Está andando en el uniciclo");
	}
	
	public void balance() {
		super.balance();
		System.out.println("El balance del uniciclo está listo");
	}

}
