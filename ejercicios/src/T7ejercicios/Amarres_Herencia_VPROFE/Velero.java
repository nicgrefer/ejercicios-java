package ejercicios.amarres;

public class Velero extends Barco {
   
    private int numMastiles;
   
    public Velero(String matricula, double eslora, int anioFabrica, int numMastiles) {
        super(matricula, eslora, anioFabrica);
        this.numMastiles=numMastiles;
    }

    public int getNumMastiles() {
        return numMastiles;
    }
  
    public void setNumMastiles(int n) {
        this.numMastiles = n;
    }

    @Override
    public double getModulo() {
        return super.getModulo() + this.numMastiles;
    }
    
    @Override
    public String toString(){
        return "Tipo: " + this.getClass().getSimpleName() + super.toString() + " Mástiles=" + this.numMastiles;
    }
}
