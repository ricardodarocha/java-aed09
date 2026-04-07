import java.util.ArrayList;

public class GerenciadorTarefas {
    private ArrayList<String> tarefas;

    GerenciadorTarefas() {
        this.tarefas = new ArrayList<>();
    }

    void adicionarTarefa(String descricao) {
        this.tarefas.add(descricao);
    }
    void removerTarefa(String descricao) {
        this.tarefas.remove(descricao);
    }

    void listarTarefas() {
        for (String tarefa: this.tarefas) {
            System.out.println(tarefa);
        }
    }
}
