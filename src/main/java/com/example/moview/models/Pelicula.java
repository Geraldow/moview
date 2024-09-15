package com.example.moview.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ID autogenerate
    @Basic( optional = false ) // Required field
    @Column( name = "id")
    Integer id;

    @Column( name = "titulo" )
    String titulo;

    @Column( name = "duracion" )
    Integer duracion;

    @Column( name = "clasificacion" )
    String clasificacion;

    @Column( name = "idioma" )
    String idioma;

    @Column( name = "formato" )
    String formato;

    @Column( name = "trama" )
    String trama;

    @Column( name = "director" )
    String director;
}
