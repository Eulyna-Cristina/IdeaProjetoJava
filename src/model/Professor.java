package model;

import enums.Classificacao;

public class Professor extends Pessoa {


    private int salario;
    private Classificacao c;
    public Professor(int salario, int idade, String nome) {

        super(idade, nome);
        this.salario = salario;
    }

    public Professor() {
        super();
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public void quemSouEu() {

    }

    @Override
    public void minhaAtividade() {

    }

    @Override
    public String toString() {
        return super.toString() + "model.Professor{" +
                "salario=" + salario +
                '}';
    }

    public Classificacao getC() {
        return c;
    }

    public void setC(Classificacao c) {
        this.c = c;
    }
}



