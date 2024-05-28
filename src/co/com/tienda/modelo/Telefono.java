package co.com.tienda.modelo;

public class Telefono extends Electrodomestico {
    protected int numAlcance;
    protected boolean blnIdentificador;
    protected boolean blInalambrico;

    public Telefono(String nombre, String marca, String color, int codigoBarras, int numAlcance, boolean blnIdentificador, boolean blInalambrico) {
        super(nombre, marca, color, codigoBarras);
        this.numAlcance = numAlcance;
        this.blnIdentificador = blnIdentificador;
        this.blInalambrico = blInalambrico;
    }

    public Telefono() {

    }

    public int getNumAlcance() {
        return numAlcance;
    }

    public void setNumAlcance(int numAlcance) {
        this.numAlcance = numAlcance;
    }

    public boolean isBlnIdentificador() {
        return blnIdentificador;
    }

    public void setBlnIdentificador(boolean blnIdentificador) {
        this.blnIdentificador = blnIdentificador;
    }

    public boolean isBlInalambrico() {
        return blInalambrico;
    }

    public void setBlInalambrico(boolean blInalambrico) {
        this.blInalambrico = blInalambrico;
    }

    @Override
    public int calcularValor() {
        return 0;
    }
}
