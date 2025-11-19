//Cliente poder agendar um horário e a data registrando o veículo(modelo, placa, cor)
//Classe com as datas agendadas e os carros para cada horário.

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.LinkedList;

import entidades.*;

public class Main
{
    public static void main(String[] args)
    {
        LocalDateTime horaAtual = LocalDateTime.now();

        Scanner sc = new Scanner(System.in);

        LinkedList<Agenda> agendamento = new LinkedList<>();

        System.out.println("Olá! Gostaria de agendar um serviço?(Y/N) ");
        String esc = sc.nextLine();

        esc.toLowerCase();

        while(esc.equals("y"))
        {
            System.out.println("Informe o seu nome: ");
            String nome = sc.nextLine();
            System.out.println("Informe o seu CPF: ");
            String cpf = sc.nextLine();

            System.out.println("Informe o modelo do carro: ");
            String modelo = sc.nextLine();
            System.out.println("Informe a placa do carro: ");
            String placa = sc.nextLine();
            System.out.println("Informe a cor do carro: ");
            String cor = sc.nextLine();
            System.out.println("Informe a marca do carro: ");
            String marca = sc.nextLine();

            Veiculo veiculo = new Veiculo(modelo, placa, cor, marca);
            Cliente cliente = new Cliente(nome, cpf, veiculo);

            System.out.println("Informe a data (YYYY-MM-DD) :");
            String dataSTR = sc.nextLine();
            System.out.println("Informe o horário (HH:MM): ");
            String horaSTR = sc.nextLine();

            DateTimeFormatter formatador = DateTimeFormatter.ofPattern("HH:MM");

            LocalDate data = LocalDate.parse(dataSTR);
            LocalTime hora = LocalTime.parse(horaSTR, formatador);
            LocalDateTime DiaHora = LocalDateTime.of(data, hora);

            agendamento.add(new Agenda(cliente, DiaHora));

            System.out.println("\nO serviço foi registrado com sucesso!\n\n\nDeseja de agendar outro serviço?(Y/N) ");
            esc = sc.nextLine();
        }

        for(Agenda agendado : agendamento)
        {
            System.out.println(agendado.toString());
        }
    }
}