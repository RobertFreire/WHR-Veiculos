package br.edu.ufape.poo.projeto.basica;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Modelo extends Marca {

	private String nomeModelo;
	private String motor;

	private String cor;
	private int anoFabricado;
	private int potencia;
	private int quantidadePassageiros;
	private float cilindradas;
	private String cambio;
	private String combustivel;

	@OneToMany(mappedBy = "modelo")
	private List<Veiculo> veiculos;

	public Modelo() {
		super();
	}

	public Modelo(String nomeMarca, String nomeModelo, String motor, String cor, int anoFabricado, int potencia,
			int quantidadePassageiros, float cilindradas, String cambio, String combustivel) {
		super(nomeMarca);

		this.nomeModelo = nomeModelo;
		this.motor = motor;
		this.cor = cor;
		this.anoFabricado = anoFabricado;
		this.potencia = potencia;
		this.quantidadePassageiros = quantidadePassageiros;
		this.cilindradas = cilindradas;
		this.cambio = cambio;
		this.combustivel = combustivel;
	}

	public String getNomeModelo() {
		return nomeModelo;
	}

	public String getMotor() {
		return motor;
	}

	public String getCor() {
		return cor;
	}

	public int getAnoFabricado() {
		return anoFabricado;
	}

	public int getPotencia() {
		return potencia;
	}

	public int getQuantidadePassageiros() {
		return quantidadePassageiros;
	}

	public float getCilindradas() {
		return cilindradas;
	}

	public String getCambio() {
		return cambio;
	}

	public String getCombustivel() {
		return combustivel;
	}

	@Override
	public String toString() {
		return "Modelo [marca=" + getNomeMarca() + ", nomeModelo=" + nomeModelo + ", motor=" + motor + ", cor=" + cor
				+ ", anoFabricado=" + anoFabricado + ", potencia=" + potencia + ", quantidadePassageiros="
				+ quantidadePassageiros + ", cilindradas=" + cilindradas + ", cambio=" + cambio + ", combustivel="
				+ combustivel + "]";
	}

}