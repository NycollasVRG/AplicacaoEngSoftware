package entidades;

public class Veiculo
{
    private String modelo;
    private String placa;
    private String cor;
    private String marca;

    public Veiculo(String modelo, String placa, String cor, String marca)
    {
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "(" +
                "modelo='" + modelo + '\'' +
                ", placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                ")";
    }
}
