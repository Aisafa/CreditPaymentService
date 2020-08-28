public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double monthPayment1=service.calculate(1, 1_000_000, 9.99);
        System.out.println(String.format("Credit term 1 year: monthly payment = %.0f RUB | interest rate 9.9",monthPayment1));
        double monthPayment2=service.calculate(2, 1_000_000, 9.99);
        System.out.println(String.format("Credit term 2 year: monthly payment = %.0f RUB | interest rate 9.9 ",monthPayment2));
        double monthPayment3=service.calculate(3, 1_000_000, 9.99);
        System.out.println(String.format("Credit term 3 year: monthly payment = %.0f RUB | interest rate 9.9",monthPayment3));
    }

}
