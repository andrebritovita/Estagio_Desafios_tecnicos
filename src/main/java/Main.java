package src.main.java;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] fib = new int[20];
        int n1 = 0, n2 = 1;
        fib[0] = n1;
        fib[1] = n2;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número entre 0 e 4.181: ");
        int numero = scanner.nextInt();

        for (int pos = 2; pos < fib.length; pos++) {
            fib[pos] = fib[pos - 1] + fib[pos - 2];
        }
        boolean fibo = false;
        for (int pos = 0; pos < fib.length; pos++) {
            if (fib[pos] == numero) {
                fibo = true;
                break;
            }
        }
       if (fibo) {
           System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
       } else {
           System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
       }
    }
}
