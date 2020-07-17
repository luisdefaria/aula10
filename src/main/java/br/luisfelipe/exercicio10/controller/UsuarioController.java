package br.luisfelipe.exercicio10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.luisfelipe.exercicio10.model.Usuario;
import br.luisfelipe.exercicio10.services.IUsuarioService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin("*")
public class UsuarioController {

    @Autowired
    private IUsuarioService servico;

    @GetMapping("/usuario")
    public ResponseEntity<List<Usuario>> mostrarTodos() {
        return ResponseEntity.ok(servico.buscarTodos());
    }

    @GetMapping("/usuario/{cod}")
    public ResponseEntity<Usuario> mostrarPorID(@PathVariable int cod) {
        Usuario user = servico.buscarUsuarioPorCodigo(cod);

        if (user != null) {
            return ResponseEntity.ok(user);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("usuario/find")    
    public ResponseEntity<Usuario> buscarPorNomeSenha(@RequestBody Usuario user) {
        Usuario usuario = servico.buscarNomeSenha(user.getNome(), user.getSenha());

        if (usuario != null) {
            return ResponseEntity.ok(usuario.getNome());
        }
        return ResponseEntity.notFound().build();

    }


}