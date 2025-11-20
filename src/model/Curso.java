package model;

public class Curso {

    private String nome;
    private double preco;
    private Professor professor;
    private Aluno aluno;

    // Construtor
    public Curso(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // GETTERS E SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome() {
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

    // Método para associar professor
    public void associarProfessor() {
        Professor p = null;
        this.professor = p;
    }

    // Método para matricular aluno
    public void matricularAluno(Aluno a) {
        this.aluno = a;
    }
}