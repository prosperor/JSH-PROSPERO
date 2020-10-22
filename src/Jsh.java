public final class Jsh {

    private static String dir;
    private static String name;
    private static String UID;
    private static String barra;

    public static void promptTerminal() {
        name = System.getProperty("user.name");
        UID = Utilidades.getUID(name);
        barra = System.getProperty("file.separator");

        while(true) {
            exibirPrompt();
            ComandoPrompt comandoEntrado = lerComando();
            System.out.println();
            executarComando(comandoEntrado);
            System.out.println();
        }
    }

    public static void exibirPrompt() {
        dir = System.getProperty("user.dir");
        System.out.print(name + "#" + UID + ":" + dir + "% ");
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
