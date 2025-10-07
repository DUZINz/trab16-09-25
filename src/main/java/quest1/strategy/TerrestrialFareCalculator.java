package quest1.strategy;

import quest1.model.TransportRequest;

/**
 * TerrestrialFareCalculator
 *
 * Regra: tarifa = baseFee + (distanceKm * ratePerKm)
 */
public class TerrestrialFareCalculator implements FareCalculator {
    private final double ratePerKm;
    private final double baseFee;

    public TerrestrialFareCalculator(double ratePerKm, double baseFee) {
        this.ratePerKm = ratePerKm;
        this.baseFee = baseFee;
    }

    @Override
    public double calculate(TransportRequest request) {
        if (request.getDistanceKm() == null) {
            throw new IllegalArgumentException("Distância (km) é obrigatória para transporte terrestre.");
        }
        double distance = request.getDistanceKm();
        double total = baseFee + distance * ratePerKm;
        return round2(total);
    }

    @Override
    public String getName() {
        return "Terrestre";
    }

    private double round2(double v) {
        return Math.round(v * 100.0) / 100.0;
    }
}
