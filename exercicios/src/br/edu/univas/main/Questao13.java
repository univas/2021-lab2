package br.edu.univas.main;

import br.edu.univas.vo.Aluno;
import br.edu.univas.vo.Cliente;

import java.util.Scanner;

public class Questao13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        int indexArray = 0;
        Cliente[] clientes = new Cliente[100];

        do {
            printMenu();
            option = readIntegerValue(scanner);

            if (option == 1) {
                cadastrarCliente(scanner, clientes, indexArray);
                indexArray++;

            } else if (option == 2) {
                listar(clientes, indexArray);

            } else if (option == 3) {
                removerCliente(scanner, clientes, indexArray);

            } else if (option != 4) {
                System.out.println("Por favor digite a opção correta!");
            }
        } while (option != 4);

        scanner.close();
    }

    public static void cadastrarCliente(Scanner scanner, Cliente[] clientes, int indexArray) {
        System.out.println("Cadastro de Cliente");
        Cliente novoCliente = new Cliente();

        System.out.println("Por favor, digite o ID:");
        novoCliente.id = readIntegerValue(scanner);

        System.out.println("Por favor, digite o CPF:");
        novoCliente.cpf = readIntegerValue(scanner);

        System.out.println("Por favor, digite o nome:");
        novoCliente.nome = scanner.nextLine();

        System.out.println("Por favor, digite o e-mail:");
        novoCliente.email = scanner.nextLine();

        clientes[indexArray] = novoCliente;
    }

    public static void listar(Cliente[] clientes, int indexArray) {
        for (int i = 0; i < indexArray; i++) {
            Cliente cliente = clientes[i];
            if (cliente != null) {
                System.out.println("ID: " + cliente.id);
                System.out.println("CPF: " + cliente.cpf);
                System.out.println("Nome: " + cliente.nome);
                System.out.println("E-mail: " + cliente.email);
            }
        }
    }

    public static void removerCliente(Scanner scanner, Cliente[] xuxa, int indexArray) {
        System.out.println("Por favor digite o ID a ser removido:");
        int id = readIntegerValue(scanner);
        boolean clienteRemovido = false;

        for (int i = 0; i < indexArray; i++) {
            Cliente cliente = xuxa[i];
            if (cliente.id == id) {
                xuxa[i] = null;
                System.out.println("Cliente removido com sucesso!");
                clienteRemovido = true;
                break;
            }
        }

        if (!clienteRemovido) {
            System.out.println("Esse ID digitado não foi encontrado!");
        }
    }

    public static void printMenu() {
        System.out.println("1. Cadastrar cliente");
        System.out.println("2. Listar clientes cadastrados");
        System.out.println("3. Apagar cliente");
        System.out.println("4. Sair");
    }

    public static int readIntegerValue(Scanner scanner) {
        int aux = scanner.nextInt();
        scanner.nextLine();
        return aux;
    }
}
