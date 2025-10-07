package quest2.payment;

/**
 * Interface comum para todos os processadores de pagamento.
 * Define o contrato que cada meio de pagamento deve seguir.
 */
public interface PaymentProcessor {
    void processPayment(double amount);
}