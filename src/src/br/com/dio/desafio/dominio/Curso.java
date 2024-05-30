package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso(String titulo, String descricao, int cargaHoraria) {
        setTitulo(titulo);
        setDescricao(descricao);
        this.cargaHoraria = cargaHoraria;
    }


    @Override
    public String toString() {
        return getTitulo() +
                ", Descricao: " + getDescricao() +
                ", Carga Horária: " + cargaHoraria + " | ";
    }
}
