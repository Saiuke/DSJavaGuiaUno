package ean.universidad;

public class Salón {

    private int codigo;

    private Curso[] cursos;

    private Profesor[] profesores;

    private Alumno[] alumnos;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Curso[] getCursos() {
        return cursos;
    }

    public void setCursos(Curso[] cursos) {
        this.cursos = cursos;
    }

    public Profesor[] getProfesores() {
        return profesores;
    }

    public void setProfesores(Profesor[] profesores) {
        this.profesores = profesores;
    }

    public Alumno[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }
}
