package ejercicios;

class EntidadViviente {
    public String genero;

    public EntidadViviente(String genero) {
        this.genero = genero;
    }

    public EntidadViviente() {
        System.out.println("Creo una --Entidad Viviente");
    }
}

class Persona extends EntidadViviente{
    public Persona() {
        super();
        System.out.println("Asigno la esencia --ejercicios.Persona");
    }
}
class Colombiano extends Persona {
    public String ciudadResidencia;
    public Colombiano(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
        System.out.println("Ubico a una persona en un lugar de colombia haciendolo --ejercicios.Colombiano");
    }

    public Colombiano(){
        System.out.println("Asigno la nacionalidad --ejercicios.Colombiano");
    }
}
public class Main {
    public static void main(String[] args) {
        Persona daniel = new Persona();
        Colombiano camilo = new Colombiano("Pereira");
    }
}