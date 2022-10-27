public class Banana extends Fruta {
    String tipo;

    public Banana(String nome, double preco, String tipo) {
        super(nome, preco);
        this.tipo = tipo;

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
