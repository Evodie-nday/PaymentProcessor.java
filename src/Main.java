public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        Bitcoin bitcoin = new Bitcoin();
        CreditCard creditCard = new CreditCard("159-879", 3000000, 130000);
        PayPal payPal = new PayPal("user@example.com", 8000);

        processor.processPayment(bitcoin);
        processor.processPayment(creditCard);
        processor.processPayment(payPal);
    }
}