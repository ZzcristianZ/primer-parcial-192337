
//importamos Scanner 
import java.util.Scanner;

public class contar_palabras {

    public static void main(String[] args) {
        //creacion del objeto Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cadena de texto: ");
        String texto = scanner.nextLine();

        // Eliminar espacios al principio y al final, y reducir múltiples espacios
        texto = texto.trim().replaceAll("\\s+", " ");
        
        // Contar palabras
        int contador = 0;
        if (!texto.isEmpty()) {
            String[] palabras = texto.split(" ");
            contador = palabras.length; // El número de palabras es el tamaño del arreglo
        }
        
        //resultado final del programa que imprime el texto ya ordenado y la cantidad de palabras 
        System.out.println("La cadena de texto ("+texto+") contiene " + contador + " palabras.");
    
    }
}