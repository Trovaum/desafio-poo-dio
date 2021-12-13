import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Descrição do curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso de Js");
        curso2.setDescricao("Descrição do curso javaScript");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("mentoria de POO");
        mentoria.setDescricao("descrição da mentoria de POO");
        mentoria.setData(LocalDate.now());

        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("Descrição do Bootcamp de java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRicardo = new Dev();
        devRicardo.setNome("Ricardo Florencio Pouza");
        devRicardo.increverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " + devRicardo.getConteudosInscritos());
        devRicardo.progredir();
        System.out.println("Conteudos inscritos: " + devRicardo.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + devRicardo.getConteudosConcluidos());
        System.out.println("XP Total: " + devRicardo.calcularTotalXp());

        System.out.println("---------------------------------------------------------");

        Dev devEnzo = new Dev();
        devEnzo.setNome("Enzo de Oliveira");
        devEnzo.increverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " + devEnzo.getConteudosInscritos());
        devEnzo.progredir();
        System.out.println("Conteudos inscritos: " + devEnzo.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + devEnzo.getConteudosConcluidos());
    }
}
