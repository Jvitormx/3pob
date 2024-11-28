package view;

import controller.FuncionarioController;
import model.*;

import java.util.Scanner;

public class FuncionarioView {
    private FuncionarioController controller = new FuncionarioController();
    private Scanner scanner = new Scanner(System.in);

    public void menu() {
        while (true) {
            System.out.println("\n1. Adicionar Funcionário");
            System.out.println("2. Listar Funcionários");
            System.out.println("3. Atualizar Funcionário");
            System.out.println("4. Excluir Funcionário");
            System.out.println("5. Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> adicionarFuncionario();
                case 2 -> listarFuncionarios();
                case 3 -> atualizarFuncionario();
                case 4 -> excluirFuncionario();
                case 5 -> {
                    System.out.println("Saindo...");
                    return;
                }
                default -> System.out.println("Opção inválida!");
            }
        }
    }

    private void adicionarFuncionario() {
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Salário: ");
        double salario = scanner.nextDouble();

        System.out.println("Tipo de Funcionário:");
        System.out.println("1. Desenvolvedor");
        System.out.println("2. Gerente");
        System.out.println("3. Treinador");
        System.out.println("4. Gerente Desenvolvedor");
        int tipo = scanner.nextInt();

        Funcionario funcionario = switch (tipo) {
            case 1 -> new Desenvolvedor(id, nome, salario);
            case 2 -> new Gerente(id, nome, salario);
            case 3 -> new Treinador(id, nome, salario);
            case 4 -> new GerenteDesenvolvedor(id, nome, salario);
            default -> null;
        };

        if (funcionario != null) {
            controller.adicionarFuncionario(funcionario);
            System.out.println("Funcionário adicionado com sucesso!");
        } else {
            System.out.println("Tipo inválido!");
        }
    }

    private void listarFuncionarios() {
        System.out.println("Funcionários:");
        for (Funcionario f : controller.listarFuncionarios()) {
            System.out.println(f.mostrarDetalhes());
        }
    }

    private void atualizarFuncionario() {
        System.out.print("ID do Funcionário: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Novo Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Novo Salário: ");
        double salario = scanner.nextDouble();

        controller.atualizarFuncionario(id, nome, salario);
        System.out.println("Funcionário atualizado com sucesso!");
    }

    private void excluirFuncionario() {
        System.out.print("ID do Funcionário: ");
        int id = scanner.nextInt();
        controller.excluirFuncionario(id);
        System.out.println("Funcionário excluído com sucesso!");
    }
}
