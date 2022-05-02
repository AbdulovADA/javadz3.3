public class CreditPaymentService {
    public int calculate(int creditSum, int period) {
        float yearInterest = 9.99F;
        float monthInterest = yearInterest / 100 / 12;
        int month = period * 12;
        float x = 1 + monthInterest;
        int y = month;
        double value = Math.pow(x, y);
        double monthPay = creditSum * (monthInterest + (monthInterest / (value - 1)));

        return (int) monthPay;
    }
}
