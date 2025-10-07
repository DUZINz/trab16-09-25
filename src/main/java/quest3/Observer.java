package quest3;

// Interface Observer - define o contrato que todos os observadores devem seguir.
// Cada observador precisa implementar o método 'atualizar' para reagir a notificações.
public interface Observer {
    void atualizar(String topico, String noticia);
}
