package controle;

import dominio.Paciente;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class exerPacientesControle {

    private static final String ARQUIVO_CSV = "pacientes.txt";
    private ArrayList<Paciente> pacientes;

    public exerPacientesControle() {
        this.pacientes = new ArrayList<>();
        carregarPacientesDoArquivo();
    }

    public void adicionarPaciente(int numero, double peso, double altura) {
        Paciente paciente = new Paciente(numero, peso, altura);
        pacientes.add(paciente);
        salvarPacientesNoArquivo();
        System.out.println("Paciente adicionado com sucesso!");
    }

    public void listarPacientes() {
        if (pacientes.isEmpty()) {
            System.out.println("Nenhum paciente cadastrado.");
        } else {
            System.out.println("Lista de pacientes:");
            for (Paciente paciente : pacientes) {
                paciente.listarPaciente();
            }
        }
    }

    public void alterarPaciente(int numero) {
        Paciente paciente = buscarPacientePorNumero(numero);
        if (paciente != null) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Novo peso do paciente: ");
            double novoPeso = scanner.nextDouble();
            System.out.print("Nova altura do paciente: ");
            double novaAltura = scanner.nextDouble();

            paciente.setPeso(novoPeso);
            paciente.setAltura(novaAltura);
            salvarPacientesNoArquivo();
            System.out.println("Paciente alterado com sucesso!");
        } else {
            System.out.println("Paciente com numero " + numero + " não encontrado.");
        }
    }

    public void excluirPaciente(int numero) {
        Paciente paciente = buscarPacientePorNumero(numero);
        if (paciente != null) {
            pacientes.remove(paciente);
            salvarPacientesNoArquivo();
            System.out.println("Paciente excluído com sucesso!");
        } else {
            System.out.println("Paciente com numero " + numero + " não encontrado.");
        }
    }

    private Paciente buscarPacientePorNumero(int numero) {
        for (Paciente paciente : pacientes) {
            if (paciente.getNumero() == numero) {
                return paciente;
            }
        }
        return null;
    }

    private void carregarPacientesDoArquivo() {
        try (BufferedReader br = new BufferedReader(new FileReader(ARQUIVO_CSV))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");
                int numero = Integer.parseInt(dados[0]);
                double peso = Double.parseDouble(dados[1]);
                double altura = Double.parseDouble(dados[2]);
                pacientes.add(new Paciente(numero, peso, altura));
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar pacientes do arquivo: " + e.getMessage());
        }
    }

    private void salvarPacientesNoArquivo() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARQUIVO_CSV))) {
            for (Paciente paciente : pacientes) {
                bw.write(paciente.getNumero() + "," + paciente.getPeso() + "," + paciente.getAltura());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar pacientes no arquivo: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        exerPacientesControle controle = new exerPacientesControle();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Paciente");
            System.out.println("2. Listar Pacientes");
            System.out.println("3. Alterar Pacientes");
            System.out.println("4. Excluir Paciente");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Numero do Paciente: ");
                    int numero = scanner.nextInt();
                    System.out.print("Peso do Paciente: ");
                    double peso = scanner.nextDouble();
                    System.out.print("Altura do Paciente: ");
                    double altura = scanner.nextDouble();
                    controle.adicionarPaciente(numero, peso, altura);
                    break;
                case 2:
                    controle.listarPacientes();
                    break;
                case 3:
                    System.out.print("Numero do Paciente a alterar: ");
                    int numeroAlterar = scanner.nextInt();
                    controle.alterarPaciente(numeroAlterar);
                    break;
                case 4:
                    System.out.print("Numero do Paciente a excluir: ");
                    int numeroExcluir = scanner.nextInt();
                    controle.excluirPaciente(numeroExcluir);
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
