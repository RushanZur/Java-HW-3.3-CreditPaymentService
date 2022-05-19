public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int summa = 1_000_000;
        int creditPeriod = 12;
        double percent = 9.99;

        int twelveMonthPayment = service.calculate(summa, creditPeriod, percent);

        System.out.println("Ваш ежемесячный платеж составляет " + twelveMonthPayment);
    }
}

