package dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
	
	private String nome;
	private Set<Conteudo> contudosInscritos = new LinkedHashSet<>();
	private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
	
	public void inscreverBootcamp(Bootcamp bootcamp) {
		
	}
	
	public void proguedir() {
		
	}
	
	public void calcularTotalXp() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getContudosInscritos() {
		return contudosInscritos;
	}

	public void setContudosInscritos(Set<Conteudo> contudosInscritos) {
		this.contudosInscritos = contudosInscritos;
	}

	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}

	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudosConcluidos, contudosInscritos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudosConcluidos, other.conteudosConcluidos)
				&& Objects.equals(contudosInscritos, other.contudosInscritos) && Objects.equals(nome, other.nome);
	}
	
	

}
