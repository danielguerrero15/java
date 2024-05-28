package ejercicios.sockets;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Serializar {
    public void escribir(String filename) {
        Registro objeto = new Registro();
        Scanner scan = new Scanner(System.in);
        ArrayList datos = new ArrayList<>();
        try (
                FileOutputStream fio = new FileOutputStream(filename);
                ObjectOutputStream bio = new ObjectOutputStream(fio);
                PrintStream ps = new PrintStream(bio);
        ) {
            do {
                String line = scan.nextLine();
                datos.add(line);
                if(line.equalsIgnoreCase("exit")) break;
                bio.writeObject(line);
            }while (true);
            ps.println(datos);

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
    public void leer(String filename) {
        try (
                FileInputStream fio = new FileInputStream(filename);
                DataInputStream dio = new DataInputStream(fio)
        ){
            for(/*inicializo variables*/;dio.available() > 0 ; /*incrementos*/){
                System.out.println(dio.read());
            }
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String filename = "archivo.txt";
        Serializar archivo = new Serializar();
        archivo.escribir("archivo.txt");
        archivo.leer(filename);
    }
}
