public final class Jsh {


    public static void promptTerminal() {

        while(true) {
            exibirPrompt();
            ComandoPrompt comandoEntrado = lerComando();
            System.out.println();
            executarComando(comandoEntrado);
            System.out.println();
        }
    }

    public static void exibirPrompt() {

    }

    public static ComandoPrompt lerComando() {

    }

    public static void executarComando(ComandoPrompt comando) {


    }

    public static int executarPrograma(ComandoPrompt comando) {

    }

    public static void main(String... args) {
        promptTerminal();
    }

    private Jsh() {
    }
}
