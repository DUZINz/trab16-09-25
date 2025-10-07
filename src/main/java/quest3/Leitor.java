package quest3;
// Classe concreta que representa um leitor inscrito em um ou mais tópicos.
// Implementa a interface Observer para receber notificações automaticamente.
public class Leitor implements Observer {
    private String nome;

    public Leitor(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String topico, String noticia) {
        System.out.println(nome + " recebeu uma nova notícia de " + topico + ": " + noticia);
    }
}
