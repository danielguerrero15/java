package ejercicios.sockets;

public class Principal {
    public static void main(String[] args) {
        int puerto = 3000;
        TCPServer server1 = new TCPServer(puerto);
        server1.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        TCPClient cliente1 = new TCPClient("18.227.102.153",puerto);
        cliente1.start();
    }
}
