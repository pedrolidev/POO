public class App {
    public static void main(String[] args) {

        Fisico fisico1 = new Fisico("Aventuras em Java", "João Autor");
        Digital digital1 = new Digital("Programação Java Avançada", "João Autor", "PDF");

        fisico1.emprestar();

        fisico1.reserva();
        digital1.reserva();

        digital1.cancelarReserva();

        fisico1.emprestar();
        fisico1.emprestar();
        fisico1.devolver();
    }
}
