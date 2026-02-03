import Service.ClienteService;
import view.ClientView;
import view.MenuView;

import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MenuView menuView = new MenuView();
        ClientView clientview = new ClientView();

        boolean executando = true;

        while (executando) {
            menuView.Menu(); // Menu completo

            String opcao = menuView.lerOpcao();

            switch (opcao) {
                case "1":
                    clientview.cadastrarClienteView();
                    break;
                case "2":
                    // view.listarClientesView();
                    break;
                case "3":
                    // view.buscarClienteView();
                    break;
                case "4":
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
