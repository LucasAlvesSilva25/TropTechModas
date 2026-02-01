import Service.ClienteService;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tipo (PF/PJ): ");
        String tipo = scanner.nextLine();

        System.out.print("Nome/Razão Social: ");
        String nome = scanner.nextLine();

        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        System.out.print("CPF/CNPJ: ");
        String documento = scanner.nextLine();

        System.out.print("Rua: ");
        String rua = scanner.nextLine();

        System.out.print("Numero: ");
        String numero = scanner.nextLine();

        System.out.print("Cidade: ");
        String cidade = scanner.nextLine();

        System.out.print("Estado: ");
        String estado = scanner.nextLine();

        System.out.print("País: ");
        String pais = scanner.nextLine();



        ClienteService clienteService = new ClienteService();
        String cadastroClient = clienteService.cadastrarCliente(tipo,nome,telefone,documento,rua,numero,cidade,estado,pais);

        System.out.println("Retorno: " + cadastroClient);

    }
}