package ean.universidad;

public abstract class Persona {

    private int codigo;

    private char nombre;

    private char numDocumento;

    private char fechaNascimiento;

    private char nacionalidad;

    private char ciudadNascimiento;

    private char estadoNascimiento;

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

    public char getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(char numDocumento) {
        this.numDocumento = numDocumento;
    }

    public char getFechaNascimiento() {
        return fechaNascimiento;
    }

    public void setFechaNascimiento(char fechaNascimiento) {
        this.fechaNascimiento = fechaNascimiento;
    }

    public char getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(char nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public char getCiudadNascimiento() {
        return ciudadNascimiento;
    }

    public void setCiudadNascimiento(char ciudadNascimiento) {
        this.ciudadNascimiento = ciudadNascimiento;
    }

    public char getEstadoNascimiento() {
        return estadoNascimiento;
    }

    public void setEstadoNascimiento(char estadoNascimiento) {
        this.estadoNascimiento = estadoNascimiento;
    }
}