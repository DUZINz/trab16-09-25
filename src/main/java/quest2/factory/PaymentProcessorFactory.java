package quest2.factory;

import quest2.payment.PaymentProcessor;
import quest2.payment.*;

/**
 * Fábrica responsável por criar dinamicamente o processador correto.
 *
 * O padrão Factory Method é aplicado aqui: ele centraliza a lógica
 * de criação dos objetos, mantendo o código cliente desacoplado.
 */
public class PaymentProcessorFactory {

    public static PaymentProcessor createProcessor(PaymentType type) {
        switch (type) {
            case CREDIT_CARD:
                return new CreditCardProcessor();
            case BOLETO:
                return new BoletoProcessor();
            case PIX:
                return new PixProcessor();
            default:
                throw new IllegalArgumentException("Tipo de pagamento inválido: " + type);
        }
    }
}