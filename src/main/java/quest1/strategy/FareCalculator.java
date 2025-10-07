package quest1.strategy;

import quest1.model.TransportRequest;

/**
 * Interface do Strategy: qualquer cálculo de tarifa implementa este contrato.
 */
public interface FareCalculator {
    double calculate(TransportRequest request);

    default String getName() {
        return this.getClass().getSimpleName();
    }
}
