import java.time.LocalDate;

import dominio.Curso;
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

        System.out.println(curso1);
        System.out.println(mentoria1);
    }
}