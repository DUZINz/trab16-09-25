package quest4;

// Decorador concreto que adiciona gráficos de desempenho ao relatório.
public class RelatorioGraficos extends RelatorioDecorator {

    public RelatorioGraficos(Relatorio relatorio) {
        super(relatorio);
    }

    @Override
    public void gerar() {
        super.gerar();
        adicionarGraficos();
    }

    private void adicionarGraficos() {
        System.out.println("-> Gráficos adicionados: Vendas por mês, desempenho por categoria.");
    }
}
