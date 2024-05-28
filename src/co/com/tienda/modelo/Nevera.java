package co.com.tienda.modelo;

public class Nevera extends Electrodomestico {
    protected int numVolumen;
    protected float numAltura;
    protected boolean blnNoFrost;

    public Nevera(String nombre, String marca, String color, int codigoBarras, int numVolumen, float numAltura, boolean blnNoFrost) {
        super(nombre, marca, color, codigoBarras);
        this.numVolumen = numVolumen;
        this.numAltura = numAltura;
        this.blnNoFrost = blnNoFrost;
    }

    public Nevera() {

    }

    public int getNumVolumen() {
        return numVolumen;
    }

    public void setNumVolumen(int numVolumen) {
        this.numVolumen = numVolumen;
    }

    public float getNumAltura() {
        return numAltura;
    }

    public void setNumAltura(float numAltura) {
        this.numAltura = numAltura;
    }

    public boolean isBlnNoFrost() {
        return blnNoFrost;
    }

    public void setBlnNoFrost(boolean blnNoFrost) {
        this.blnNoFrost = blnNoFrost;
    }

    @Override
    public int calcularValor() {
        return 0;
    }
}
