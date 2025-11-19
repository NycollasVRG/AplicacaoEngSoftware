package entidades;

public class Cliente
{
    private String nome;
    private String CPF;

    private Veiculo proprietarioVeiculo;

    public Cliente(String nome, String CPF, Veiculo veiculo)
    {
        this.nome = nome;
        this.CPF = CPF;
        proprietarioVeiculo = veiculo;
    }

    @Override
    public String toString() {
        return "Cliente: " + nome +
                "\nCPF: " + CPF +
                "\nDados veiculo: " + proprietarioVeiculo.toString();
    }
}
