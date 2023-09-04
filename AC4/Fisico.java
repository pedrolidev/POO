public class Fisico extends Livro {

    boolean emprestado = false;
    boolean reservado = false;

    public Fisico(String nome, String autor) {
        super(nome, autor);
    }

    public void emprestar() {
        if(emprestado == false && reservado == true) {
            System.out.println("O livro foi emprestado com sucesso.");
            emprestado = true;
        }else if (emprestado == true) {
            System.out.println("Este livro já está emprestado.");
        } else {
            System.out.println("O livro deve ser reservado antes de emprestar.");
        }
    }

    public void devolver() {
        if(emprestado == false) {
            System.out.println("Este livro não foi emprestado, então não é possível o devolver.");
        }else {
            System.out.println("O livro foi devolvido.");
            emprestado = false;
        }
    }

    @Override
    public void reserva() {
        if (reservado == false) {
            System.out.println("O seu livro foi garantido com sucesso!");
            reservado = true;
        } else {
            System.out.println("O livro que você procura, teve seu limite excedido.");
        }

    }

    @Override
    public void cancelarReserva() {
        if (reservado == true) {
            System.out.println("A reserva foi cancelada com sucesso.");
            reservado = false;
        } else {
            System.out.println("Essa obra não está reservado.");
        }
    }
}