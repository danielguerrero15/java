package ejercicios.sockets;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Registro implements Serializable {
    transient private String valor;

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Registro{");
        sb.append(", valor='").append(valor).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
