package ean.universidad;

public class Universidad {

    private char nombre;

    private char nombreRector;

    private char direccion;

    private Facultad[] facultades;

    public char getNombre() {
        return nombre;
    }

    public void setNombre(char nombre) {
        this.nombre = nombre;
    }

    public char getNombreRector() {
        return nombreRector;
    }

    public void setNombreRector(char nombreRector) {
        this.nombreRector = nombreRector;
    }

    public char getDireccion() {
        return direccion;
    }

    public void setDireccion(char direccion) {
        this.direccion = direccion;
    }

    public Facultad[] getFacultades() {
        return facultades;
    }

    public void setFacultades(Facultad[] facultades) {
        this.facultades = facultades;
    }
}
