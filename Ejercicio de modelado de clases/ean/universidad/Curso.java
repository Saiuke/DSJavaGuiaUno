package ean.universidad;

public class Curso {

    private int codigo;

    private char nombre;

    private int creditos;

    private Profesor[] profesores;

    private Carrera carreras;

    private Salón salon;

    private Alumno[] alumnos;

    private Salón salón;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public char getNombre() {
        return nombre;
    }

    public void setNombre(char nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public Profesor[] getProfesores() {
        return profesores;
    }

    public void setProfesores(Profesor[] profesores) {
        this.profesores = profesores;
    }

    public Carrera getCarreras() {
        return carreras;
    }

    public void setCarreras(Carrera carreras) {
        this.carreras = carreras;
    }

    public Salón getSalon() {
        return salon;
    }

    public void setSalon(Salón salon) {
        this.salon = salon;
    }

    public Alumno[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }

    public Salón getSalón() {
        return salón;
    }

    public void setSalón(Salón salón) {
        this.salón = salón;
    }
}
