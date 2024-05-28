package co.com.tienda.controller;

import co.com.tienda.modelo.Electrodomestico;

public class Inventario {
    public final static int CAPACIDAD_MAXIMA_BODEGA =100;
    //static capacidad total general
    //si se pone articulos static solo abria un arreglo de articulos para todos los inventarios que se creen
    Electrodomestico articulos[] = new Electrodomestico[CAPACIDAD_MAXIMA_BODEGA]; //Asignación de memoria
    private void agregarElemento(Electrodomestico electrodomestico){
        Integer cantidadElementosDisponibles;
    }

    public String mostrarInventario(){
        StringBuilder sb = new StringBuilder();
        //Esta acoplado porque define que mostrar de sus clases hijas

        for(Electrodomestico e: articulos){
            if(e!= null) {
                sb.append(e.getNombre());
            }
        }

        return sb.toString();
    }

    public int calcularValorTotal(){
        //No esta acoplado porque delega a cada elemento el calcular su propio valor
        //Y eso es perfecto
        int total = 0;
        for(Electrodomestico e: this.articulos){
            if(e!= null){
                total += e.calcularValor();
            }
        }
        return 0;
    }
}
