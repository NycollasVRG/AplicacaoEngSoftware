package entidades;

import java.time.*;

public class Agenda
{
    private Cliente cliente;
    private LocalDateTime dataAgendada;

    public Agenda(Cliente cliente, LocalDateTime data)
    {
        this.cliente = cliente;
        dataAgendada = data;
    }

    @Override
    public String toString() {
        return "Agenda{\n" +
                cliente.toString() +
                "\nData da agenda: " + dataAgendada.toString() +
                "\n}" + "\n\n";
    }
}
