package com.ejercicio.ejerciciotallerfinal.persistence.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "atencion", schema = "armada")
public class Atention {
    @Id
    @Column(name = "id_atencion")
    private Integer idAtention;
    @Column(name = "nombre_unidad_armda_nacional")
    private String nomAtention;
    @Column(name = "nombre_gestor")
    private String nomGestor;
    @Column(name = "email_gestor")
    private String emailGestor;
    @Column(name = "direccion_unidad")
    private String dirUnidad;
    @Column(name = "ciudad")
    private String ciud;
    @Column(name = "departamento")
    private String depart;

    public String getNomGestor() {
        return nomGestor;
    }

    public void setNomGestor(String nomGestor) {
        this.nomGestor = nomGestor;
    }

    public Integer getIdAtention() {
        return idAtention;
    }

    public void setIdAtention(Integer idAtention) {
        this.idAtention = idAtention;
    }

    public String getNomAtention() {
        return nomAtention;
    }

    public void setNomAtention(String nomAtention) {
        this.nomAtention = nomAtention;
    }

    public String getEmailGestor() {
        return emailGestor;
    }

    public void setEmailGestor(String emailGestor) {
        this.emailGestor = emailGestor;
    }

    public String getDirUnidad() {
        return dirUnidad;
    }

    public void setDirUnidad(String dirUnidad) {
        this.dirUnidad = dirUnidad;
    }

    public String getCiud() {
        return ciud;
    }

    public void setCiud(String ciud) {
        this.ciud = ciud;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }
}
