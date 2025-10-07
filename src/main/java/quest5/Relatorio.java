package quest5;

// Classe concreta que representa um modelo de relatório.
// Também pode ser clonada e adaptada rapidamente.
public class Relatorio extends ModeloDocumento {
    public Relatorio(String cor, String fonte, String logotipo) {
        super("Relatório", cor, fonte, logotipo);
    }
}

