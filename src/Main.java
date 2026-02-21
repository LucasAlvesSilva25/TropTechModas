import Repository.PessoaFisicaRepository;
import Repository.PessoaJuridicaRepository;
import Repository.VendasRepository;
import Service.ClienteService;
import Service.VendaService;
import view.ClientView;
import view.MenuView;
import view.VendaView;

import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PessoaFisicaRepository pessoaFisicaRepo = new PessoaFisicaRepository();
        PessoaJuridicaRepository pessoaJuridicaRepo = new PessoaJuridicaRepository();
        VendasRepository vendasRepository = new VendasRepository();

        ClienteService clienteService = new ClienteService(pessoaFisicaRepo, pessoaJuridicaRepo);
        VendaService vendaService = new VendaService(vendasRepository,clienteService);

        ClientView clientView = new ClientView(clienteService);
        VendaView vendaView = new VendaView(vendaService);

        MenuView menuView = new MenuView(clientView,vendaView);
        menuView.escolherOpcao();

    }
}
