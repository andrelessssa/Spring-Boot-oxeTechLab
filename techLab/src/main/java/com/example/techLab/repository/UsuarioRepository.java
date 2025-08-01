package com.example.techLab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.techLab.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
}
