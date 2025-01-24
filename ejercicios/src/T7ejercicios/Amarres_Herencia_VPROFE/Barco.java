package ejercicios.amarres;

abstract public class Barco {

    protected String matricula;
    protected double eslora;
    protected int anioFab;
    protected final int CTE = 2;

    //Constructor
    public Barco(String matricula, double eslora, int anioFab) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFab = anioFab;
    }

    //Métodos genéricos para todos los barcos
    public double getModulo() {
        return this.eslora * 10 * this.CTE;
    }

    @Override
    public String toString() {
        return " Barco: " + "Matricula=" + matricula + ", Eslora=" + eslora + ", Año fabricación=" + anioFab;
    }

}
