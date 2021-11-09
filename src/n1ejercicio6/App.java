package n1ejercicio6;

public class App {
	public static void main(String[]args) {
		Rana frog = new Rana();
		Anfibio padre = (Anfibio) frog;
		padre.comer();
		padre.saltar();
		padre.nadar();
		//padre.reproducir(); ---> esto no se puede porque el padre no puede agarrar del hijo
		
		Rana hijo = (Rana) padre;
		hijo.comer();
		hijo.saltar();
		hijo.nadar();
		hijo.reproducir();
	}

}
