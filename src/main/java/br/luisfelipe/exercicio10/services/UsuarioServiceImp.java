package br.luisfelipe.exercicio10.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.luisfelipe.exercicio10.dao.UsuarioRepo;
import br.luisfelipe.exercicio10.model.Usuario;

@Component
public class UsuarioServiceImp implements IUsuarioService {

    @Autowired
    private UsuarioRepo repo;
    
    @Override
    public Usuario buscarNomeSenha(String nome, String senha) {
        return repo.findByNomeAndSenha(nome, senha);
    }

    @Override
    public List<Usuario> buscarTodos() {
        return (List<Usuario>) repo.findAll();
    }

    @Override
    public Usuario buscarUsuarioPorCodigo(int cod) {
        return repo.findById(cod).get();
    }
    
    
}