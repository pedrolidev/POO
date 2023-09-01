public class Jogador {
    double posX, posY;
    double velocidade;
    double altura, peso;
    int numeroCamisa;
    String time, nome, posicionamento;

    // Método construtor
    Jogador() {
        this.time = "Sem time";
    }

    // Sobrecarga de método
    Jogador(String nome, String time, double altura, double peso, String posicionamento) {
        this.nome = nome;
        this.time = time;
        this.altura = altura;
        this.peso = peso;
        this.velocidade = 0;
        this.posicionamento = posicionamento;
        if (posicionamento.equals("goleiro")) {
            this.posX = -50.0;
            this.posY = 0;
        }
    }

    void andar(double novaPosX, double novaPosY) {
        this.posX = novaPosX;
        this.posY = novaPosY;
    }

    void mudarTime(String novoTime) {
        this.time = novoTime;
    }

    void mudarTime(int histMudancas, String novoTime) {
        System.out.println("Mudou de time! Esta é a mudança número " + histMudancas);
        this.time = novoTime;
    }
}