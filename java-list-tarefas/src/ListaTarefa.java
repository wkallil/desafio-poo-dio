import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    List<Tarefa> tarefaLista;

    public ListaTarefa() {
        this.tarefaLista = new ArrayList<>();
    }
    public void adicionarTarefa(String descricao) {
        tarefaLista.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        List<Tarefa> listaParaRemoverTarefa = new ArrayList<>();
        if (!tarefaLista.isEmpty()){
            for (Tarefa tarefa : tarefaLista) {
                if (tarefa.getDescricao().equalsIgnoreCase(descricao)){
                    listaParaRemoverTarefa.add(tarefa);
                }
            }
            tarefaLista.removeAll(listaParaRemoverTarefa);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public int obterNumeroTotalTarefas(){
        return tarefaLista.size();
    }
    public void obterDescricaoTarefas(){
        if (!tarefaLista.isEmpty()) {
            System.out.println(tarefaLista);
        } else {
            System.out.println("A lista está vazia!");
        }
    }
}
