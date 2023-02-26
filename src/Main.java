import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
       Curso curso1 = new Curso();
       Mentoria mentoria1 = new Mentoria();

        curso1.setTitulo(" curso java");
        curso1.setDescricao(" descrição curso java");
        curso1.setCargaHoraria(8);

        mentoria1.setTitulo("mentoria java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso de js");
        curso2.setCargaHoraria(4);

        //System.out.println(curso1);
        //System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devDavi = new Dev();
        devDavi.setNome("Davi Lima");
        devDavi.inscreverBootcamp(bootcamp);
        System.out.println("conteudos Inscritos Davi:" + devDavi.getConteudosInscritos());
        devDavi.progredir();
        System.out.println("--------Progredindo----------");
        System.out.println("conteudos Inscritos atualmente Davi:" + devDavi.getConteudosInscritos());
        System.out.println("conteudos Concluidos Davi:" + devDavi.getConteudosConcluidos());
        System.out.println("XP:" + devDavi.calcularTotalXp());

        System.out.println("-------------------------------");

        Dev devDebora = new Dev();
        devDebora.setNome("Débora Lima");
        devDebora.inscreverBootcamp(bootcamp);
        System.out.println("conteudos inscritos Debora:" + devDebora.getConteudosInscritos());
        devDebora.progredir();
        devDebora.progredir();
        devDebora.progredir();
        System.out.println("--------Progredindo 3 cursos----------");
        System.out.println("conteudos inscritos atualmente Debora:" + devDebora.getConteudosInscritos());
        System.out.println("conteudos Concluidos Debora:" + devDebora.getConteudosConcluidos());
        System.out.println("XP:" + devDebora.calcularTotalXp());
        
        



    }
}
