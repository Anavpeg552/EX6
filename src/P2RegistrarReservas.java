import java.util.Scanner;
import java.util.*;
import java.io.*;

public class P2RegistrarReservas {
    public static void main(String[] args) throwsIOException{
        File fichero = new File("amigos.dat");
        if(!fichero.exists()) {
            try (RandomAccessFile raf= new RandomAccessFile(fichero, "rw")) {
                guardarNumeroRegistros(raf, 0);
            }
        }
    }
}
