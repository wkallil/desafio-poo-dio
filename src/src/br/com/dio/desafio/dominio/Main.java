package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Conteudo curso1 = new Curso("Curso Java", "Descricao do curso de Java", 8);

        Conteudo curso2 = new Curso("Curso Python", "Entender e interpretar os dados", 4);

        Conteudo mentoria1 = new Mentoria("Mentoria liderança", "Aprenda as caracteristicas mais marcantes de líderes", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descricao do bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);


        Dev dev1 = new Dev("Kallil");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println(dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("******");
        System.out.println(dev1.getConteudosConcluidos());
        System.out.println(dev1.getConteudosInscritos());
        System.out.println(dev1.calcularXP());

        System.out.println();
        System.out.println("------------------");
        System.out.println();

        Dev dev2 = new Dev("Thais");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println(dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println(dev2.getConteudosConcluidos());
        System.out.println(dev2.getConteudosInscritos());
        System.out.println(dev2.calcularXP());



    }
}
