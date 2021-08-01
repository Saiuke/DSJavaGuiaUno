package ean.universidad;

public class Carrera {

    private char nombre;

    private Curso[] cursos;

    private int creditosTotales;

    private int semestres;

    private char nivel;

    private Facultad[] facultades;

    public char getNombre() {
        return nombre;
    }

    public void setNombre(char nombre) {
        this.nombre = nombre;
    }

    public Curso[] getCursos() {
        return cursos;
    }

    public void setCursos(Curso[] cursos) {
        this.cursos = cursos;
    }

    public int getCreditosTotales() {
        return creditosTotales;
    }

    public void setCreditosTotales(int creditosTotales) {
        this.creditosTotales = creditosTotales;
    }

    public int getSemestres() {
        return semestres;
    }

    public void setSemestres(int semestres) {
        this.semestres = semestres;
    }

    public char getNivel() {
        return nivel;
    }

    public void setNivel(char nivel) {
        this.nivel = nivel;
    }

    public Facultad[] getFacultades() {
        return facultades;
    }

    public void setFacultades(Facultad[] facultades) {
        this.facultades = facultades;
    }
}
