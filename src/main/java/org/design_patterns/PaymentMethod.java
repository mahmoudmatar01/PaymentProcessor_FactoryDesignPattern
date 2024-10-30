package org.design_patterns;

public abstract class PaymentMethod {

    private String cardHolder;
    private String cardNumber;
    private String expiryDate;
    private String cvv;

    public PaymentMethod(String cardHolder, String cardNumber, String expiryDate, String cvv) {
        this.cardHolder = cardHolder;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    public void transferMoney(double amount) {
        authorizePayment();
        startMoneyTransfer();
        calculatePaymentFee(amount);
    }

    protected abstract void authorizePayment();
    protected abstract void startMoneyTransfer();
    protected abstract void calculatePaymentFee(double amount);

    // getter and setter method
    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
}
