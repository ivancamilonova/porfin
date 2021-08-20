package com.ejercicio.ejerciciotallerfinal.persistence.mapper;

import com.ejercicio.ejerciciotallerfinal.domain.dto.Atencion;
import com.ejercicio.ejerciciotallerfinal.persistence.entity.Atention;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-08-19T20:56:56-0500",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.1.1.jar, environment: Java 11.0.12 (Eclipse Foundation)"
)
@Component
public class AtencionMapperImpl implements AtencionMapper {

    @Override
    public Atencion toAtencion(Atention atention) {
        if ( atention == null ) {
            return null;
        }

        Atencion atencion = new Atencion();

        atencion.setIdatencionId( atention.getIdAtention() );
        atencion.setNombreunidadarmdanacionalId( atention.getNomAtention() );
        atencion.setNombregestorId( atention.getNomGestor() );
        atencion.setEmailgestorId( atention.getEmailGestor() );
        atencion.setDireccionunidadId( atention.getDirUnidad() );
        atencion.setCiudadId( atention.getCiud() );
        atencion.setDepartamentoId( atention.getDepart() );

        return atencion;
    }

    @Override
    public List<Atencion> toAtencions(List<Atention> atentiones) {
        if ( atentiones == null ) {
            return null;
        }

        List<Atencion> list = new ArrayList<Atencion>( atentiones.size() );
        for ( Atention atention : atentiones ) {
            list.add( toAtencion( atention ) );
        }

        return list;
    }

    @Override
    public Atention toAtention(Atencion atencions) {
        if ( atencions == null ) {
            return null;
        }

        Atention atention = new Atention();

        atention.setIdAtention( atencions.getIdatencionId() );
        atention.setNomAtention( atencions.getNombreunidadarmdanacionalId() );
        atention.setNomGestor( atencions.getNombregestorId() );
        atention.setEmailGestor( atencions.getEmailgestorId() );
        atention.setDirUnidad( atencions.getDireccionunidadId() );
        atention.setCiud( atencions.getCiudadId() );
        atention.setDepart( atencions.getDepartamentoId() );

        return atention;
    }
}
