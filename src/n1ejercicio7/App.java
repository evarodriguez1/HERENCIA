package n1ejercicio7;

public class App {
	public static void main(String[]args) {
		Rana frog = new Rana();
		Anfibio padre = (Anfibio) frog;
		padre.comer();
		padre.saltar();
		padre.nadar();
		
		
		Rana hijo = (Rana) padre;
		hijo.comer();
		hijo.saltar();
		hijo.nadar();
		hijo.reproducir();
	}

}
