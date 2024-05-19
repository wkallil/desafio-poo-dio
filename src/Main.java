public class Main {
    public static void main(String[] args) {
        ListaTarefa listaDeTarefas = new ListaTarefa();

        listaDeTarefas.adicionarTarefa("Tarefa 1");
        listaDeTarefas.adicionarTarefa("Tarefa 1");
        listaDeTarefas.adicionarTarefa("Tarefa 2");

        System.out.println(listaDeTarefas.obterNumeroTotalTarefas());
        listaDeTarefas.obterDescricaoTarefas();

        listaDeTarefas.removerTarefa("Tarefa 2");
        System.out.println(listaDeTarefas.obterNumeroTotalTarefas());
        listaDeTarefas.obterDescricaoTarefas();
    }
}
