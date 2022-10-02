package br.edu.ufape.poo.projeto.cadastro;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.edu.ufape.poo.projeto.basica.ClienteFisico;
import br.edu.ufape.poo.projeto.exceptions.ClienteFisicoExistenteException;
import br.edu.ufape.poo.projeto.exceptions.DataNulaException;
import br.edu.ufape.poo.projeto.exceptions.ValorNuloExpection;
import br.edu.ufape.poo.projeto.repositorio.RepositorioClienteFisico;

@Service
@Transactional
public class CadastroClienteFisico {

	@Autowired
	private RepositorioClienteFisico repositorioClienteFisico;

	public ClienteFisico save(ClienteFisico entity)
			throws DataNulaException, ValorNuloExpection, ClienteFisicoExistenteException {
		if (entity.getNome().isEmpty() || entity.getCpf().isEmpty() || entity.getEndereco().getCidade().isEmpty()
				|| entity.getEndereco().getEstado().isEmpty() || entity.getEndereco().getRua().isEmpty()
				|| entity.getEndereco().getCep().isEmpty() || entity.getTelefone().isEmpty()) {
			throw new ValorNuloExpection();
		} else {
			if (Objects.isNull(entity.getDataNascimento())) {
				throw new DataNulaException();
			} else {

				if (Objects.isNull(findByCpf(entity.getCpf()))) {
					return repositorioClienteFisico.save(entity);
				} else {
					throw new ClienteFisicoExistenteException();
				}
			}
		}
	}
	
	public ClienteFisico update(ClienteFisico entity) {
		return repositorioClienteFisico.save(entity);
	}
	
	public void deleteByCpf(String cpf) {
		repositorioClienteFisico.deleteByCpf(cpf);
	}

	public void deleteById(long id) {

		repositorioClienteFisico.deleteById(id);
	}

	public void delete(ClienteFisico entity) {
		repositorioClienteFisico.delete(entity);
	}

	public ClienteFisico findByCpf(String cpf) { 
		return repositorioClienteFisico.findByCpf(cpf);
	}

	public ClienteFisico findByNome(String nome) {
		return repositorioClienteFisico.findByNome(nome);
	}

	public ClienteFisico findById(long id) {
		return repositorioClienteFisico.findById(id);
	}

	public List<ClienteFisico> findAll() {
		return repositorioClienteFisico.findAll();
	}
	
}
