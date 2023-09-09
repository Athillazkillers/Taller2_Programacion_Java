import java.util.Scanner;

public class Punto3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;

        while (true) {
            System.out.print("Ingrese un número entero (0 para terminar): ");
            int valor = scanner.nextInt();
            if (valor > 0) {
                positivos++;
            } else if (valor < 0) {
                negativos++;
            } else {
                break;
            }
        }

        System.out.println("Valores positivos: " + "*".repeat(positivos));
        System.out.println("Valores negativos: " + "*".repeat(negativos));
    }
}

