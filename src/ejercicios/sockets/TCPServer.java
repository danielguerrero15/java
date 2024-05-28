package ejercicios.sockets;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer extends Thread {
    private int puerto;

    public TCPServer(int puerto) {
        this.puerto = puerto;
    }

    public void run(){
        try (ServerSocket server = new ServerSocket(this.puerto)) {
            System.out.println("Escuchando en puerto: " + puerto);
            Socket conexion = server.accept();
            System.out.println("Se conecta "+ conexion.getInetAddress().getHostAddress());
            DataInputStream dis = new DataInputStream(conexion.getInputStream());
            PrintStream ps = new PrintStream(conexion.getOutputStream());
            do {
                System.out.println(dis.readLine());
                ps.println("Te escucho");
            }
            while (dis.available() > 0);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Se termina server");
    }
}
