import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Curso curso1 = new Curso();

        Curso curso2 = new Curso();

        Mentoria mentoria1 = new Mentoria();

        curso1.setTitulo("Java");
        curso1.setDescricao("Curso sobre Java");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("Orientação a Objetos");
        curso2.setDescricao("Curso sobre POO em Java");
        curso2.setCargaHoraria(5);

        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Aula inicial");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Um Bootcamp para aprender tudo sobre Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devJoao = new Dev();
        Dev devMaria = new Dev();

        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);

        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos inscritos: " + devJoao.getConteudosInscritos());

        devJoao.progredir();
        System.out.println("João Progrediu!");

        System.out.println("Conteúdos inscritos: " + devJoao.getConteudosInscritos());

        System.out.println("Conteúdos concluídos: " + devJoao.getConteudosConcluidos());

        System.out.println("-------------------");

        System.out.println("Conteúdos inscritos: " + devMaria.getConteudosInscritos());

        devMaria.progredir();
        System.out.println("Maria Progrediu!");

        System.out.println("Conteúdos inscritos: " + devMaria.getConteudosInscritos());

        System.out.println("Conteúdos concluídos: " + devMaria.getConteudosConcluidos());
    
    }

}