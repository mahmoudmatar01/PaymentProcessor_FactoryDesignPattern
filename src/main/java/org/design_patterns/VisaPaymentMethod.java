package org.design_patterns;

public class VisaPaymentMethod extends PaymentMethod{

    public VisaPaymentMethod(String cardHolder, String cardNumber, String expiryDate, String cvv) {
        super(cardHolder, cardNumber, expiryDate, cvv);
    }

    @Override
    public void authorizePayment() {
        System.out.println("authorizing visa payment method");
    }

    @Override
    public void startMoneyTransfer() {
        System.out.println("starting transfer money for visa payment method");
    }

    @Override
    public void calculatePaymentFee(double amount) {
        System.out.println("calculating payment fee for visa payment method");
    }
}

