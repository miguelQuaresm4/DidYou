package com.miguelquaresm4.didyou.repository;

import com.miguelquaresm4.didyou.model.Usuario;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
}
