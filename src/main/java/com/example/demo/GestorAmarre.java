package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.modelo.entity.Amarre;
import com.example.demo.modelo.entity.Barco;
import com.example.demo.modelo.persist.AmarreRepository;


public class GestorAmarre  {
	@Autowired
	private AmarreRepository amDao;
	
	public Amarre crear(Amarre amarre) {
        try {
          
 
            return amDao.save(amarre);
        } catch (Exception e) {
         return null;
        }
	}
	public void eliminar(int id) {
		amDao.deleteById(id);
	}
	
	public Amarre buscar(int idAmarre) {
		Optional<Amarre> amarre = amDao.findById(idAmarre);
        return amarre.orElse(null);
	}
	
	
	public Amarre Actualizar(Amarre am) {
	if(am != null) {
	
		
		return amDao.save(am);
	
	
	} 

	return null;
	}
}
