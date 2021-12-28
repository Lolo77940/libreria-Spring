
package com.libreria.demoLibreria.servicios;

import com.libreria.demoLibreria.entidades.Autor;
import com.libreria.demoLibreria.excepciones.Miexcepcion;
import com.libreria.demoLibreria.repositorios.RepositorioAutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorService {
    @Autowired   
    private RepositorioAutor ra;
    
    public void crearAutor(String nombre, Boolean alta) throws Miexcepcion{
        
        if (nombre==null || nombre.isEmpty()) {
            throw new Miexcepcion("El nombre no puede ser nulo");
        }
    Autor autor = new Autor();
    autor.setNombre(nombre);
    autor.setAlta(true);
   ra.save(autor);
}
    
    
}
