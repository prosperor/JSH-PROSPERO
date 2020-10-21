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
        System.out.print("UsuarioTeste#UID:dir% ");
    }

    public static ComandoPrompt lerComando() {
        return null;
    }

    public static void executarComando(ComandoPrompt comando) {


    }

    public static int executarPrograma(ComandoPrompt comando) {
        return 0;
    }

    public static void main(String... args) {
        promptTerminal();
    }

    private Jsh() {
    }
}
