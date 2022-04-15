
public class Camion extends Vehicule {
	
	public Camion() {
		
	}
	
	public Camion (String M, String m, String C, int A, int P) {
		super(M,m,C,A,P);
		
	}
	
	public void demarrer() {
		System.out.println("Merci de la visite");
	}
	
	
    public void accelerer() {
    	System.out.println("Tu va vite");
    }



}
