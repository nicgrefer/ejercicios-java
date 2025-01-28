package ejercicios.amarres;

import java.time.LocalDate;

public class Alquiler {

    private Cliente1 cli;
    private LocalDate fechaIni;
    private LocalDate fechaFin;
    private Amarre amarre;
    private Barco barco;

    public Alquiler(Cliente1 cli, LocalDate fechaIni, LocalDate fechaFin, Amarre amarre, Barco b) { //b=v   b=y
        this.cli = cli;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.amarre = amarre;
        this.barco = b;
    }

    public Cliente1 getCli() {
        return cli;
    }

    public Amarre getAmarre() {
        return amarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public LocalDate getFechaFin() {
       return fechaFin;
    }

    public LocalDate getFechaIni() {
       return fechaIni;
    }

    public void setCli(Cliente1 cli) {
        this.cli = cli;
    }

    public void setAmarre(Amarre amarre) {
        this.amarre = amarre;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    //parsear a Date
    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setFechaIni(LocalDate fechaIni) {
        this.fechaIni = fechaIni;
    }

    @Override
    public String toString() {
        String s;
        s = "Cliente: " + this.cli.toString() + "\n";        
        s += "Amarre: " + this.amarre.toString() + "\n";
        s += "Fecha inicio: " + this.getFechaIni() + "Fecha fin: " + this.getFechaFin();
        return s;
    }

    public double totalAlquiler() {       
        long dias=this.fechaFin.toEpochDay() - this.fechaIni.toEpochDay() + 1;
        System.out.println("Días " + dias); //Prueba de cáculo de días
        return dias * barco.getModulo();
    }
}
