import java.util.Scanner;

public class Punto4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int num = scanner.nextInt();
        Punto4 palidromo = new Punto4();
        if (palidromo.esplaindromo(num)) {
            System.out.println(num + " es un palíndromo.");
        } else {
            System.out.println(num + " no es un palíndromo.");
        }
    }

    boolean esplaindromo(int num) {
        int alreves = 0;
        int normal = num;
        while (num != 0) {
            int digit = num % 10;
            alreves = alreves * 10 + digit;
            num /= 10;
        }
        return normal == alreves;
    }
}

