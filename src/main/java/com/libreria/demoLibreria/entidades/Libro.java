
package com.libreria.demoLibreria.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Libro {
    @Id
    @GeneratedValue(generator="uuid")
    @GenericGenerator(name= "uuid", strategy="uuid2")
    private String id;
    private Long isbn;
    private String titulo;
    private Integer anio;
    private Integer ejemplares;
    private Integer ejemplaresprestados;
    private Integer ejemplaresrestantes;
    private Boolean alta;
    @OneToOne
   private Autor autor;
    @OneToOne
   private Editorial editorial;

    public Libro() {
    }

    public Libro(String id, Long isbn, String titulo, Integer anio, Integer ejemplares, Integer ejemplaresprestados, Integer ejemplaresrestantes, Boolean alta, Autor autor, Editorial editorial) {
        this.id = id;
        this.isbn = isbn;
        this.titulo = titulo;
        this.anio = anio;
        this.ejemplares = ejemplares;
        this.ejemplaresprestados = ejemplaresprestados;
        this.ejemplaresrestantes = ejemplaresrestantes;
        this.alta = alta;
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Integer ejemplares) {
        this.ejemplares = ejemplares;
    }

    public Integer getEjemplaresprestados() {
        return ejemplaresprestados;
    }

    public void setEjemplaresprestados(Integer ejemplaresprestados) {
        this.ejemplaresprestados = ejemplaresprestados;
    }

    public Integer getEjemplaresrestantes() {
        return ejemplaresrestantes;
    }

    public void setEjemplaresrestantes(Integer ejemplaresrestantes) {
        this.ejemplaresrestantes = ejemplaresrestantes;
    }

    public Boolean getAlta() {
        return alta;
    }

    public void setAlta(Boolean alta) {
        this.alta = alta;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
   
   
    
}
