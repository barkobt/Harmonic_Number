import java.util.Scanner;

public class Harmonic_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int harmonic = input.nextInt();
        double result = 0.0;
        for (double i = 1; i <= harmonic; i++) {
            result += (1.0 / i);
        }
        System.out.println(result);

    }
}

