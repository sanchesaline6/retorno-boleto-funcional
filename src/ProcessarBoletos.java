import java.time.format.DateTimeFormatter;
import java.util.List;

public abstract class ProcessarBoletos {

    public static final DateTimeFormatter FORMATO_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static final DateTimeFormatter FORMATO_DATA_HORA = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private LeituraRetorno leituraRetorno;
    public void processar(String nomeArquivo){
        List<Boleto> boletos = leituraRetorno.lerArquivo(nomeArquivo);
        for (Boleto boleto : boletos){
            System.out.println(boleto);
        }
    }
}
