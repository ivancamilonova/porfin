package com.ejercicio.ejerciciotallerfinal.persistence;

import com.ejercicio.ejerciciotallerfinal.domain.dto.Atencion;
import com.ejercicio.ejerciciotallerfinal.domain.repository.AtencionRepository;
import com.ejercicio.ejerciciotallerfinal.persistence.crud.AtentionCrudRepository;
import com.ejercicio.ejerciciotallerfinal.persistence.entity.Atention;
import com.ejercicio.ejerciciotallerfinal.persistence.mapper.AtencionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AtentionRepository implements AtencionRepository {
    @Autowired
    private AtentionCrudRepository AtentionCrudRepository;
    @Autowired
    private AtencionMapper Mapper;

    @Override
    public List<Atencion> getAll(){
        List<Atention> atentions= (List<Atention>) AtentionCrudRepository.findAll();
        return Mapper.toAtencions(atentions);
    }
    
    @Override
    public Optional<Atencion> getAtention(int IdAtention){
        return AtentionCrudRepository.findById(IdAtention).map(atention -> Mapper.toAtencion(atention));
    }
}

