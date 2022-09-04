package br.edu.ufape.poo.projeto.repositorio;
import br.edu.ufape.poo.projeto.basica.ClienteFisico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface RepositorioClienteFisico extends JpaRepository<ClienteFisico, Long>{

	ClienteFisico findByCpf(String cpf);

	void deleteByCpf(String cpf);
	ClienteFisico findByNomePF(String nome);

}