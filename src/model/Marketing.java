package model;

public class Marketing {
    private String nomeCampanha;
    private double precoOriginal;
    private double precoPromocional;


    public Marketing(String nomeCampanha, double precoOriginal, double precoPromocional) {
        this.nomeCampanha = nomeCampanha;
        this.precoOriginal = precoOriginal;
        this.precoPromocional = precoPromocional;

    }

    public void exibirCampanha() {
        System.out.println("=== Campanha de Marketing ===");
        System.out.println("Nome: " + nomeCampanha);
        System.out.println("Preço original: R$ " + precoOriginal);
        System.out.println("Preço promocional: R$ " + precoPromocional);
        System.out.println("==============================");
    }

    // getters e setters (se precisar)
}
