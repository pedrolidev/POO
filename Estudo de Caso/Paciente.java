package entidades.pessoas;

import java.time.LocalDate;

import entidades.Endereco;
import entidades.PlanoSaude;

public class Paciente extends Pessoa {
    private PlanoSaude plano;

    public Paciente(String nome, String cpf, Endereco endereço, LocalDate dataNascimento) {
        super(nome, cpf, endereço, dataNascimento);
        this.plano = new PlanoSaude();
    }


    @Override
    public String toString() {
        return "Paciente" + super.toString() + "\n" +
        "Plano de Saúde: " + this.plano;
    }
}
