package quest4;

// Classe abstrata Decorator - implementa a interface Relatorio
// e mantém uma referência para outro Relatorio (composição).
// Serve de base para decoradores concretos que adicionam novas funcionalidades.
public abstract class RelatorioDecorator implements Relatorio {
    protected Relatorio relatorioDecorado;

    public RelatorioDecorator(Relatorio relatorio) {
        this.relatorioDecorado = relatorio;
    }

    @Override
    public void gerar() {
        relatorioDecorado.gerar();
    }
}

