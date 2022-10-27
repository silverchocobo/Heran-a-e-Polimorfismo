public class Programador extends Pessoa{

    String linguagem;
    public Programador(String nome, int idade, String linguagem) {
        super(nome, idade);
        this.linguagem = linguagem;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public void imprimeDados(){
        System.out.println(" Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Linguagem " + linguagem);
    }
}
