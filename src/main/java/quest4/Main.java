package quest4;

// Classe principal - demonstra o uso do padrão Decorator para adicionar funcionalidades dinamicamente.

public class Main {
    public static void main(String[] args) {
        // Relatório básico
        Relatorio relatorio = new RelatorioBasico();
        System.out.println("\n=== Relatório Básico ===");
        relatorio.gerar();

        // Relatório com estatísticas
        Relatorio relatorioComEstatisticas = new RelatorioEstatisticas(new RelatorioBasico());
        System.out.println("\n=== Relatório com Estatísticas ===");
        relatorioComEstatisticas.gerar();

        // Relatório com estatísticas + gráficos
        Relatorio relatorioComGraficos = new RelatorioGraficos(relatorioComEstatisticas);
        System.out.println("\n=== Relatório com Estatísticas e Gráficos ===");
        relatorioComGraficos.gerar();

        // Relatório completo: básico + estatísticas + gráficos + exportação PDF
        Relatorio relatorioCompleto = new RelatorioPDF(new RelatorioGraficos(new RelatorioEstatisticas(new RelatorioBasico())));
        System.out.println("\n=== Relatório Completo ===");
        relatorioCompleto.gerar();
    }
}
