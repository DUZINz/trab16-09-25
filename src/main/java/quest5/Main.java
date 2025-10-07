package quest5;

// Classe principal - demonstra o uso do padrão Prototype para criação de documentos personalizados.

public class Main {
    public static void main(String[] args) {
        // Criação de modelos originais
        Curriculo modeloCurriculo = new Curriculo("Azul", "Arial", "LogoEmpresa");
        PropostaComercial modeloProposta = new PropostaComercial("Verde", "Calibri", "LogoEmpresa");
        Relatorio modeloRelatorio = new Relatorio("Cinza", "Times New Roman", "LogoEmpresa");

        System.out.println("=== Modelos Originais ===");
        modeloCurriculo.exibirInformacoes();
        modeloProposta.exibirInformacoes();
        modeloRelatorio.exibirInformacoes();

        // Criação de cópias personalizadas (clone)
        Curriculo curriculoEduardo = (Curriculo) modeloCurriculo.clonar();
        curriculoEduardo.cor = "Vermelho";
        curriculoEduardo.logotipo = "LogoEduardo";

        PropostaComercial propostaMaria = (PropostaComercial) modeloProposta.clonar();
        propostaMaria.fonte = "Helvetica";
        propostaMaria.logotipo = "LogoMaria";

        Relatorio relatorioJoao = (Relatorio) modeloRelatorio.clonar();
        relatorioJoao.cor = "Preto";
        relatorioJoao.logotipo = "LogoJoao";

        System.out.println("\n=== Documentos Personalizados ===");
        curriculoEduardo.exibirInformacoes();
        propostaMaria.exibirInformacoes();
        relatorioJoao.exibirInformacoes();
    }
}
