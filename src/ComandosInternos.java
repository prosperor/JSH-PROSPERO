import java.text.SimpleDateFormat;
import java.util.Date;

public final class ComandosInternos {

    public static int exibirRelogio() {
        Date DHatual = new Date();
        String data = (new SimpleDateFormat("dd/MM/yyyy")).format(DHatual);
        String hora = (new SimpleDateFormat("HH:mm:ss")).format(DHatual);
        System.out.println(hora + '\n' + data);
        return 0;
    }

    public static int escreverListaArquivos(String nomeDir) {
        return 0;
    }

    public static int criarNovoDiretorio(String nomeDir, String path) {
        return 0;
    }

    public static int apagarDiretorio(String nomeDir, String dirPath) {
        return 0;
    }

    public static int mudarDiretorioTrabalho(String newPath) {
        return 0;
    }

    private ComandosInternos() {

    }
}
