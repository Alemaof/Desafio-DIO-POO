import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso JAVA");
        curso1.setDescricao("Curso básico de JAVA");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Curso básico de JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de JAVA");
        mentoria.setDescricao("Mentoria de Linguagem JAVA");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp JAVA Developer");
        bootcamp.setDescricao("Bootcamp para quem quer se tornar um Desenvolvedor JAVA");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Felipe");
        dev1.increverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos de Felipe: " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("Felipe finalizou um curso.");
        dev1.progredir();
        System.out.println("Felipe finalizou um curso.");
        System.out.println("Conteudos inscritos de Felipe: " + dev1.getConteudosInscritos());
        System.out.println("Conteudos concluídos de Felipe: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularXp());
        System.out.println("----------");

        Dev dev2 = new Dev();
        dev2.setNome("João");
        dev2.increverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos de João: " + dev2.getConteudosInscritos());
        System.out.println("João finalizou um curso.");
        dev2.progredir();
        System.out.println("Conteudos inscritos de João: " + dev2.getConteudosInscritos());
        System.out.println("Conteudos concluídos de João: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularXp());

    }
}
