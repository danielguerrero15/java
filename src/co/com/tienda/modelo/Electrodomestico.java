package co.com.tienda.modelo;

public abstract class Electrodomestico {
    protected String nombre;
    protected String marca;
    protected String color;
    protected int codigoBarras;

    public Electrodomestico(String nombre, String marca, String color, int codigoBarras) {
        this.nombre = nombre;
        this.marca = marca;
        this.color = color;
        this.codigoBarras = codigoBarras;
    }

    public Electrodomestico() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(int codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public abstract int calcularValor();

}
