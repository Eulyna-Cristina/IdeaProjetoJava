package model;

import java.util.ArrayList;

public class GerenciadordeMarketing {
    private ArrayList<Marketing> campanhas = new ArrayList<>();

    public void adicionarCampanha(Marketing campanha) {
        campanhas.add(campanha);
    }

    public void listarCampanhas() {
        System.out.println("=== Campanhas Disponíveis ===");
        for (Marketing c : campanhas) {
            c.exibirCampanha();
        }
    }

    public double aplicarDesconto(String nome, double preco) {
        return preco;
    }
}

