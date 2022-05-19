public class CreditPaymentService {
    public int calculate(int summa, int creditPeriod, double percent) {
        double function3 = (percent / 1200);
        double function2 = 1 - Math.pow(1 + function3, -creditPeriod);
        double function = (function3 / function2);
        int twelveMonthPayment = (int) (summa * function);
        return twelveMonthPayment;
    }
}

