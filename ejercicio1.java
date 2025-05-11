import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pide el tamaño del array
        System.out.print("¿Cuál es el tamaño del array? ");
        int tamaño = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        // Crear el array con el tamaño dado por el usuario
        String[] array = new String[tamaño];

        // Pedir elementos hasta que el array esté lleno
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Introduce el elemento " + (i + 1) + ": ");
            array[i] = scanner.nextLine();
        }

        // Mostrar el contenido del array
        System.out.println("\nArray completo:");
        for (String elemento : array) {
            System.out.println(elemento);
        }
    }
}

