package com.omar.demo.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Libros")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_libro")
    private Integer id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "genero")
    private String genero;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "autor")
    private String autor;

    @Column(name = "editorial")
    private String editorial;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "cantidad_total")
    private int cantidadTotal;

    @Column(name = "cantidad_disponible")
    private int cantidadDisponible;

    @Column(name = "portada_url")
    private String portada;

    @Column(name = "estatus")
    private String estatus;

}
