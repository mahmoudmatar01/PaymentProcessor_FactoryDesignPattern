package org.design_patterns;

public class PaymentMethodFactory {

    public PaymentMethod createPaymentMethod(CardType cardType, String cardHolder, String cardNumber, String expiryDate, String cvv) {
        if(cardType == CardType.VISA) {
           return new VisaPaymentMethod( cardHolder,  cardNumber,  expiryDate,  cvv);
        }
        if(cardType == CardType.MASTERCARD) {
           return new MastercardPaymentMethod( cardHolder,  cardNumber,  expiryDate,  cvv);
        }
        if(cardType == CardType.PAYPAL){
           return new PaypalPaymentMethod( cardHolder,  cardNumber,  expiryDate,  cvv);
        }
        throw new IllegalArgumentException("Unsupported card type");
    }

}
