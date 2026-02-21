package view;

import Service.VendaService;

import java.util.List;
import java.util.Scanner;

public class VendaView {
    private Scanner scanner;
    private VendaService vendaService;

    public VendaView(VendaService VendaService) {
        this.scanner = new Scanner(System.in);
        this.vendaService = VendaService;
    }

    // Metodo para coletar dados do cliente
    public void cadastrarVendaiew() {
        System.out.println("\n=== CADASTRO DE VENDA ===");

        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();

        System.out.print("Valor: ");
        double valor = Double.parseDouble(scanner.nextLine());

        System.out.println("\n--- CLIENTE ---");

        System.out.print("Tipo (PF/PJ): ");
        String tipo = scanner.nextLine();

        System.out.print("CPF/CNPJ: ");
        String documento = scanner.nextLine();

        // Chama o service
        try {
            String resultado = vendaService.cadastrarVenda(descricao, valor, tipo, documento);
            System.out.println("\n✅ " + resultado);
        } catch (Exception e) {
            System.out.println("\n❌ Erro: " + e.getMessage());
        }
    }

    public void listarTodasVendas() {
        System.out.println("=== TODAS VENDAS ===");

        List<String> vendas = vendaService.listarTodasVendas();

        for (String venda : vendas) {
            System.out.println(venda);
        }

    }
}
