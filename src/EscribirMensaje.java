/* Creamos aplicacion sencilla que escriba automáticamente en un fichero de texto la frase “este es un ejemplo de escritura”
 mediante BufferedWriter.
 El fichero estará localizado en una carpeta llamada Recursos en la carpeta del proyecto Java
*/
// Importamos las librerías necesarias
import java.io.*;

// Definimos la clase principal
public class EscribirMensaje {
    public static void main(String[] args) {

        //Ruta hacia la carpeta Recursos + archivo mensaje.txt
        File archivo = new File("Recursos/mensaje.txt");

        // Intentamos escribir en el archivo con BufferedWriter y que se queden guardados los datos con true.
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo,true))) {
            // Escribimos la frase en el archivo y metemos un salto de linea para lo nuevo
            escritor.write("Salto de linea y guardado" + System.lineSeparator());
            System.out.println("Mensaje escrito correctamente en " + archivo.getAbsolutePath());
        } catch (IOException e) {
            // Manejamos cualquier excepción que pueda ocurrir
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
