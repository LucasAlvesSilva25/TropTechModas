package Repository;

import Model.Venda;

import java.util.ArrayList;
import java.util.List;

public class VendasRepository {
    List<Venda> listaVendas;

    public VendasRepository (){

        listaVendas = new ArrayList<>();
    }

    public void adicionar(Venda novaVenda){
        listaVendas.add(novaVenda);
    }

    public List<Venda> listarTodasVendas() {
        return new ArrayList<>(listaVendas);
    }
}
