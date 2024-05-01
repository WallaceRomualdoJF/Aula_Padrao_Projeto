import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FolhaPonto {
    private static final Logger LOGGER = Logger.getLogger(FolhaPonto.class.getName());

    private List<ITarefa> tarefas = new ArrayList<>();

    public void executarTarefa(ITarefa tarefa) {
        tarefas.add(tarefa);
        tarefa.executar();
        LOGGER.log(Level.INFO, "Tarefa executada e adicionada à lista.");
    }

    public void cancelarUltimaTarefa() {
        if (!tarefas.isEmpty()) {
            ITarefa tarefa = tarefas.remove(tarefas.size() - 1);
            tarefa.cancelar();
            LOGGER.log(Level.INFO, "Última tarefa cancelada.");
        } else {
            LOGGER.log(Level.WARNING, "Não há tarefas a serem canceladas.");
        }
    }
}
