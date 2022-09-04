package br.edu.ufape.poo.projeto.basica;

import javax.persistence.Entity;

@Entity
public class VeiculoNovo extends Veiculo {
	private boolean garantiaFabrica;

	public VeiculoNovo(float valorCompraVeiculo, float valorVenda, boolean vendido, Modelo modelo, long id,
			boolean garantiaFabrica) {
		super(valorCompraVeiculo, valorVenda, vendido, modelo, id);
		this.garantiaFabrica = garantiaFabrica;
	}


}
