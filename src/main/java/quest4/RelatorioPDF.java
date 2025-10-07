package quest4;

// Decorador concreto que adiciona a funcionalidade de exportar o relatório em PDF.
public class RelatorioPDF extends RelatorioDecorator {

    public RelatorioPDF(Relatorio relatorio) {
        super(relatorio);
    }

    @Override
    public void gerar() {
        super.gerar();
        exportarPDF();
    }

    private void exportarPDF() {
        System.out.println("-> Exportação em PDF concluída.");
    }
}

