public class CreditPaymentService {
    public double calculate(long creditTerm, long creditAmount, double interestRateYear) {
        double termMonth = creditTerm*12;
        double interestRateMonth=interestRateYear/100/12;
        double coef = interestRateMonth*(Math.pow(1+interestRateMonth,termMonth))/((Math.pow(1+interestRateMonth,termMonth))-1);
        double monthPayment= coef*creditAmount;
       return monthPayment;
    }
}
