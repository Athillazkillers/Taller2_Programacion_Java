import java.util.Scanner;

public class Punto7 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("¿Cuántos datos serán ingresados? ");
        int N = S.nextInt();
        double[] D = new double[N];
        for (int I = 0; I < N; I++) {
            System.out.print("Ingrese el dato número " + (I + 1) + ": ");
            D[I] = S.nextDouble();
        }
        double Mx = D[0];
        double Mn = D[0];
        for (int I = 1; I < N; I++) {
            if (D[I] > Mx) {
                Mx = D[I];
            }
            if (D[I] < Mn) {
                Mn = D[I];
            }
        }
        double R = Mx - Mn;
        System.out.println("El rango de los datos ingresados es: " + R);
    }
}

