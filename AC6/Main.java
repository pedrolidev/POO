import dao.AlunoDAO;
import entidades.Aluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AlunoDAO alunoDAO = new AlunoDAO("alunos.txt");

        while (true) {
            System.out.println("Menu:");
            System.out.println("1 - Adicionar Aluno");
            System.out.println("2 - Remover Aluno");
            System.out.println("3 - Atualizar Curso do Aluno");
            System.out.println("4 - Listar Alunos");
            System.out.println("5 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.println("Informe o nome do aluno:");
                    String nome = scanner.nextLine();
                    System.out.println("Informe o curso do aluno:");
                    String curso = scanner.nextLine();
                    System.out.println("Informe a matrícula do aluno:");
                    String matricula = scanner.nextLine();
                    Aluno novoAluno = new Aluno(nome, curso, matricula);
                    alunoDAO.adicionarAluno(novoAluno);
                    System.out.println("Aluno adicionado com sucesso!");
                    break;
                case 2:
                    System.out.println("Informe a matrícula do aluno a ser removido:");
                    String matriculaRemover = scanner.nextLine();
                    alunoDAO.removerAluno(matriculaRemover);
                    System.out.println("Aluno removido com sucesso!");
                    break;
                case 3:
                    System.out.println("Informe a matrícula do aluno a ser atualizado:");
                    String matriculaAtualizar = scanner.nextLine();
                    System.out.println("Informe o novo curso do aluno:");
                    String novoCurso = scanner.nextLine();
                    alunoDAO.atualizarCurso(matriculaAtualizar, novoCurso);
                    System.out.println("Curso do aluno atualizado com sucesso!");
                    break;
                case 4:
                    System.out.println("Lista de Alunos:");
                    for (Aluno aluno : alunoDAO.listarAlunos()) {
                        System.out.println(aluno);
                    }
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }
}
