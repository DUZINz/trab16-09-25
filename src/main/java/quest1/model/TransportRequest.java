package quest1.model;

/**
 * TransportRequest
 *
 * Classe de parâmetro unificada que contém todos os dados
 * que algum tipo de transporte pode precisar.
 */
public class TransportRequest {
    private Double distanceKm;   // distância em km
    private Double weightKg;     // peso em kg
    private Double volumeCbm;    // volume em m^3
    private Double declaredValue;// valor declarado da carga

    public Double getDistanceKm() { return distanceKm; }
    public void setDistanceKm(Double distanceKm) { this.distanceKm = distanceKm; }
    public Double getWeightKg() { return weightKg; }
    public void setWeightKg(Double weightKg) { this.weightKg = weightKg; }
    public Double getVolumeCbm() { return volumeCbm; }
    public void setVolumeCbm(Double volumeCbm) { this.volumeCbm = volumeCbm; }
    public Double getDeclaredValue() { return declaredValue; }
    public void setDeclaredValue(Double declaredValue) { this.declaredValue = declaredValue; }
}
