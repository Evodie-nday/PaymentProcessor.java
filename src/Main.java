public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        Bitcoin bitcoin = new Bitcoin();

        processor.processPayment(bitcoin);
    }
}