package org.design_patterns;

public class PaypalPaymentMethod extends PaymentMethod{

    public PaypalPaymentMethod(String cardHolder, String cardNumber, String expiryDate, String cvv) {
        super(cardHolder, cardNumber, expiryDate, cvv);
    }

    @Override
    public void authorizePayment() {
        System.out.println("authorizing paypal payment method");
    }

    @Override
    public void startMoneyTransfer() {
        System.out.println("starting transfer money for paypal payment method");
    }

    @Override
    public void calculatePaymentFee(double amount) {
        System.out.println("calculating payment fee for paypal payment method");
    }
}
