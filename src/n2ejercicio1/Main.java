package n2ejercicio1;

public class Main {
    public static void main(String[]args) {

        Triciclo tc = new Triciclo();
        Biciclo bc = new Biciclo();
        Uniciclo uc = new Uniciclo();

        uc.ride();
        bc.ride();
        tc.ride();

        Ciclo[] matriz = new Ciclo[3];
        matriz [0] = uc;
        matriz[1] = bc;
        matriz[2] = tc;

        for(int i=0; i<matriz.length; i++){
            if(matriz[i] instanceof Uniciclo) {
                matriz[i].balance();
            }else if (matriz[i] instanceof Biciclo){
                matriz[i].balance();
            }
        }
        
    }
}
