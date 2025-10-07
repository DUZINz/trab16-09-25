package quest2.payment;

/**
 * Implementação para pagamento via Boleto Bancário.
 */
public class BoletoProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.printf("Gerando boleto bancário no valor de R$ %.2f...%n", amount);
        System.out.println("✔ Boleto gerado e enviado por e-mail ao cliente.");
    }
}