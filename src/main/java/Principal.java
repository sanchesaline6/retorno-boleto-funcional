package main.java;

import java.net.URISyntaxException;

public class Principal {
    public static void main(String[] args) throws URISyntaxException {
        System.out.println("Boletos do Banco do Brasil");
        ProcessarBoletos processador = new ProcessarBoletos(ProcessarBoletos::lerBancoBrasil);
        String caminhoArquivo = "C:\\Users\\aline\\Desktop\\IFTO\\2022-1\\Padrões de Projetos\\Strategy\\RetornoBoletoFuncional\\src\\main\\resources\\banco-brasil-1.csv";
        processador.processar(caminhoArquivo);

        System.out.println();

        System.out.println("Boletos do Bradesco");
        ProcessarBoletos processador1 = new ProcessarBoletos(ProcessarBoletos::lerBradesco);
        String caminhoArquivo1 = "C:\\Users\\aline\\Desktop\\IFTO\\2022-1\\Padrões de Projetos\\Strategy\\RetornoBoletoFuncional\\src\\main\\resources\\bradesco-1.csv";
        processador1.processar(caminhoArquivo1);
    }
}