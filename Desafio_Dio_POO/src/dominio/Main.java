package dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();

		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição curso Java");
		curso1.setCargaHoraria(8);

		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JavaScript");
		curso2.setDescricao("Descrição curso JavaScript");
		curso2.setCargaHoraria(8);

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("Descrição mentoria Java");
		mentoria.setData(LocalDate.now());

		//System.out.println(curso1);
		//System.out.println(curso2);
		//System.out.println(mentoria);

		System.out.println();
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devNilton = new Dev();
		devNilton.setNome("Nilton Brito");
		devNilton.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos: "+devNilton.getContudosInscritos());
		devNilton.proguedir();
		devNilton.proguedir();
		System.out.println("-");
		System.out.println("Conteudos Inscritos: "+devNilton.getContudosInscritos());
		System.out.println("Conteudos Concluídos: "+devNilton.getConteudosConcluidos());
		System.out.println("XP: " + devNilton.calcularTotalXp());
		
		System.out.println("--------------------------------------------------------------------");
		
		Dev devPedro = new Dev();
		devPedro.setNome("Pedro Santos");
		devPedro.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos: "+devPedro.getContudosInscritos());
		devPedro.proguedir();
		System.out.println("-");
		System.out.println("Conteudos Inscritos: "+devPedro.getContudosInscritos());
		System.out.println("Conteudos Concluídos: "+devPedro.getConteudosConcluidos());
		System.out.println("XP: " + devPedro.calcularTotalXp());
	}

}
