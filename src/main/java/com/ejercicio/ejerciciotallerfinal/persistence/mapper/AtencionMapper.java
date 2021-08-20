package com.ejercicio.ejerciciotallerfinal.persistence.mapper;


import com.ejercicio.ejerciciotallerfinal.domain.dto.Atencion;
import com.ejercicio.ejerciciotallerfinal.persistence.entity.Atention;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;


import java.util.List;

@Mapper(componentModel = "spring")
public interface AtencionMapper {
    @Mappings(
            {
                    @Mapping(source = "idAtention",target = "idatencionId"),
                    @Mapping(source = "nomAtention",target = "nombreunidadarmdanacionalId"),
                    @Mapping(source = "nomGestor",target = "nombregestorId"),
                    @Mapping(source = "emailGestor",target = "emailgestorId"),
                    @Mapping(source = "dirUnidad",target = "direccionunidadId"),
                    @Mapping(source = "ciud",target = "ciudadId"),
                    @Mapping(source = "depart",target = "departamentoId"),
            }
    )
    Atencion toAtencion(Atention atention);
    List<Atencion> toAtencions(List<Atention> atentiones);

    @InheritInverseConfiguration
    Atention toAtention(Atencion atencions);

}
