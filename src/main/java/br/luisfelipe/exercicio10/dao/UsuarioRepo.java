package br.luisfelipe.exercicio10.dao;

import org.springframework.data.repository.CrudRepository;

import br.luisfelipe.exercicio10.model.Usuario;

public interface UsuarioRepo extends CrudRepository<Usuario,Integer>{

    public Usuario findByNomeAndSenha(String nome, String senha);


}
    