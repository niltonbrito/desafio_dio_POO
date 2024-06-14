package dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
	
	private String nome;
	private String Descricao;
	private LocalDate dataInicial = LocalDate.now();
	private LocalDate dataFinal = dataInicial.plusDays(45);
	private Set<Dev> devInncritos = new HashSet<>();
	private Set<Conteudo> conteudos = new LinkedHashSet<>();
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	public LocalDate getDataInicial() {
		return dataInicial;
	}
	public void setDataInicial(LocalDate dataInicial) {
		this.dataInicial = dataInicial;
	}
	public LocalDate getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(LocalDate dataFinal) {
		this.dataFinal = dataFinal;
	}
	public Set<Dev> getDevInncritos() {
		return devInncritos;
	}
	public void setDevInncritos(Set<Dev> devInncritos) {
		this.devInncritos = devInncritos;
	}
	public Set<Conteudo> getConteudos() {
		return conteudos;
	}
	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Descricao, conteudos, dataFinal, dataInicial, devInncritos, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(Descricao, other.Descricao) && Objects.equals(conteudos, other.conteudos)
				&& Objects.equals(dataFinal, other.dataFinal) && Objects.equals(dataInicial, other.dataInicial)
				&& Objects.equals(devInncritos, other.devInncritos) && Objects.equals(nome, other.nome);
	}
	
	

}
