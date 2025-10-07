package quest2.payment;

/**
 * Implementação para pagamento via PIX.
 */
public class PixProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.printf("Processando pagamento de R$ %.2f via PIX...%n", amount);
        System.out.println("✔ Transferência instantânea confirmada!");
    }
}