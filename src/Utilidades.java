import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utilidades {
    public Utilidades() {
    }

    public static String getUID(String nomeUser) {
        String os = System.getProperty("os.name").toLowerCase();
        String UID = "0";
        ProcessBuilder construtor = new ProcessBuilder(new String[0]);
        if (os.contentEquals("windows")) {
            System.out.println("O comando para pegar UID ainda não está disponivel para seu sistema operacional");
        } else if (os.contentEquals("linux")) {
            try {
                Process gUID = construtor.command("id", "-u", nomeUser).start();
                UID = (new BufferedReader(new InputStreamReader(gUID.getInputStream()))).readLine();
            } catch (IOException var6) {
                System.out.println("Não foi possível capturar ID");
                UID = "0";
            }
        }

        return UID;
    }
}