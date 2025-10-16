package br.com.fiap.clinica;

import br.com.fiap.clinica.model.Paciente;

public class ClinicaApp {

    public static void main(String[] args) {
        System.out.printf("Clinica do Programa");

        Paciente paciente1 = new Paciente();
        paciente1.nome = "Pedro";
        paciente1.altura = 178;
        paciente1.peso = 76;
        paciente1.exibirDadosPaciente();


        Paciente paciente2 = new Paciente();
        paciente2.nome = "Ana";
        paciente2.altura = 172;
        paciente2.peso = 84;
        paciente2.exibirDadosPaciente();

        System.out.println(paciente1);
        System.out.println(paciente2);
    }
}
