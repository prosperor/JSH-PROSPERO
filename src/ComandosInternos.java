import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public final class ComandosInternos {

    public static int exibirRelogio() {
        Date DHatual = new Date();
        String data = (new SimpleDateFormat("dd/MM/yyyy")).format(DHatual);
        String hora = (new SimpleDateFormat("HH:mm:ss")).format(DHatual);
        System.out.println(hora + '\n' + data);
        return 0;
    }

    public static int escreverListaArquivos(Optional<String> nomeDir) {
        File dir = new File((String)nomeDir.get());
        List<File> listArq = Arrays.asList(dir.listFiles());
        StringBuilder out = new StringBuilder();

        for(int x = 0; x < listArq.size(); ++x) {
            out.append(((File)listArq.get(x)).getName() + '\n');
        }

        System.out.println(out.toString());
        return 0;
    }

    public static int criarNovoDiretorio(String nomeDir, String path) {
        File dir = new File(path + System.getProperty("file.separator") + nomeDir);
        dir.mkdir();
        String out = dir.exists() && dir.isDirectory() ? "Criado" : "Erro";
        System.out.println(out);
        return dir.exists() && dir.isDirectory() ? 0 : 1;
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
