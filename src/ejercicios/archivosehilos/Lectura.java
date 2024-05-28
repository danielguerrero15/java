package ejercicios.archivosehilos;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lectura {

    public static void launcherJava() throws IOException {
        String[] cmd = {"cmd", "/c", "java -version"};
        ProcessBuilder pb = new ProcessBuilder(cmd);
        pb.redirectError(new File("salida.txt"));
        Process proceso = pb.start();
    }

    public static void launcher() throws IOException {
        String[] cmd = {"cmd", "/c", "java -version"};
        ProcessBuilder pb = new ProcessBuilder(cmd);
        Process proceso = pb.start();
        BufferedReader br = new BufferedReader(new InputStreamReader(proceso.getErrorStream()));
        String line;
        while (true) {
            line = br.readLine();
            if (line == null) {
                break;
            }
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
    }
}
