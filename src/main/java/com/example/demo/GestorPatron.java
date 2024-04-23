package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.entity.Patron;
import com.example.demo.modelo.entity.Salida;
import com.example.demo.modelo.entity.Socio;
import com.example.demo.modelo.persist.PatronRepository;
import com.example.demo.modelo.persist.SocioRepository;
@Service
public class GestorPatron {
	
	@Autowired
	private PatronRepository pDao;
	
	public Patron crear(Patron p) {
		if(p.getNombrePat().isEmpty()) {
			
			return null;
		
		
		} return pDao.save(p);
	
	}
	
	public void eliminar(int id) {
		pDao.deleteById(id);
	}
	
	  public Patron buscar(Integer idPatron) {
	    	Optional<Patron> patron = pDao.findById(idPatron);
	            return patron.orElse(null);
	    }
	    
	public Patron Actualizar(Patron p) {
		if(p.getNombrePat().isEmpty()) {
			
			return null;
		
		
		} return pDao.save(p);
	
	}

}
