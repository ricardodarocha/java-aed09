import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        GerenciadorTarefas runtime = new GerenciadorTarefas();
        runtime.adicionarTarefa("Farm gold ♦");
        runtime.adicionarTarefa("Farm stone 💎");
        runtime.adicionarTarefa("Farm food 🍖");
        runtime.adicionarTarefa("eat food 😋");
        runtime.adicionarTarefa("farm food 🍖");
        runtime.adicionarTarefa("sleep 😴💤");

        runtime.removerTarefa("sleep 😴💤");
        runtime.adicionarTarefa("never sleep ❌😴");
        runtime.listarTarefas();

    }
}