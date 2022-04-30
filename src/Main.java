public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int monthPay1 = service.calculate(1_000_000, 1);
        System.out.println("Процентная ставка: 9,99%, Ежемесячный платеж:" + monthPay1);

        int monthPay2 = service.calculate(1_000_000, 2);
        System.out.println("Процентная ставка: 9,99%, Ежемесячный платеж:" + monthPay2);

        int monthPay3 = service.calculate(1_000_000, 3);
        System.out.println("Процентная ставка: 9,99%, Ежемесячный платеж:" + monthPay3);
    }
}
