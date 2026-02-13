package view;

import Service.ClienteService;

import java.util.List;
import java.util.Scanner;

public class ClientView {
    private Scanner scanner;
    private ClienteService clienteService;

    public ClientView() {
        this.scanner = new Scanner(System.in);
        this.clienteService = new ClienteService();
    }

    // Metodo para coletar dados do cliente
    public void cadastrarClienteView() {
        System.out.println("\n=== CADASTRO DE CLIENTE ===");

        System.out.print("Tipo (PF/PJ): ");
        String tipo = scanner.nextLine();

        System.out.print("Nome/Razão Social: ");
        String nome = scanner.nextLine();

        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        System.out.print("CPF/CNPJ: ");
        String documento = scanner.nextLine();

        System.out.println("\n--- ENDEREÇO ---");
        System.out.print("Rua: ");
        String rua = scanner.nextLine();

        System.out.print("Número: ");
        String numero = scanner.nextLine();

        System.out.print("Cidade: ");
        String cidade = scanner.nextLine();

        System.out.print("Estado: ");
        String estado = scanner.nextLine();

        System.out.print("País: ");
        String pais = scanner.nextLine();

        // Chama o service
        try {
            String resultado = clienteService.cadastrarCliente(
                    tipo, nome, telefone, documento,
                    rua, numero, cidade, estado, pais
            );
            System.out.println("\n✅ " + resultado);
        } catch (Exception e) {
            System.out.println("\n❌ Erro: " + e.getMessage());
        }
    }

    public void listarTodosClientes(){
        System.out.println("=== TODOS CLIENTES ===");

        List<String> clientes = clienteService.listarTodosClientes();

        for (String cliente : clientes) {
            System.out.println(cliente);
        }

    }

    // Agora precisa implementar a busca pelo nome.

    public void buscarClientNome(){
        System.out.print("Tipo (PF/PJ): ");
        String tipo = scanner.nextLine();

        System.out.print("Nome/Razão Social: ");
        String nome = scanner.nextLine();

        String resultado = clienteService.buscarPorNome(tipo,nome);
        System.out.println(resultado);
    }

    public void removerCliente(){
        System.out.print("Tipo (PF/PJ): ");
        String tipo = scanner.nextLine();
        System.out.print("CPF/CNPJ: ");
        String documento = scanner.nextLine();

        String resultado = clienteService.removerCliente(tipo,documento);
        System.out.println(resultado);
    }

    // Fecha o scanner quando não for mais usado
    public void fechar() {
        scanner.close();
    }
}