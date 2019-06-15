package br.com.iago.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import br.com.iago.model.PessoaModel;

//Interface CRUD
public interface PessoaRepository extends Repository<PessoaModel, Integer>{
	
	//Metodos para salvar pessoa
	void save(PessoaModel pessoa);
	
	//Metodos para deletar
	void delete(PessoaModel pessoa);
	
	//Metodos para buscar várias pessoas
	List<PessoaModel>findAll();
	
	//Metodos para buscar uma pessoa
	PessoaModel findOne(Integer id);

}
