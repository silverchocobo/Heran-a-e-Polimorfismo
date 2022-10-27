public class Melancia extends Fruta {

    double precoAdicional;
    boolean epoca;

    public Melancia(String nome, double preco, double precoAdicional, boolean epoca) {
        super(nome, preco);
        this.precoAdicional = precoAdicional;
        this.epoca = epoca;
    }

    public double getPrecoAdicional() {
        return precoAdicional;
    }

    public void setPrecoAdicional(double precoAdicional) {
        this.precoAdicional = precoAdicional;
    }

    public boolean isEpoca() {
        return epoca;
    }

    public void setEpoca(boolean epoca) {
        this.epoca = epoca;
    }

    public void calculaPrecoFinal(){
        if (isEpoca()){
            System.out.println("O preço da melancia é: "+getPreco());
        }
        else{
            System.out.println("O preço da melancia é: "+ (getPreco()+precoAdicional));
        }
    }


}
