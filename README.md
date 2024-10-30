# PaymentProcessor_FactoryDesignPattern

This project demonstrates the **Factory Design Pattern** through a payment processor system. It provides a flexible way to create various types of payment methods (e.g., Visa, Mastercard, Paypal) without tightly coupling the client code to specific classes.

## Project Structure

The project includes the following classes:

1. **PaymentMethod (Abstract Class)**
   - An abstract base class representing a generic payment method.
   - Contains fields for card details such as `cardHolder`, `cardNumber`, `expiryDate`, and `cvv`.
   - Defines a `transferMoney(double amount)` method that orchestrates the payment process by calling abstract methods that subclasses must implement.
   - Abstract methods:
     - `authorizePayment()`: For verifying the payment.
     - `startMoneyTransfer()`: For initiating the transaction.
     - `calculatePaymentFee(double amount)`: For calculating transaction fees.

2. **VisaPaymentMethod, MastercardPaymentMethod, PaypalPaymentMethod (Concrete Classes)**
   - Each of these classes extends `PaymentMethod` and implements the abstract methods in their unique way:
     - `authorizePayment()`: Verifies the payment method.
     - `startMoneyTransfer()`: Initiates the transfer.
     - `calculatePaymentFee(double amount)`: Calculates the fee for each payment type.
   - Each class provides specific logic tailored to the card type, following the **Factory Design Pattern**.

3. **CardType (Enum)**
   - An enumeration defining the supported payment types: `VISA`, `MASTERCARD`, and `PAYPAL`.

4. **PaymentMethodFactory**
   - The factory class responsible for creating instances of `PaymentMethod` based on the `CardType`.
   - `createPaymentMethod()` takes in a `CardType` and card details, returning the corresponding `PaymentMethod` instance.
   - Throws an exception if an unsupported `CardType` is provided.

5. **PaymentProcessor**
   - Serves as the client for the `PaymentMethodFactory`, providing a `transferMoney` method to initiate payments.
   - Uses `PaymentMethodFactory` to dynamically obtain the required `PaymentMethod` instance, allowing the `PaymentProcessor` to handle multiple payment types without any specific knowledge of the actual classes.
   
6. **Main (Driver Class)**
   - This class contains the `main` method, which demonstrates the usage of `PaymentProcessor` and `PaymentMethodFactory`.
   - Instantiates a `PaymentProcessor` and uses it to transfer money with a specified `CardType`.

## How It Works

1. **Factory Pattern**:
   - The Factory Design Pattern is used here to create instances of different payment methods (Visa, Mastercard, and Paypal) based on the `CardType`.
   - The client code only interacts with `PaymentProcessor` and `PaymentMethodFactory`, decoupling it from specific implementations of each payment type.

2. **Payment Processing Flow**:
   - The `transferMoney` method in `PaymentProcessor` takes in the payment details and card type.
   - It calls `createPaymentMethod()` from `PaymentMethodFactory`, which returns an appropriate `PaymentMethod`.
   - The `transferMoney()` method of `PaymentMethod` then orchestrates the authorization, transaction initiation, and fee calculation.

## Sample Output

Running the `Main` class with the sample payment data produces an output like:

```plaintext
authorizing visa payment method
starting transfer money for visa payment method
calculating payment fee for visa payment method
```

## Key Takeaways
- The Factory Design Pattern enables the creation of objects without exposing the instantiation logic to the client, making the code more modular and scalable.
- By isolating the payment processing logic into specific classes, we can easily add or modify payment methods without altering the client code `(PaymentProcessor)`.
- The use of polymorphism allows the `PaymentProcessor` to interact with all payment types through a unified interface `(PaymentMethod)`, simplifying the overall architecture.


## Usage
1. Clone the repository and navigate to the project directory.
2. Compile the project files.
3. Run the `Main` class to see the Factory Pattern in action, which processes a sample payment using the `PaymentProcessor`.
