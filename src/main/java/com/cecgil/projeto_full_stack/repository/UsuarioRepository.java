package com.cecgil.projeto_full_stack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cecgil.projeto_full_stack.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

}
