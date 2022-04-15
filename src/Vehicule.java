
public abstract class Vehicule {
	
	private int immatriculation;
	private static int nbvehicule=1;
    private String marque;
    private String modele;
    private String carburant;
    private int annee;
    private int prix;
    
    public Vehicule(){
    	
    };
    
    public Vehicule(String M, String m, String C, int A, int P){
        marque=M;
        modele=m;
        carburant=C;
        annee=A;
        prix=P;
        this.immatriculation=nbvehicule++;
        };
    
    public abstract void demarrer();
    public abstract void accelerer();
    
    public String toString(){
        return "l'immatriculation du vehicule est :"+immatriculation+", la marque du Vehicule est :"+this.marque+", le modele du vehicule est :"+this.modele+", le carburant est:"+this.carburant+", l'annee de sortie du vehicule est :"+this.annee+", le prix du vehicule est:"+this.prix;
    }
    
    	public boolean equals(Object o) {
    		
    		if (((Vehicule) (o)).immatriculation == immatriculation) {
    			return true;
    		}
    		return false;
    	}
    //getter
    
    public int getimma(){
    return this.immatriculation;
    }
    
    public String getmarque(){
    return this.marque;
    }
    
    public String getmodele(){
    return this.modele;
    }
    
    public String getcarburant(){
    return this.carburant;
    }
    
    public int getannee(){
    return this.annee;
    }
    
    public int getprix(){
    return this.prix;
    }
    
    //setter
    
    public void setimma(int S){
        this.immatriculation=S;
    }
    
    public void setmarque(String S){
        this.marque=S;
    }
    
    public void setmodele(String S){
        this.modele=S;
    }
    
    public void setcarburant(String S){
        this.carburant=S;
    }
    
    public void setannee (int S){
        this.annee=S;
    }
    
    public void setprix(int S){
        this.prix=S;
    }

}
