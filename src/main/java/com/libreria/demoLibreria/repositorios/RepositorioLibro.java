/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.libreria.demoLibreria.repositorios;

import com.libreria.demoLibreria.entidades.Libro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioLibro extends JpaRepository<Libro, String>{
    @Query("SELECT c FROM Libro c WHERE c.id = :id")
    public Libro buscarlibroxid(@Param("id")String id);
   
    
}
