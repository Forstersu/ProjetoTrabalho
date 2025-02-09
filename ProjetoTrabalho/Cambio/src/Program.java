import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o valor do dólar? ");
        double precoDolar = scanner.nextDouble();

        System.out.print("Quantos dólares serão comprados? ");
        double quantia = scanner.nextDouble();

        double amountInReais = CurrencyConverter.converteDolar(precoDolar, quantia);

        System.out.printf("Valor a ser pago em reais = %.2f%n", amountInReais);

        scanner.close();
    }
}
