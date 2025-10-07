package quest1.strategy;

import quest1.model.TransportRequest;

/**
 * MaritimeFareCalculator
 *
 * Regra (exemplo): tarifa = baseFee + (volumeCbm * ratePerCbm)
 * + fuelSurchargePercent * (volumeCbm * ratePerCbm)
 */
public class MaritimeFareCalculator implements FareCalculator {
    private final double ratePerCbm;
    private final double fuelSurchargePercent;
    private final double baseFee;

    public MaritimeFareCalculator(double ratePerCbm, double fuelSurchargePercent, double baseFee) {
        this.ratePerCbm = ratePerCbm;
        this.fuelSurchargePercent = fuelSurchargePercent;
        this.baseFee = baseFee;
    }

    @Override
    public double calculate(TransportRequest request) {
        Double vol = request.getVolumeCbm();
        double volumeUsed;

        if (vol != null) {
            volumeUsed = vol;
        } else if (request.getWeightKg() != null) {
            volumeUsed = request.getWeightKg() / 250.0;
        } else {
            throw new IllegalArgumentException("Volume (m^3) ou peso (kg) necessário para transporte marítimo.");
        }

        double baseCharge = volumeUsed * ratePerCbm;
        double surcharge = baseCharge * fuelSurchargePercent;
        double total = baseFee + baseCharge + surcharge;
        return round2(total);
    }

    @Override
    public String getName() {
        return "Marítimo";
    }

    private double round2(double v) {
        return Math.round(v * 100.0) / 100.0;
    }
}
