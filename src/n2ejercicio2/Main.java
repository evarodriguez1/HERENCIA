package n2ejercicio2;

public class Main {
	public static void main (String[]args) {
		 
		Hamster hamster = new Hamster("Hamster");
		Jerbo jerbo = new Jerbo("Jerbo");
		Raton raton = new Raton("Raton");
		
		
		
		Roedor[] matriz = new Roedor[3];
		
		hamster.comer();
		hamster.saltar();
		jerbo.comer();
		jerbo.saltar();
		raton.comer();
		raton.saltar();
		
		matriz [0] = hamster;
		matriz [1] = jerbo;
		matriz [2] = raton;
		
		
	}
	
	
}
