package quest1;

import quest1.model.TransportRequest;
import quest1.strategy.AerialFareCalculator;
import quest1.strategy.FareCalculator;
import quest1.strategy.MaritimeFareCalculator;
import quest1.strategy.TerrestrialFareCalculator;

/**
 * Classe principal de demonstração do padrão Strategy
 */
public class Main {
    public static void main(String[] args) {
        // Criar requests
        TransportRequest terrestreReq = new TransportRequest();
        terrestreReq.setDistanceKm(350.0);
        terrestreReq.setDeclaredValue(1200.00);

        TransportRequest aereoReq = new TransportRequest();
        aereoReq.setWeightKg(12.5);
        aereoReq.setDeclaredValue(800.00);

        TransportRequest maritimoReq = new TransportRequest();
        maritimoReq.setVolumeCbm(3.2);
        maritimoReq.setDistanceKm(1200.0);

        // Estratégias
        FareCalculator terrestreCalc = new TerrestrialFareCalculator(1.10, 20.0);
        FareCalculator aereoCalc = new AerialFareCalculator(8.50, 0.02, 50.0);
        FareCalculator maritimoCalc = new MaritimeFareCalculator(100.0, 0.05, 30.0);

        System.out.printf("Terrestre: R$ %.2f%n", terrestreCalc.calculate(terrestreReq));
        System.out.printf("Aéreo:     R$ %.2f%n", aereoCalc.calculate(aereoReq));
        System.out.printf("Marítimo:  R$ %.2f%n", maritimoCalc.calculate(maritimoReq));
    }
}
