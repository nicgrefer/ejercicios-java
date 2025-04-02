package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public
class Calificacion {
    public String alumno;
    public String asignatura;
    public double nota;

    // Constructor vacío necesario para Jackson
    public Calificacion() {}

    public Calificacion(String alumno, String asignatura, double nota) {
        this.alumno = alumno;
        this.asignatura = asignatura;
        this.nota = nota;
    }

    // Getters y Setters obligatorios para Jackson
    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}