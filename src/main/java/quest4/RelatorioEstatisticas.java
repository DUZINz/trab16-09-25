package quest4;

// Decorador concreto que adiciona estatísticas de faturamento ao relatório.
public class RelatorioEstatisticas extends RelatorioDecorator {

    public RelatorioEstatisticas(Relatorio relatorio) {
        super(relatorio);
    }

    @Override
    public void gerar() {
        super.gerar();
        adicionarEstatisticas();
    }

    private void adicionarEstatisticas() {
        System.out.println("-> Estatísticas adicionadas: Total de vendas, média de valor, produtos mais vendidos.");
    }
}

