import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Crud crud = new Crud();

        Aluno aluno1 = new Aluno("Pedro Oliveira", "Análise e Desenvolvimento de Sistemas", "12345");
        Aluno aluno2 = new Aluno("Jorge Felippe Magarão", "Análise e Desenvolvimento de Sistemas", "67890");
        crud.adicionarAluno(aluno1);
        crud.adicionarAluno(aluno2);

        ArrayList<Aluno> listaAlunos = crud.listarAlunos();
        for (Aluno aluno : listaAlunos) {
            System.out.println(aluno);
        }
        String matriculaBusca = "202303378785";
        Aluno alunoEncontrado = crud.buscarAluno(matriculaBusca);
        if (alunoEncontrado != null) {
            System.out.println("Aluno encontrado: " + alunoEncontrado);
            crud.atualizarCurso(matriculaBusca, "Análise de Desenvolvimento de Sistemas");
            System.out.println("Curso atualizado: " + alunoEncontrado.getCurso());
        } else {
            System.out.println("O estudante não pode ser encontrado.");
        }
        String matriculaRemover = "67890";
        crud.removerAluno(matriculaRemover);

        listaAlunos = crud.listarAlunos();
        for (Aluno aluno : listaAlunos) {
            System.out.println(aluno);
        }
    }

}