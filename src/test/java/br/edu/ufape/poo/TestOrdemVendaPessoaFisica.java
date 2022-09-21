package br.edu.ufape.poo;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.ufape.poo.projeto.basica.ClienteFisico;
import br.edu.ufape.poo.projeto.basica.Endereco;
import br.edu.ufape.poo.projeto.basica.Funcionario;
import br.edu.ufape.poo.projeto.basica.Modelo;
import br.edu.ufape.poo.projeto.basica.OrdemVendaPessoaFisica;
import br.edu.ufape.poo.projeto.basica.VeiculoNovo;
import br.edu.ufape.poo.projeto.cadastro.CadastroClienteFisico;
import br.edu.ufape.poo.projeto.cadastro.CadastroFuncionario;
import br.edu.ufape.poo.projeto.cadastro.CadastroModelo;
import br.edu.ufape.poo.projeto.cadastro.CadastroOrdemPessoaFisica;
import br.edu.ufape.poo.projeto.cadastro.CadastroVeiculoNovo;
import br.edu.ufape.poo.projeto.cadastro.exceptions.ChassiExistenteException;
import br.edu.ufape.poo.projeto.cadastro.exceptions.ClienteFisicoExistenteException;
import br.edu.ufape.poo.projeto.cadastro.exceptions.DateForaRangeException;
import br.edu.ufape.poo.projeto.cadastro.exceptions.FuncionarioExistenteException;
import br.edu.ufape.poo.projeto.cadastro.exceptions.ValorCompraNegativoException;
import br.edu.ufape.poo.projeto.cadastro.exceptions.ValorForaRangeException;
import br.edu.ufape.poo.projeto.cadastro.exceptions.ValorVazioExpection;
import br.edu.ufape.poo.projeto.cadastro.exceptions.VendaSemLucroException;

@SpringBootTest
public class TestOrdemVendaPessoaFisica {

	@Autowired
	private CadastroOrdemPessoaFisica cof;

	@Autowired
	private CadastroModelo cm;

	@Autowired
	private CadastroVeiculoNovo cvn;

	@Autowired
	private CadastroFuncionario cf;

	@Autowired
	private CadastroClienteFisico ccf;

	@SuppressWarnings("deprecation")
	@Test
	void cadastroOrdemPessoaFisica()
			throws ValorVazioExpection, ValorForaRangeException, DateForaRangeException, ChassiExistenteException,
			FuncionarioExistenteException, ClienteFisicoExistenteException, VendaSemLucroException, ValorCompraNegativoException {

		Modelo mo = new Modelo("Hyundai ", "HB20", "1.6", "Azul Escuro", 2010, 78, 5, 110, "Manual", "Gasolina");
		cm.save(mo);
		Funcionario f = new Funcionario("133.446.787-01", "Robert Freire de Melo", new Date(2000 - 1900, 0, 3),
				"(81)94002-4338", new Endereco("55380-000", "Rua Genuíno Cândido de Souza", "Arcoverde", "PE", 61),
				4000, "Gerente");
		cf.save(f);
		ClienteFisico cf = new ClienteFisico("203.321.302-15", "Gabrielly Carla Moraes", new Date(2000 - 1900, 0, 3),
				"(62)92892-9164", new Endereco("74630-310", "Rua L 14", "Goiânia", "GO", 350));
		ccf.save(cf);

		VeiculoNovo vn2 = new VeiculoNovo(1202000, 1500200, false, "8AHS3cyA33f5N6170", "Sim", mo);
		cvn.save(vn2);

		OrdemVendaPessoaFisica of = new OrdemVendaPessoaFisica(15000, vn2, true, new Date(2023 - 1900, 1, 2), "Debito",
				false, false, f, cf);
		cof.save(of);

	}
	/*
	 * @Test void findPagoByOrdemFisica() {
	 * 
	 * List<OrdemVendaPessoaFisica> pessoas = cof.findByPago(true); for
	 * (OrdemVendaPessoaFisica v : pessoas) { System.out.println("PAGO = " +
	 * v.toString()); } }
	 * 
	 * 
	 * @Test void findCodigoVendaByOrdemFisica() {
	 * 
	 * OrdemVendaPessoaFisica pessoas = cof.findById(2);
	 * System.out.println("CODIGO VENDA = " + pessoas.toString()); }
	 * 
	 * @Test void deleteCodVendaByOrdemFisica() {
	 * 
	 * List<OrdemVendaPessoaFisica> ordens = cof.findAll(); for
	 * (OrdemVendaPessoaFisica v : ordens) { System.out.println("EXISTE = " +
	 * v.toString()); } cof.deleteById(1);
	 * 
	 * }
	 */
}
