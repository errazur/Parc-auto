
public class generalmain {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Vehicule[] Parking = new Vehicule[5];
		
		Parking[0] = new Camion("Ford","Transit","super",2004,200000); 
	    Parking[1] = new Voiture("Ford","mustang gt","super",2006,350000);
	    Parking[2] = new Camion("Citroen","transit","plomb",2012,800000);
	    Parking[3] = new Camion("renault","transit","super",2016,700000);
	    Parking[4] = new Voiture("Dodge","charger","diesel",1961,160000);
	    
	    for (int i=0;i<5;i++) {
	    	System.out.println(Parking[i]);
	    	
	    }
	   
	    System.out.println(""+Parking[1].equals(Parking[4]));
		
	}

}
