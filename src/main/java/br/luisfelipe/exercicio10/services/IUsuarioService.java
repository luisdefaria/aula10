package br.luisfelipe.exercicio10.services;

import java.util.List;

import br.luisfelipe.exercicio10.model.Usuario;

public interface IUsuarioService {
    public Usuario buscarUsuarioPorCodigo(int cod);
    public List<Usuario> buscarTodos();
    public Usuario buscarNomeSenha(String nome, String Senha);
    
}