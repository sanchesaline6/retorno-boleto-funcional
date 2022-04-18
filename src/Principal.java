public class Principal {
    public static void main(String[] args) {
        ProcessarBoletos processarBoletos = new ProcessarBoletos(new LeituraRetornoBancoBrasil());
        String caminhoArquivo = "C:\\Users\\aline\\Desktop\\IFTO\\2022-1\\Padrões de Projetos\\Strategy\\RetornoBoleto\\resource\\arquivos-retorno-boleto\\banco-brasil-1.csv";
        System.out.println("Lendo arquivo " + caminhoArquivo + "\n");

        System.out.println("Boletos do Banco do Brasil");
        processarBoletos.processar(caminhoArquivo);

        System.out.println();
        ProcessarBoletos processarBoletos1 = new ProcessarBoletos(new LeituraRetornoBancoBradesco());
        caminhoArquivo = "C:\\Users\\aline\\Desktop\\IFTO\\2022-1\\Padrões de Projetos\\Strategy\\RetornoBoleto\\resource\\arquivos-retorno-boleto\\bradesco-1.csv";
        System.out.println("Lendo arquivo " + caminhoArquivo + "\n");

        System.out.println("Boletos do Banco Bradesco");
        processarBoletos1.processar(caminhoArquivo);
    }
}
