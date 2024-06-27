package CaixaEletronico;

import java.util.Scanner;

public class CaixaEletronico {
    private Conta conta;
    private Scanner scanner;

    public CaixaEletronico(Conta conta) {
        this.conta = conta;
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        while (true) {
            exibirMenu();
            int opcao = obterOpcao();

            switch (opcao) {
                case 1:
                    realizarDeposito();
                    break;
                case 2:
                    realizarSaque();
                    break;
                case 3:
                    conta.consultarSaldo();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private void exibirMenu() {
        System.out.println("\n=== Simulador de Caixa Eletrônico ===");
        System.out.println("1. Depositar");
        System.out.println("2. Sacar");
        System.out.println("3. Consultar Saldo");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private int obterOpcao() {
        while (!scanner.hasNextInt()) {
            System.out.print("Opção inválida. Escolha uma opção válida: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private void realizarDeposito() {
        System.out.print("Digite o valor do depósito: ");
        double valor = obterValor();
        conta.depositar(valor);
    }

    private void realizarSaque() {
        System.out.print("Digite o valor do saque: ");
        double valor = obterValor();
        conta.sacar(valor);
    }

    private double obterValor() {
        while (!scanner.hasNextDouble()) {
            System.out.print("Valor inválido. Digite um valor válido: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }
}