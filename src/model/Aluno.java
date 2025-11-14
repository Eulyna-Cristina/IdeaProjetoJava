package model;

public class Aluno extends Pessoa {
    private double nota1,nota2, nota3, media;

    public Aluno (String nome, int idade){
        super(idade, nome);
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public void calcularMedia(){
            media=(nota1+nota2+nota3)/3;
        }

    @Override
    public void quemSouEu() {

    }

    @Override
    public void minhaAtividade() {

    }
}

