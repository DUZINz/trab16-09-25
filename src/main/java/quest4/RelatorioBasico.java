package quest4;

// Classe concreta que implementa o relatório básico.
// Contém apenas a lista simples de pedidos.
public class RelatorioBasico implements Relatorio {

    @Override
    public void gerar() {
        System.out.println("Relatório Básico: Lista de pedidos gerada.");
    }
}
