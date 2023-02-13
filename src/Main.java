import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Curso curso1 = new Curso();

        Curso curso2 = new Curso();

        Mentoria mentoria1 = new Mentoria();

        curso1.setTitulo("Java");
        curso1.setDescricao("Curso sobre Java");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("Python");
        curso2.setDescricao("Curso sobre Python");
        curso2.setCargaHoraria(5);

        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Aula inicial");
        mentoria1.setData(LocalDate.now());

        System.out.println(curso1);

        System.out.println(curso2);

        System.out.println(mentoria1);

    }
}
