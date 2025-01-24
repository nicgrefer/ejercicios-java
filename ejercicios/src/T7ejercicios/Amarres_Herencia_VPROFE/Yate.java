package ejercicios.amarres;

public class Yate extends AMotor {
   
    private int camarotes;

    public Yate(String matricula, double eslora, int anioFabrica,int cv, int camarotes) {
        super(matricula, eslora, anioFabrica,cv);
        this.camarotes=camarotes;
    }

    public int getCamarotes() {
        return camarotes;
    }
    
    public void setCamarotes(int n) {
        this.camarotes = n;
    }

    //Métodos
    @Override
    public double getModulo() {
        return super.getModulo() + this.camarotes;
    }
    
    @Override
    public String toString(){
        return "Tipo: " + this.getClass().getSimpleName() + super.toString() + " Camarotes=" + this.camarotes;
    }
}
