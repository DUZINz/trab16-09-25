package quest2;

import quest2.factory.PaymentProcessorFactory;
import quest2.factory.PaymentType;
import quest2.payment.PaymentProcessor;

/**
 * Demonstração do uso do padrão Factory Method.
 */
public class Main {
    public static void main(String[] args) {
        double amount = 250.75;

        // Exemplo: configurando dinamicamente o tipo de pagamento
        PaymentType selected = PaymentType.PIX; // pode vir de um arquivo, banco, config, etc.

        // A fábrica cria a instância correta, sem o main conhecer os detalhes
        PaymentProcessor processor = PaymentProcessorFactory.createProcessor(selected);

        System.out.println("=== Sistema de Pagamentos ===");
        processor.processPayment(amount);
    }
}