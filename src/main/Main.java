package main;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descrição curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso js");
		curso2.setDescricao("descrição curso js");
		curso2.setCargaHoraria(4);
		
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria java");
		mentoria.setDescricao("descrição mentoria java");
		mentoria.setData(LocalDate.now());
		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devAna = new Dev();
		devAna.setNome("Ana");
		devAna.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Ana: " + devAna.getConteudosInscritos());
		devAna.progredir();
		devAna.progredir();
		System.out.println("-");
		System.out.println("Conteudos Inscritos Ana: " + devAna.getConteudosInscritos());
		System.out.println("Conteudos Concluidos Ana: " + devAna.getConteudosConcluidos());
		System.out.println("XP: " + devAna.calcularXp());
		
		
		System.out.println("-----------------------------------------------------------------------");
		
		
		Dev devMaria = new Dev();
		devMaria.setNome("Maria");
		devMaria.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Maria: " + devMaria.getConteudosInscritos());
		devMaria.progredir();
		devMaria.progredir();
		devMaria.progredir();
		System.out.println("-");
		System.out.println("Conteudos Inscritos Maria: " + devMaria.getConteudosInscritos());
		System.out.println("Conteudos Concluidos Maria: " + devMaria.getConteudosConcluidos());
		System.out.println("XP: " + devMaria.calcularXp());

			
	}

}
