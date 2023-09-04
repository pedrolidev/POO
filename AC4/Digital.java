public class Digital extends Livro {

    String formato;
    boolean reservado = false;

    public Digital(String nome, String autor, String formato) {
        super(nome, autor);
        this.formato = formato;
    }

    @Override
    public void reserva() {
        if (!reservado) {
            System.out.println("O livro digital foi salva com êxito!");
            reservado = true;
        } else {
            System.out.println("Este livro virtual já foi reservado.");
        }
    }

    @Override
    public void cancelarReserva() {
        if (reservado) {
            System.out.println("A sua reserva foi cancelada com êxito!");
            reservado = false;
        } else {
            System.out.println("Este livro ainda não foi reservado.");
        }
    }
}
