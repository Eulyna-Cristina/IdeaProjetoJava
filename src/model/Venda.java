package model;

public class Venda {

    private int id;
    private Aluno aluno;
    private Curso curso;
    private double valor;
    private String formaPg;

    
    public Venda(int id, Aluno aluno, Curso curso, String formapg) {
        this.id = id;
        this.aluno = aluno;
        this.curso = curso;
        this.valor = curso.getPreco();
        this.formaPg = formapg;
    }

    public int getId() {
        return id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public double getPreco() {
        return valor;
    }

    public String getFormadePagamento() {
        return formaPg;





    }
}
