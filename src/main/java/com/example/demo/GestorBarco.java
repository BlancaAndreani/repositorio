package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.entity.Barco;
import com.example.demo.modelo.entity.Patron;
import com.example.demo.modelo.persist.BarcoRepository;
@Service
public class GestorBarco {

	@Autowired
	private BarcoRepository bDao;
	
	public Barco crear(Barco b) {
		if(b.getNombreBarco().isEmpty()) {
			
			return null;
		
		
		} return bDao.save(b);
	
	}
	
	public void eliminar(int id) {
		bDao.deleteById(id);
	}
	
	public Barco buscar(int idBarco) {
		Optional<Barco> barco = bDao.findById(idBarco);
        return barco.orElse(null);
}
	
	
	public Barco Actualizar(Barco b) {
		if(b.getNombreBarco().isEmpty()) {
			
			return null;
		
		
		} return bDao.save(b);
	
	}
	
}
