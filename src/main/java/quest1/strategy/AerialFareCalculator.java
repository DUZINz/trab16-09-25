package quest1.strategy;

import quest1.model.TransportRequest;

/**
 * AerialFareCalculator
 *
 * Regra: tarifa = baseFee + (weightKg * ratePerKg) + insurancePercent * declaredValue
 */
public class AerialFareCalculator implements FareCalculator {
    private final double ratePerKg;
    private final double insurancePercent;
    private final double baseFee;

    public AerialFareCalculator(double ratePerKg, double insurancePercent, double baseFee) {
        this.ratePerKg = ratePerKg;
        this.insurancePercent = insurancePercent;
        this.baseFee = baseFee;
    }

    @Override
    public double calculate(TransportRequest request) {
        if (request.getWeightKg() == null) {
            throw new IllegalArgumentException("Peso (kg) é obrigatório para transporte aéreo.");
        }
        double weight = request.getWeightKg();
        double declared = request.getDeclaredValue() == null ? 0.0 : request.getDeclaredValue();
        double total = baseFee + weight * ratePerKg + declared * insurancePercent;
        return round2(total);
    }

    @Override
    public String getName() {
        return "Aéreo";
    }

    private double round2(double v) {
        return Math.round(v * 100.0) / 100.0;
    }
}
