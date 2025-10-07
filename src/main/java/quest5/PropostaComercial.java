package quest5;

// Classe concreta que representa uma proposta comercial.
// Permite clonar e personalizar para cada cliente.
public class PropostaComercial extends ModeloDocumento {
    public PropostaComercial(String cor, String fonte, String logotipo) {
        super("Proposta Comercial", cor, fonte, logotipo);
    }
}

