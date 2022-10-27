public class Teste {

    public static void main(String[] args) {
        Banana banana1 = new Banana("caturra",2,"organica");
        Melancia melancia1 = new Melancia("melancia",7,3,false);
        Programador programador1 = new Programador("Pedro",24,"java");
        Aluno aluno1 = new Aluno("João",20,8);

        melancia1.calculaPrecoFinal();
        programador1.imprimeDados();
        aluno1.imprimeDados();

    }


}
