package ean.tienda;

public class Producto {

    private int codigo;

    private char nombre;

    private ean.tienda.TipoProducto tipo;

    private float precioCompra;

    private float precioVenta;

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

    public ean.tienda.TipoProducto getTipo() {
        return tipo;
    }

    public void setTipo(ean.tienda.TipoProducto tipo) {
        this.tipo = tipo;
    }

    public float getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(float precioCompra) {
        this.precioCompra = precioCompra;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }
}
