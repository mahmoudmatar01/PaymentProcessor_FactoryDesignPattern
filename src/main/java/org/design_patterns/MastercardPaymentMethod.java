package org.design_patterns;

public class MastercardPaymentMethod extends PaymentMethod {

    public MastercardPaymentMethod(String cardHolder, String cardNumber, String expiryDate, String cvv) {
        super(cardHolder, cardNumber, expiryDate, cvv);
    }

    @Override
    public void authorizePayment() {
        System.out.println("authorizing mastercard payment method");
    }

    @Override
    public void startMoneyTransfer() {
        System.out.println("starting transfer money for mastercard payment method");
    }

    @Override
    public void calculatePaymentFee(double amount) {
        System.out.println("calculating payment fee for mastercard payment method");
    }
}
