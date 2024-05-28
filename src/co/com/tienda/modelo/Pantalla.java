package co.com.tienda.modelo;

public class Pantalla extends Electrodomestico {
    protected int resolucion;
    protected String tipo;
    protected int pulgada;
    protected boolean esDePlasma;

    public Pantalla(String nombre, String marca, String color, int codigoBarras, int resolucion, String tipo, int pulgada, boolean esDePlasma) {
        super(nombre, marca, color, codigoBarras);
        this.resolucion = resolucion;
        this.tipo = tipo;
        this.pulgada = pulgada;
        this.esDePlasma = esDePlasma;
    }

    public Pantalla() {

    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPulgada() {
        return pulgada;
    }

    public void setPulgada(int pulgada) {
        this.pulgada = pulgada;
    }

    public boolean isEsDePlasma() {
        return esDePlasma;
    }

    public void setEsDePlasma(boolean esDePlasma) {
        this.esDePlasma = esDePlasma;
    }

    @Override
    public int calcularValor() {
        return 0;
    }
}
