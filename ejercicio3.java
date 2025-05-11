import java.util.Random;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] personas = {"Ana", "Luis", "Pedro", "Maria", "Carlos", "Sofia", "Julia", "Juan"};
        boolean continuar = true;

        // Mientras haya personas y el usuario quiera continuar
        while (continuar && personas.length > 0) {
            // Selección aleatoria de un ganador
            Random rand = new Random();
            int indiceGanador = rand.nextInt(personas.length);
            String ganador = personas[indiceGanador];

            // Mostrar el ganador
            System.out.println("¡El ganador del premio es: " + ganador + "!");

            // Preguntar si se desea hacer otro sorteo
            System.out.print("¿Otra vez? (S/N): ");
            String respuesta = scanner.nextLine().toUpperCase();

            if (respuesta.equals("N") || respuesta.equals("NO")) {
                continuar = false;
            } else {
                // Eliminar al ganador del array
                String[] nuevaLista = new String[personas.length - 1];
                for (int i = 0, j = 0; i < personas.length; i++) {
                    if (i != indiceGanador) {
                        nuevaLista[j++] = personas[i];
                    }
                }
                personas = nuevaLista;  // Actualizar la lista de personas
            }
        }

        if (personas.length == 0) {
            System.out.println("No quedan más personas para premiar.");
        }
    }
}
