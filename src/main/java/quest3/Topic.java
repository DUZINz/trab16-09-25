package quest3;

// Classe Subject (Sujeito) do padrão Observer.
// Cada tópico mantém uma lista de observadores (leitores) e notifica todos
// quando uma nova notícia é publicada.
import java.util.ArrayList;
import java.util.List;

public class Topic {
    private String nome;
    private List<Observer> observers = new ArrayList<>();

    public Topic(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    // Adiciona um observador (leitor) à lista de inscritos
    public void adicionarObservador(Observer observer) {
        observers.add(observer);
    }

    // Remove um observador da lista
    public void removerObservador(Observer observer) {
        observers.remove(observer);
    }

    // Publica uma nova notícia e notifica todos os inscritos
    public void publicarNoticia(String noticia) {
        System.out.println("\n[TOPICO: " + nome + "] Nova notícia publicada: " + noticia);
        for (Observer observer : observers) {
            observer.atualizar(nome, noticia);
        }
    }
}

