package ejercicios.sockets;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class TCPClient extends Thread {
    private String ip;
    private int puerto;

    public TCPClient(String ip, int puerto) {
        this.ip = ip;
        this.puerto = puerto;
    }

    public void run(){
        Scanner scan = new Scanner(System.in);
        ArrayList datos = new ArrayList<>();
        try(Socket cliente = new Socket(this.ip, this.puerto);
            FileOutputStream fio = new FileOutputStream("hola.txt");
            ObjectOutputStream bio = new ObjectOutputStream(fio);){

            PrintStream ps = new PrintStream(cliente.getOutputStream());
            DataInputStream dis = new DataInputStream(cliente.getInputStream());
            ps.println("Hola");
            String lee = null;
            do{
                String line = scan.nextLine();
                if(line.equalsIgnoreCase("exit")) break;
                datos.add(line);
                bio.writeObject(datos);
                //lee = dis.readLine();
                //System.out.println("cliente recibe: " + lee);
            }while (true);
        }catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Se termina cliente");
    }
}
