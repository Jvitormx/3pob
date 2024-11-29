package controller;

import model.*;
import java.io.*;
import java.util.*;

public class FuncionarioController {
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private final String FILE_PATH = "funcionarios.txt";

    public FuncionarioController() {
        carregarDados();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
        salvarDados();
    }

    public List<Funcionario> listarFuncionarios() {
        return funcionarios;
    }

    public void atualizarFuncionario(int id, String nome, double salario) {
        for (Funcionario f : funcionarios) {
            if (f.getId() == id) {
                f.setNome(nome);
                f.setSalario(salario);
                salvarDados();
                return;
            }
        }
    }

    public void excluirFuncionario(int id) {
        funcionarios.removeIf(f -> f.getId() == id);
        salvarDados();
    }

    private void salvarDados() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Funcionario f : funcionarios) {
                String tipo = f.getClass().getSimpleName();
                writer.write(f.getId() + ";" + tipo + ";" + f.getNome() + ";" + f.getSalario());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Erro ao salvar os dados: " + e.getMessage());
        }
    }

    private void carregarDados() {
        File file = new File(FILE_PATH);
        if (!file.exists()) return;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                int id = Integer.parseInt(parts[0]);
                String tipo = parts[1];
                String nome = parts[2];
                double salario = Double.parseDouble(parts[3]);

                switch (tipo) {
                    case "Desenvolvedor":
                        funcionarios.add(new Desenvolvedor(id, nome, salario));
                        break;
                    case "Gerente":
                        funcionarios.add(new Gerente(id, nome, salario));
                        break;
                    case "Treinador":
                        funcionarios.add(new Treinador(id, nome, salario));
                        break;
                    case "GerenteDesenvolvedor":
                        funcionarios.add(new GerenteDesenvolvedor(id, nome, salario));
                        break;
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao carregar os dados: " + e.getMessage());
        }
    }
}
