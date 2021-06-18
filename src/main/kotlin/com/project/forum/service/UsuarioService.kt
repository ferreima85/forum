package com.project.forum.service

import com.project.forum.model.Usuario
import com.project.forum.repository.UsuarioRepository
import org.springframework.stereotype.Service

@Service
class UsuarioService (private val repository: UsuarioRepository) {

    fun buscarPorId(id: Long): Usuario {
        return repository.getOne(id)
    }
}