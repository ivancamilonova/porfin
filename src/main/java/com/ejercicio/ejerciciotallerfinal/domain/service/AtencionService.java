package com.ejercicio.ejerciciotallerfinal.domain.service;

import com.ejercicio.ejerciciotallerfinal.domain.dto.Atencion;
import com.ejercicio.ejerciciotallerfinal.domain.repository.AtencionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class AtencionService {
   @Autowired
    private AtencionRepository atencionRepository;

    public List<Atencion> getAll() { return atencionRepository.getAll();}

    public Optional<Atencion> getAtencion(int atencionId) { return atencionRepository.getAtention(atencionId);}


    }
