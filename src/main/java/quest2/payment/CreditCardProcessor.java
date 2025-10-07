package quest2.payment;

/**
 * Implementação para pagamento com Cartão de Crédito.
 */
public class CreditCardProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.printf("Processando pagamento de R$ %.2f via Cartão de Crédito...%n", amount);
        System.out.println("✔ Autorização obtida com sucesso!");
    }
}