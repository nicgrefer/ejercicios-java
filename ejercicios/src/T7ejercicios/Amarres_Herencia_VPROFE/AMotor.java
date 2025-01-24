package ejercicios.amarres;

abstract public class AMotor extends Barco {

    protected double cv;

    public AMotor(String matricula, double eslora, int anioFabrica, double cv) {
        super(matricula, eslora, anioFabrica);
        this.cv = cv;
    }

    public double getCv() {
        return cv;
    }

    public void setCv(double n) {
        this.cv = n;
    }

    @Override
    public double getModulo() {
        return super.getModulo() + this.cv;
    }
    
    @Override
    public String toString(){
        return super.toString() + " Potencia=" + this.cv + " CV";
    }
}
