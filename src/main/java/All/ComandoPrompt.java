package All;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComandoPrompt {
    private final String nome;
    private final String[] argumentos;

    public ComandoPrompt(String comando) {
        this.nome = comando.contains(" ") ? comando.substring(0, comando.indexOf(32)).toLowerCase() : comando.toLowerCase();
        this.argumentos = comando.contains(" ") ? comando.replace(this.nome, "").split(" ") : null;
    }

    public String getNome() {
        return this.nome;
    }

    public List<String> getArgumentos() {
        return Collections.unmodifiableList(Arrays.asList(this.argumentos));
    }
}