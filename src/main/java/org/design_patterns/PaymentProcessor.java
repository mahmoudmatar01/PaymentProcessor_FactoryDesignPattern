package org.design_patterns;

public class PaymentProcessor {

    private final PaymentMethodFactory paymentMethodFactory;

    public PaymentProcessor(PaymentMethodFactory paymentMethodFactory) {
        this.paymentMethodFactory = paymentMethodFactory;
    }

    public void transferMoney(double amount, CardType cardType, String cardHolder, String cardNumber, String expiryDate, String cvv) {
        PaymentMethod paymentMethod = paymentMethodFactory.createPaymentMethod(cardType, cardHolder, cardNumber, expiryDate, cvv);
        paymentMethod.transferMoney(amount);

    }
}
