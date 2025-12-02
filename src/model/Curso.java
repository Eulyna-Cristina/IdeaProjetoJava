package model;

public class Curso {

    private String nome;
    private double preco;
    private Professor professor;
    private Aluno aluno;
    private int vagas;


    public Curso(String nome, double preco, int vagas) {
        this.nome = nome;
        this.preco = preco;
        this.vagas = vagas;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public int getVagas() {
        return vagas;
    }

    public void associarProfessor(Professor professor) {
        this.professor = professor;
    }

    public void matricularAluno(Aluno a) {
        if (vagas > 0) {
            this.aluno = a;
            this.vagas--;
            System.out.println("Aluno matriculado! Vagas restantes: " + vagas);
        } else {
            System.out.println("Não há vagas disponíveis.");
        }
    }

    public void gerarRelatorio() {
        System.out.println("====== RELATÓRIO DO CURSO ======");
        System.out.println("Nome do curso: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Professor: " + (professor != null ? professor.getNome() : "Nenhum professor associado"));
        System.out.println("Aluno matriculado: " + (aluno != null ? aluno.getNome() : "Nenhum aluno matriculado"));
        System.out.println("Vagas restantes: " + vagas);
    }
}




