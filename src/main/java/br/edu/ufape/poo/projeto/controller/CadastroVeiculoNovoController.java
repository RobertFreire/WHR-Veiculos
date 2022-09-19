package br.edu.ufape.poo.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ufape.poo.projeto.basica.VeiculoNovo;
import br.edu.ufape.poo.projeto.cadastro.exceptions.ChassiExistenteException;
import br.edu.ufape.poo.projeto.cadastro.exceptions.DateForaRangeException;
import br.edu.ufape.poo.projeto.cadastro.exceptions.ValorForaRangeException;
import br.edu.ufape.poo.projeto.cadastro.exceptions.ValorVazioExpection;
import br.edu.ufape.poo.projeto.fachada.Concessionaria;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/whr/api/v1")
public class CadastroVeiculoNovoController {

	@Autowired
	private Concessionaria c;

	@PostMapping("veiculoNovo")
	public ResponseEntity<VeiculoNovo> createVeiculoNovo(@RequestBody VeiculoNovo modelo)
			throws DateForaRangeException, ValorVazioExpection, ValorForaRangeException, ChassiExistenteException {
		VeiculoNovo vn = c.save(modelo);
		return new ResponseEntity<VeiculoNovo>(vn, HttpStatus.CREATED);

	}

	@PutMapping("veiculoNovo/{veiculo}")
	public VeiculoNovo updateVeiculoNovo(@PathVariable("veiculo") VeiculoNovo veiculo)
			throws ValorVazioExpection, ValorForaRangeException, ChassiExistenteException {
		return c.save(veiculo);
	}

	@DeleteMapping("deleteVeiculoNovo")
	public void deleteVeiculoNovo(@RequestBody VeiculoNovo veiculo) {
		c.delete(veiculo);
	}

	@GetMapping("valorVeiculoNovo/{valorVenda}")
	public List<VeiculoNovo> findByValorVendaVeiculoNovo(@PathVariable("valorVenda") float valorVenda) {
		return c.findByValorVendaVeiculoNovo(valorVenda);
	}

	@GetMapping("idVeiculoNovo/{id}")
	public VeiculoNovo findByIdVeiculoNovo(@PathVariable("id") long id) {
		return c.findByIdVeiculoNovo(id);
	}

	@GetMapping("vendidoVeiculoNovo/{vendido}")
	public List<VeiculoNovo> findByVendidoVeiculoNovo(@PathVariable("vendido") boolean vendido) {
		return c.findByVendidoVeiculoNovo(vendido);
	}

	@GetMapping("garantiaVeiculoNovo/{garantiaFabrica}")
	public List<VeiculoNovo> findByGarantiaFabricaVeiculoNovo(
			@PathVariable("garantiaFabrica") boolean garantiaFabrica) {
		return c.findByGarantiaFabricaVeiculoNovo(garantiaFabrica);
	}

	@GetMapping("allVeiculoNovo")
	public List<VeiculoNovo> findAllVeiculoNovo() {
		return c.findAllVeiculoNovo();
	}

}