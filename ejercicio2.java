public class ejercicio2 {
    public static void main(String[] args) {
        int[] numeros = {12, 7, 34, 5, 8, 23, 14, 19, 28, 31, 22, 45, 38, 9, 50, 27, 60, 3, 2, 10};
        int pares = 0;
        int impares = 0;

        // Recorrer el array y contar los números pares e impares
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        // Mostrar los resultados
        System.out.println("Número de números pares: " + pares);
        System.out.println("Número de números impares: " + impares);
    }
}
