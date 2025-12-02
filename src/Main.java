import java.util.Scanner;
import model.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        // Cursos com vagas
        Curso ingles = new Curso("Inglês", 250.00, 50);
        Curso espanhol = new Curso("Espanhol", 220.00, 40);


        Aluno a = new Aluno();

        System.out.print("Aluno, qual é o seu nome? ");
        a.setNome(sc2.nextLine());

        System.out.print("Sua idade: ");
        a.setIdade(sc.nextInt());
        sc.nextLine();

        System.out.print("Sua matrícula: ");
        a.setMatricula(sc.nextInt());
        sc.nextLine();


        System.out.println("Escolha o curso:");
        System.out.println("1 - Inglês (R$ 250,00)");
        System.out.println("2 - Espanhol (R$ 220,00)");
        System.out.print("Opção: ");
        int opcao = sc.nextInt();
        sc.nextLine();

        Curso cursoEscolhido = null;

        GerenciadordeMarketing marketing = new GerenciadordeMarketing();


        Marketing blackFridayIngles = new Marketing("Mega Black Friday - Inglês",250.00, 200.00);

        Marketing blackFridayEspanhol = new Marketing("Mega Black Friday - Espanhol", 220.00, 180.00);


        marketing.adicionarCampanha(blackFridayIngles);
        marketing.adicionarCampanha(blackFridayEspanhol);


        marketing.listarCampanhas();

        if (opcao == 1) {
            cursoEscolhido = ingles;
        } else if (opcao == 2) {
            cursoEscolhido = espanhol;
        } else {
            System.out.println("Opção inválida!");
            return;
        }

        double precoComDesconto = marketing.aplicarDesconto(
                cursoEscolhido.getNome(),
                cursoEscolhido.getPreco()
        );

        cursoEscolhido.setPreco(precoComDesconto);


        System.out.println("Escolha a forma de pagamento:");
        System.out.println("1 - Pix");
        System.out.println("2 - Cartão de Crédito");
        System.out.println("3 - Boleto");
        int pg = sc.nextInt();
        sc.nextLine();

        String formaPg = switch (pg) {
            case 1 -> "Pix";
            case 2 -> "Cartão de Crédito";
            case 3 -> "Boleto";
            default -> "Não informado";
        };


        cursoEscolhido.matricularAluno(a);
        a.setCurso(cursoEscolhido.getNome());

        System.out.println("Cadastro do aluno finalizado!\n");


        System.out.println("=== Cadastro do Professor ===\n");

        Professor professor = new Professor();

        System.out.print("Nome do professor: ");
        professor.setNome(sc2.nextLine());

        System.out.print("Idade do professor: ");
        professor.setIdade(sc.nextInt());
        sc.nextLine();

        System.out.print("Valor do salário base do professor: ");
        professor.setSalario((int) sc.nextDouble());
        sc.nextLine();

        professor.calcularSalario();
        System.out.println("Salário calculado: " + professor.getSalario());

        System.out.println("Curso que o professor vai ministrar:");
        System.out.println("1 - Inglês");
        System.out.println("2 - Espanhol");
        System.out.print("Opção: ");
        int opcoes = sc.nextInt();
        sc.nextLine();

        Curso cursoSelecionado = null;

        if (opcoes == 1) {
            cursoSelecionado = ingles;
        } else if (opcoes == 2) {
            cursoSelecionado = espanhol;
        } else {
            System.out.println("Opção inválida!");
            return;
        }


        cursoSelecionado.associarProfessor(professor);

        System.out.println("Professor associado ao curso: " + cursoSelecionado.getNome() + "\n");


        Venda venda = new Venda(1, a, cursoEscolhido, formaPg);

        NotaFiscal notaFiscal = new NotaFiscal(1012, venda);
        notaFiscal.emitir();


        System.out.println("\n===== RELATÓRIO FINAL DO CURSO =====");
        cursoEscolhido.gerarRelatorio();

        sc.close();
        sc2.close();
    }
}






