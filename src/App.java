import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de elementos a mostrar de la serie: ");
        int limite = sc.nextInt();
        sc.close();

        System.out.println("\n Factorial");
        System.out.println(factorial(limite));
    }

    /**
     * Factorial
     * @param n
     * @return
     */
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
