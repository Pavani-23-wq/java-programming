
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        long fact = 1;

        if (n < 0) {
            System.out.println("Factorial not defined");
        } else {
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }

            System.out.println("Factorial = " + fact);
        }
    }
}
