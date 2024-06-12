import java.util.*;
import java.io.*;

public class P1ParImpar {
    public static void main(String[] args) throws IOException{
        try(
                InputStream is = new FileInputStream("prueba.txt");
                OutputStream os = new FileOutputStream("salida.txt");
        ){
            while(true){
                int dato = is.read();

                for (int i = 0; i < is.readAllBytes().length ; i++) {

                }
                if(dato == -1){
                    break;
                }

            }

            is.close();

        }catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        }catch (IOException e) {
            System.out.println("Ocurrió un error al leer el fichero");
        }

    }
}
