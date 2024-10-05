//importamos la funcion java.util.Scanner para crear un objeto Scanner

import java.util.Scanner;

public class contar_digitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");

        //declaracion de variables
        int numero = scanner.nextInt();
        int contador = 0;
        
        // Manejo de número negativo
        if (numero < 0) {
            numero = -numero; // Convertir a positivo
        }
        
        // Contar dígitos incluyendo el cero
        if (numero == 0) {
            contador = 1; // El cero tiene un dígito
        } else {
            while (numero > 0) {
                numero /= 10; // Dividir por 10
                contador++;   // Incrementar contador
            }
        }
        
        //imprimimos el total de digitos que tiene el numero ingresado por teclado 
        System.out.println("El número tiene " + contador + " dígitos.");
    
    }
}

