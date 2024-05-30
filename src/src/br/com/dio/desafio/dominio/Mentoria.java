package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data;

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20;
    }

    public Mentoria(String titulo, String descricao, LocalDate data) {
        setTitulo(titulo);
        setDescricao(descricao);
        this.data = data;
    }


    @Override
    public String toString() {
        return getTitulo() +
                ", Descricao: " + getDescricao() +
                ", Data: " + data + " | ";
    }
}
