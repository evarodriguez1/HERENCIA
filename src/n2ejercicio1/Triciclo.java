package n2ejercicio1;

public class Triciclo extends Ciclo {

	public Triciclo() {
		super(3);
	}
	
	public void ride() {
		super.ride();
		System.out.println("Est� andando en el triciclo");
	}
}
