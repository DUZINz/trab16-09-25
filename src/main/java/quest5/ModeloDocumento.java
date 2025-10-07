package quest5;

// Classe base abstrata que implementa a interface Documento.
// Contém atributos comuns a todos os modelos (cores, fonte e logotipo).
public abstract class ModeloDocumento implements Documento {
    protected String nomeModelo;
    protected String cor;
    protected String fonte;
    protected String logotipo;

    public ModeloDocumento(String nomeModelo, String cor, String fonte, String logotipo) {
        this.nomeModelo = nomeModelo;
        this.cor = cor;
        this.fonte = fonte;
        this.logotipo = logotipo;
    }

    @Override
    public Documento clonar() {
        try {
            return (Documento) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Erro ao clonar o documento!", e);
        }
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Modelo: " + nomeModelo +
                " | Cor: " + cor +
                " | Fonte: " + fonte +
                " | Logotipo: " + logotipo);
    }
}
