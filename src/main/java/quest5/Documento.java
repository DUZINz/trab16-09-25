package quest5;

// Interface Prototype - define o contrato para clonagem de documentos.
// Cada documento deve implementar o método 'clonar' para gerar uma cópia idêntica.
public interface Documento extends Cloneable {
    Documento clonar();
    void exibirInformacoes();
}

