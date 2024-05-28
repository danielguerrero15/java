package co.com.tienda.modelo;

public class EquipoDeSonido extends Electrodomestico{
    protected int nmrBandejasCD;
    protected int potencia;
    protected int nmrBafles;
    protected boolean tieneMP3;

    public EquipoDeSonido(String nombre, String marca, String color, int codigoBarras, int nmrBandejasCD, int potencia, int nmrBafles, boolean tieneMP3) {
        super(nombre, marca, color, codigoBarras);
        this.nmrBandejasCD = nmrBandejasCD;
        this.potencia = potencia;
        this.nmrBafles = nmrBafles;
        this.tieneMP3 = tieneMP3;
    }

    public EquipoDeSonido() {
        super();
    }

    public int getNmrBandejasCD() {
        return nmrBandejasCD;
    }

    public void setNmrBandejasCD(int nmrBandejasCD) {
        this.nmrBandejasCD = nmrBandejasCD;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getNmrBafles() {
        return nmrBafles;
    }

    public void setNmrBafles(int nmrBafles) {
        this.nmrBafles = nmrBafles;
    }

    public boolean isTieneMP3() {
        return tieneMP3;
    }

    public void setTieneMP3(boolean tieneMP3) {
        this.tieneMP3 = tieneMP3;
    }

    @Override
    public int calcularValor() {
        return 0;
    }
}
