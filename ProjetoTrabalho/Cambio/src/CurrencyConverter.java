public class CurrencyConverter {
    private static final double imposto = 0.06;

    public static double converteDolar(double precoDolar, double quantia) {
        double valorTotal = precoDolar * quantia;
        return valorTotal + (valorTotal * imposto);
    }
}
