public class PaymentProcessor {

    public void processPayment(Bitcoin bitcoin){
        System.out.println("Processing bitcoin Payment ");

    }
    public void processPayment(CreditCard creditCard){
        System.out.println("Processing credit Car payment from card number: " + creditCard.cardNumber);
//if condition to check if the card has enough money to pay if yes we allow the payment and sub payment from the balance
        if(creditCard.amountToPay > 0 && creditCard.amountToPay <= creditCard.balance){
            System.out.println("Payment of $" + creditCard.amountToPay + "Approved.");
            creditCard.balance -= creditCard.amountToPay;
        }
        else {
            System.out.println("Payment failed. Not enough balance.");
        }
    }
    public void processPayment(PayPal payPal){
        System.out.println("Processing payPal payment with email: " + payPal.email);
//        if statement too check if the user have some money on payPal

        if(payPal.balance > 0 && payPal.balance <= 10000 ){
            System.out.println("insufficient balance. Your current balance is:" + payPal.balance);
        }
        else {
            System.out.println("Your paypal balance is:" + payPal.balance);
        }
    }

}
