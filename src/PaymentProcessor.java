public class PaymentProcessor {

    public void processPayment(Bitcoin bitcoin){
        System.out.println("Processing bitcoin Payment ");

    }
    public void processPayment(CreditCard creditCard){
        System.out.println("Processing credit Car payment from card number: " + creditCard.cardNumber);
    }

}
