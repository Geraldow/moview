package com.autocine.moview.models;

// import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@EqualsAndHashCode
@SuperBuilder
// @AllArgsConstructor

@Entity
@Table( name = "pelicula" )
@XmlRootElement
@NamedQueries({
        @NamedQuery( name = "Pelicula.findALl", query = "SELECT p FROM pelicula p" ),
        @NamedQuery( name = "Pelicula.findById", query = "SELECT p FROM pelicula p WHERE p.id = : id" ),
        @NamedQuery( name = "Pelicula.findByTitulo", query = "SELECT p FROM pelicula p WHERE p.titulo = : titulo" ),
        @NamedQuery( name = "Pelicula.findByDuracion", query = "SELECT p FROM pelicula p WHERE p.duracion = : duracion"),
        @NamedQuery( name = "Pelicula.findByClasificacion", query = "SELECT p FROM pelicula p.clasificacion = : clasificacion" ),
        @NamedQuery( name = "Pelicula.findByIdioma", query = "SELECT p FROM pelicula p.idioma = : idioma" ),
        @NamedQuery( name = "Pelicula.findByCategoria", query = "SELECT p FROM pelicula p.categoria = : categoria" ),
        @NamedQuery( name = "Pelicula.findByFormato", query = "SELECT p FROM pelicula p.formato = : formato" ),
        @NamedQuery( name = "Pelicula.findByTrama", query = "SELECT p FROM pelicula p.trama = : trama" ),
        @NamedQuery( name = "Pelicula.findByDirector", query = "SELECT p FROM pelicula p.director = : director" )
})


public class Pelicula {
    private Integer id;
    private String titulo;
    private Double duracion;
    private String clasificacion;
    private String idioma;
    private String categoria;
    private String formato;
    private String trama;
    private String director;

    public Pelicula() {
    }

    public Pelicula(Integer id, String titulo, Double duracion, String clasificacion, String idioma, String categoria, String formato, String trama, String director) {
        this.id = id;
        this.titulo = titulo;
        this.duracion = duracion;
        this.clasificacion = clasificacion;
        this.idioma = idioma;
        this.categoria = categoria;
        this.formato = formato;
        this.trama = trama;
        this.director = director;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getTrama() {
        return trama;
    }

    public void setTrama(String trama) {
        this.trama = trama;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
