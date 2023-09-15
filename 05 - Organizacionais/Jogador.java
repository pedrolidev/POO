package entidades.pessoas;

import pessoas.Pessoa;

public class Jogador extends Pessoa {
    private String time;
    private String uniforme;
    private int numCamisa;

    public Jogador(String nome, String corpo, String time, String uniforme, int numCamisa) {
        super(nome, corpo);
        this.time = time;
        this.uniforme = uniforme;
        this.numCamisa = numCamisa;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getUniforme() {
        return uniforme;
    }

    public void setUniforme(String uniforme) {
        this.uniforme = uniforme;
    }

    public int getNumCamisa() {
        return numCamisa;
    }

    public void setNumCamisa(int numCamisa) {
        this.numCamisa = numCamisa;
    }

    @Override
    public void movimenta(double novaPosX, double novaPosY) {
        super.movimenta(novaPosX, novaPosY);
        System.out.println("Jogador andou");
    }

    @Override
    public void falar() {
        System.out.println("Um jogador está falando!");
    }
}
