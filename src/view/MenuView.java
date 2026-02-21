package view;

import java.util.Scanner;

public class MenuView {
    private Scanner scanner = new Scanner(System.in);
    ClientView clientview;
    VendaView vendaView;

    public MenuView(ClientView Clientview, VendaView VendaView){
        this.clientview = Clientview;
        this.vendaView = VendaView;
    }

    public void Menu() {
        System.out.println("\n=== MENU PRINCIPAL ===");
        System.out.println("1. Cadastrar cliente");
        System.out.println("2. Listar clientes");
        System.out.println("3. Buscar cliente");
        System.out.println("4. Remover cliente");
        System.out.println("5. Cadastrar Venda");
        System.out.println("6. Listar vendas");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }



    public String lerOpcao() {
        return scanner.nextLine();
    }

    public void escolherOpcao(){
        boolean executando = true;

        while (executando) {
            Menu(); // Menu completo

            String opcao = lerOpcao();

            switch (opcao) {
                case "1":
                    clientview.cadastrarClienteView();
                    break;
                case "2":
                    clientview.listarTodosClientes();
                    break;
                case "3":
                    clientview.buscarClientNome();
                    break;
                case "4":
                    clientview.removerCliente();
                    break;
                case "5":
                    vendaView.cadastrarVendaiew();
                    break;
                case "6":
                    // Não tá funcionando
                    vendaView.listarTodasVendas();
                    break;
                case "0":
                    System.out.println("Saindo...");
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

    }
}
