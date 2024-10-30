package org.design_patterns;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PaymentProcessor paymentProcessor = new PaymentProcessor(new PaymentMethodFactory());
        paymentProcessor.transferMoney(1200,CardType.VISA,"mahmoud matar","232324234232","12/3","123");

    }
}