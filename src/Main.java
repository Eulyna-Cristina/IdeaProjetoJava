import java.io.PrintStream;
import java.util.Scanner;
import model.Aluno;
import model.Curso;
import model.Professor;

public class Main {
    private static Object ProfessorCotroller;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        Curso ingles = new Curso("Inglês", 250.00);
        Curso espanhol = new Curso("Espanhol", 220.00);

        // Cadastro Aluno
        Aluno a = new Aluno();
        System.out.print("Aluno qual é o seu nome? ");
        a.setNome(sc2.nextLine());
        System.out.print("Sua idade: ");
        a.setIdade(sc.nextInt());
        System.out.print("Sua matrícula: ");
        a.setMatricula(sc.nextInt());
        System.out.println("Escolha o curso:");
        System.out.println("1 - Inglês");
        System.out.println("2 - Espanhol");
        System.out.print("Opção: ");

        int opcao = sc.nextInt();
        Curso cursoEscolhido = null;

        if (opcao == 1) {
            cursoEscolhido = ingles;
        } else if (opcao == 2) {
            cursoEscolhido = espanhol;
        } else {
            System.out.println("Opção inválida!");
            return;
        }
        a.setCurso(sc.nextLine());
        System.out.println("Valor do curso:");
        a.setCurso(String.valueOf(sc.nextDouble()));
        System.out.println("Escolha a forma de pagamento:");
        System.out.println("1 - Pix");
        System.out.println("2 - Cartão de Crédito");
        System.out.println("3 - Boleto");

        int pg = sc.nextInt();
        String formaPg = "";

        switch (pg) {
            case 1: formaPg = "Pix"; break;
            case 2: formaPg = "Cartão de Crédito"; break;
            case 3: formaPg = "Boleto"; break;
        }


        cursoEscolhido.matricularAluno(a);
        a.setCurso(cursoEscolhido.getNome());

        System.out.println("Aluno matriculado no curso: " + cursoEscolhido.getNome());


        // Cadastro professor
        Professor professor = new Professor();
        System.out.print("Qual o nome do professor: ");
        professor.setNome(sc2.nextLine());
        System.out.print("Qual a idade do professor: ");
        professor.setIdade(sc.nextInt());
        System.out.print("Qual o valor do salário do professor: ");
        professor.setSalario((int) sc.nextDouble());
        professor.calcularSalario();
        System.out.println("O salário do professor é igual a: " + professor.getSalario());
        System.out.println("Qual curso você ministra:");
        System.out.println("1 - Inglês");
        System.out.println("2 - Espanhol");
        System.out.print("Opção: ");
        int opcoes = sc.nextInt();
        Curso cursoSelecionado = null;

        if (opcao == 1) {
            cursoSelecionado = ingles;
        } else if (opcao == 2) {
            cursoSelecionado = espanhol;
        } else {
            System.out.println("Opção inválida!");
            return;
        }
        cursoSelecionado.associarProfessor();
        a.setCurso(cursoSelecionado.getNome());

        System.out.println("Professor administra o curso: " + cursoSelecionado.getNome());



        // cursos disponíveis

    }
}
        










