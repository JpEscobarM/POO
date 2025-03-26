package br.com.criandoapi.projetoAPI.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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

import br.com.criandoapi.projetoAPI.DAO.IUsuario;
import br.com.criandoapi.projetoAPI.model.Usuario;

@RestController
@CrossOrigin("*") //LIBERA AS PORTAS LOCALMENTE
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	private IUsuario dao; //implementa os metodos da interface IUsuario
	
	
	@GetMapping
	public ResponseEntity<List<Usuario>> listaUsuarios() {
		
		List<Usuario> lista =	(List<Usuario>) dao.findAll();
		//faz a pesquisa no banco com dao.findALL, faz o Casting pra LIST de Usuario
		//atribui a variavel "lista" e retorna ela com um status específico (200);
		
		return ResponseEntity.status(200).body(lista);
	}
	
	@PostMapping
	public ResponseEntity<Usuario> criarUsuario(@RequestBody Usuario user)
	{
		/*
		 * USA O DAO PARA SALVAR NO BANCO E ATRIBUI O RETORNO PARA NOVOUSUARIO
		 */
		Usuario novoUsuario = dao.save(user);
		
		
		return ResponseEntity.status(201).body(novoUsuario);
	}
	
	@PutMapping 
	public ResponseEntity<Usuario> editarUsuario(@RequestBody Usuario usuario)
	{
		Usuario usuarioModificado = dao.save(usuario);
		return ResponseEntity.status(201).body(usuarioModificado);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deletarUsuario(@PathVariable Integer id)
	{
		dao.deleteById(id);
		
		return ResponseEntity.status(204).build();
	}
	
}
