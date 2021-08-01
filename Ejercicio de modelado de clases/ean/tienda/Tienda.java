package ean.tienda;

public class Tienda {

    private char nombre;

    private char dirección;

    private char telefono;

    private ean.tienda.Producto[] producto;

    public char getNombre() {
        return nombre;
    }

    public void setNombre(char nombre) {
        this.nombre = nombre;
    }

    public char getDirección() {
        return dirección;
    }

    public void setDirección(char dirección) {
        this.dirección = dirección;
    }

    public char getTelefono() {
        return telefono;
    }

    public void setTelefono(char telefono) {
        this.telefono = telefono;
    }

    public ean.tienda.Producto[] getProducto() {
        return producto;
    }

    public void setProducto(ean.tienda.Producto[] producto) {
        this.producto = producto;
    }
}
