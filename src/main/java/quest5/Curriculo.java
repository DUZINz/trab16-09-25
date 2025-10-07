package quest5;

// Classe concreta que representa um modelo de currículo.
// Herda de ModeloDocumento e pode ser personalizada com informações específicas.
public class Curriculo extends ModeloDocumento {
    public Curriculo(String cor, String fonte, String logotipo) {
        super("Currículo", cor, fonte, logotipo);
    }
}
