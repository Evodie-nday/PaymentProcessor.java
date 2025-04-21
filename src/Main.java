public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        Bitcoin bitcoin = new Bitcoin();
        CreditCard creditCard = new CreditCard("159-879");

        processor.processPayment(bitcoin);
        processor.processPayment(creditCard);
    }
}