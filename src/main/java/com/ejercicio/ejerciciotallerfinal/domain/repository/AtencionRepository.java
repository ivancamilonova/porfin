package com.ejercicio.ejerciciotallerfinal.domain.repository;

import com.ejercicio.ejerciciotallerfinal.domain.dto.Atencion;

import java.util.List;
import java.util.Optional;

public interface AtencionRepository {
    List<Atencion> getAll();
    Optional<Atencion> getAtention(int AtentionId);
}
