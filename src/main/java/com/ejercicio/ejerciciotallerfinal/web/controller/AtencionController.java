package com.ejercicio.ejerciciotallerfinal.web.controller;


import com.ejercicio.ejerciciotallerfinal.domain.dto.Atencion;
import com.ejercicio.ejerciciotallerfinal.domain.service.AtencionService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/atencions")
public class AtencionController {
    @Autowired
    private AtencionService atencionService;

    @ApiOperation("informacion de todos los centros de atencion")
    @GetMapping("/all")
    public List<Atencion> getAll() {return atencionService.getAll(); }

    @ApiOperation("infromacion seleccionada")
    @GetMapping("/{id}")
    public Optional<Atencion> getAtencion(@ApiParam(value = "id seleccionado", required = true, example = "7") @PathVariable("id") Integer atentionId){
        return atencionService.getAtencion(atentionId);
    }
}
