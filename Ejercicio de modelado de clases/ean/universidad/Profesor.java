package ean.universidad;

public class Profesor {

    private char profesion;

    private float sueldo;
    private Facultad facultad;

    public char getProfesion() {
        return profesion;
    }

    public void setProfesion(char profesion) {
        this.profesion = profesion;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

}
