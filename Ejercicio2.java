import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutosTotales = 0;
        while (true) {
            System.out.print("Ingrese la duracion de un periodo de vieje (minutos) (0 para terminar): ");
            int tramo = scanner.nextInt();
            if (tramo == 0) {
                break;
            }
            minutosTotales += tramo;
        }
        int horas = minutosTotales / 60;
        int minutos = minutosTotales % 60;
        System.out.println("Tiempo total de viaje: " + horas + " horas, " + minutos + " minutos");
    }
}
