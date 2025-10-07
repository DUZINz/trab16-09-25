package quest3;

// Classe principal - ponto de entrada do programa.
// Demonstra o uso do padrão Observer com múltiplos tópicos e leitores.
public class Main {
    public static void main(String[] args) {
        // Criação dos tópicos
        Topic politica = new Topic("Política");
        Topic esportes = new Topic("Esportes");
        Topic tecnologia = new Topic("Tecnologia");

        // Criação dos leitores
        Leitor leitor1 = new Leitor("Eduardo");
        Leitor leitor2 = new Leitor("Maria");
        Leitor leitor3 = new Leitor("João");

        // Inscrição dos leitores em tópicos
        politica.adicionarObservador(leitor1);
        politica.adicionarObservador(leitor2);

        esportes.adicionarObservador(leitor2);
        esportes.adicionarObservador(leitor3);

        tecnologia.adicionarObservador(leitor1);
        tecnologia.adicionarObservador(leitor3);

        // Publicação de notícias
        politica.publicarNoticia("Novo projeto de lei aprovado no congresso!");
        esportes.publicarNoticia("Brasil vence campeonato mundial de futebol!");
        tecnologia.publicarNoticia("Nova IA promete revolucionar o mercado!");
    }
}

