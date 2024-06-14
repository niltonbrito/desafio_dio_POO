package dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		Conteudo curso = new Curso();
		Conteudo mentoria = new Mentoria();
		Mentoria mentoria1 = new Mentoria();

		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição curso Java");
		curso1.setCargaHoraria(8);
		

		Curso curso2 = new Curso();
		curso.setTitulo("Curso JavaScript");
		curso.setDescricao("Descrição curso JavaScript");
		curso2.setCargaHoraria(8);
		
		
		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("Descrição mentoria Java");
		mentoria1.setData(LocalDate.now());
		
		System.out.println(curso1);
		System.out.println(curso2);

		System.out.println(mentoria1);
	}

}
