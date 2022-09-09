package br.edu.ufape.poo.projeto.basica;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Marca {
	
	private String nome;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	public Marca(String nome, long id) {
		super();
		this.nome = nome;
		this.id = id;
	}
	
	public Marca() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}
}

