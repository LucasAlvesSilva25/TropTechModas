package view;

import java.util.Scanner;

public class MenuView {
    private Scanner scanner = new Scanner(System.in);;

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
}
