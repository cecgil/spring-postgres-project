package com.cecgil.projeto_full_stack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cecgil.projeto_full_stack.dto.UsuarioDTO;
import com.cecgil.projeto_full_stack.entity.UsuarioEntity;
import com.cecgil.projeto_full_stack.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<UsuarioDTO> listarTodos() {
		List<UsuarioEntity> usuarios =  usuarioRepository.findAll();
		return usuarios.stream().map(UsuarioDTO::new).toList();		
	}
	
	public void inserir(UsuarioDTO usuario) {
		UsuarioEntity usuarioEntity = new UsuarioEntity(usuario);
		usuarioRepository.save(usuarioEntity);
	}

	public UsuarioDTO alterar(UsuarioDTO usuario) {
	    UsuarioEntity existe = new UsuarioEntity(usuario);
	    return new UsuarioDTO(usuarioRepository.save(existe));

	}
	
	public void excluir(Long id) {
		UsuarioEntity usuario = usuarioRepository.findById(id).get();
		usuarioRepository.delete(usuario);
	}
}
