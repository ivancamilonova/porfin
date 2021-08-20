package com.ejercicio.ejerciciotallerfinal.domain.dto;

import io.swagger.annotations.ApiModelProperty;

public class Atencion {
    @ApiModelProperty(notes = "consecutivo id")
    private Integer idatencionId;
    @ApiModelProperty(notes = "nombre unidad ARC")
    private String nombreunidadarmdanacionalId;
    @ApiModelProperty(notes = "nombre gestor")
    private String nombregestorId;
    @ApiModelProperty(notes = "email gestor")
    private String emailgestorId;
    @ApiModelProperty(notes = "direccion unidad")
    private String direccionunidadId;
    @ApiModelProperty(notes = "ciudad")
    private String ciudadId;
    @ApiModelProperty(notes = "departamento")
    private String departamentoId;

    public Integer getIdatencionId() {
        return idatencionId;
    }

    public void setIdatencionId(Integer idatencionId) {
        this.idatencionId = idatencionId;
    }

    public String getNombreunidadarmdanacionalId() {
        return nombreunidadarmdanacionalId;
    }

    public void setNombreunidadarmdanacionalId(String nombreunidadarmdanacionalId) {
        this.nombreunidadarmdanacionalId = nombreunidadarmdanacionalId;
    }

    public String getNombregestorId() {
        return nombregestorId;
    }

    public void setNombregestorId(String nombregestorId) {
        this.nombregestorId = nombregestorId;
    }

    public String getEmailgestorId() {
        return emailgestorId;
    }

    public void setEmailgestorId(String emailgestorId) {
        this.emailgestorId = emailgestorId;
    }

    public String getDireccionunidadId() {
        return direccionunidadId;
    }

    public void setDireccionunidadId(String direccionunidadId) {
        this.direccionunidadId = direccionunidadId;
    }

    public String getCiudadId() {
        return ciudadId;
    }

    public void setCiudadId(String ciudadId) {
        this.ciudadId = ciudadId;
    }

    public String getDepartamentoId() {
        return departamentoId;
    }

    public void setDepartamentoId(String departamentoId) {
        this.departamentoId = departamentoId;
    }
}
