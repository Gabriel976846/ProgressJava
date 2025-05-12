package CodigosFeitosDuranteEstudos.GerenciadorTarefas;

import java.time.LocalDate;

public abstract class TarefasCaracteristicas {
    private String Titulo;
    private String Descricao;
    private LocalDate DataVencimento;
    private StatusConclusao statusConclusao;
    private PrioridadeTarefa prioridadeTarefa;

    public TarefasCaracteristicas(String titulo, String descricao, LocalDate dataVencimento, String statusConclusao, String prioridadeTarefa) {
        Titulo = titulo;
        Descricao = descricao;
        DataVencimento = dataVencimento;
        this.statusConclusao = StatusConclusao.valueOf(statusConclusao.toUpperCase());
        this.prioridadeTarefa = PrioridadeTarefa.valueOf(prioridadeTarefa.toUpperCase());
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public LocalDate getDataVencimento() {
        return DataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        DataVencimento = dataVencimento;
    }

    public StatusConclusao getStatusConclusao() {
        return statusConclusao;
    }

    public void setStatusConclusao(StatusConclusao statusConclusao) {
        this.statusConclusao = statusConclusao;
    }

    public PrioridadeTarefa getPrioridadeTarefa() {
        return prioridadeTarefa;
    }

    public void setPrioridadeTarefa(PrioridadeTarefa prioridadeTarefa) {
        this.prioridadeTarefa = prioridadeTarefa;
    }

    @Override
    public String toString() {
        return "===== Tarefas =====" +
                "\nTitulo: " + Titulo +
                "\nDescrição: " + Descricao +
                "\nDataVencimento: " + DataVencimento +
                "\nStatus de Conclusao: " + statusConclusao +
                "\nPriorida da Tarefa:" + prioridadeTarefa;
    }
}
