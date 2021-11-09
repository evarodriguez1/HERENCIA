package n3ejercicio1;

public class Main {
	public static void main(String[]args) {
		
		Gato gato = new Gato();
		
		Animal animal = (Animal)gato;
		
		gato.ruidoDelAnimal();
	}
}
