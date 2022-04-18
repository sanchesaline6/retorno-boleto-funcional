import java.time.format.DateTimeFormatter;
import java.util.List;

public class ProcessarBoletos {

    private LeituraRetorno leituraRetorno;

    public ProcessarBoletos(LeituraRetorno leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }

    public final void processar(String caminhoArquivo){
        System.out.println("Boletos");
        System.out.println("-------------------------------------");
        List<Boleto> boletos = leituraRetorno.lerArquivo(caminhoArquivo);
        for(Boleto boleto : boletos){
            System.out.println(boleto);
        }
    }
}
