import Service.ClienteService;
import view.ClientView;
import view.MenuView;
import view.VendaView;

import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MenuView menuView = new MenuView();
        ClientView clientview = new ClientView();
        VendaView vendaView = new VendaView();

        boolean executando = true;

        while (executando) {
            menuView.Menu(); // Menu completo

            String opcao = menuView.lerOpcao();

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

        clientview.fechar();
    }
    }
