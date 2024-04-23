package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.entity.Barco;
import com.example.demo.modelo.entity.Salida;
import com.example.demo.modelo.entity.Socio;
import com.example.demo.modelo.persist.BarcoRepository;
import com.example.demo.modelo.persist.SocioRepository;
@Service
public class GestorSocio {
	
	
	@Autowired
	private SocioRepository sDao;
	
	public Socio crear(Socio s) {
		if(s.getNombre().isEmpty()) {
			
			return null;
		
		
		} return sDao.save(s);
	
	}
	
	public void eliminar(int id) {
		sDao.deleteById(id);
	}
	
	public Socio buscar(int idSocio) {
		Optional<Socio> socio = sDao.findById(idSocio);
        return socio.orElse(null);
		}
		
	
	
	
	public Socio Actualizar(Socio s) {
		if(s.getNombre().isEmpty()) {
			
			return null;
		
		
		} return sDao.save(s);
	
	}

}
