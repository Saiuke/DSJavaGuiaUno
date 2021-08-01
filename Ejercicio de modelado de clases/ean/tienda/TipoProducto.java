package ean.tienda;

public class TipoProducto {

    private int codigo;

    private int nombre;

    private ean.tienda.Producto[] producto;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public ean.tienda.Producto[] getProducto() {
        return producto;
    }

    public void setProducto(ean.tienda.Producto[] producto) {
        this.producto = producto;
    }
}
