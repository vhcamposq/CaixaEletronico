package CaixaEletronico;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta("João Silva", 1000.00);
        CaixaEletronico caixaEletronico = new CaixaEletronico(conta);
        caixaEletronico.iniciar();
    }
}
