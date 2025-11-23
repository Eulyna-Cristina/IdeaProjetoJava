package model;

public class NotaFiscal {

    private int numero;
    private Venda venda;

    public NotaFiscal(int numero, Venda venda) {
        this.numero = numero;
        this.venda = venda;
    }

    public void emitir() {
        System.out.println("---- Nota Fiscal ----");
        System.out.println("Número: " + numero);
        System.out.println("Aluno: " + venda.getAluno().getNome());
        System.out.println("Curso: " + venda.getCurso().getNome());
        System.out.println("Valor: R$ " + venda.getPreco());
        System.out.println("Forma de pagamento:" + venda.getFormadePagamento());
    }

    public int getNumero() {
        return numero;
    }

    public Venda getVenda() {
        return venda;
    }
}
