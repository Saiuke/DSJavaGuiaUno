package ean.universidad;

public class Facultad {

    private char nombre;

    private Carrera carreras;

    public char getNombre() {
        return nombre;
    }

    public void setNombre(char nombre) {
        this.nombre = nombre;
    }

    public Carrera getCarreras() {
        return carreras;
    }

    public void setCarreras(Carrera carreras) {
        this.carreras = carreras;
    }
}
