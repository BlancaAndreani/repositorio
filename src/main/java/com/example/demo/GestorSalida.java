package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.entity.Patron;
import com.example.demo.modelo.entity.Salida;
import com.example.demo.modelo.entity.Socio;
import com.example.demo.modelo.persist.SalidaRepository;
import com.example.demo.modelo.persist.SocioRepository;
@Service
public class GestorSalida {

	@Autowired
	private SalidaRepository saDao;
	
	public Salida crear(Salida sa) {
		if(sa.getDestino().isEmpty()) {
			
			return null;
		
		
		} return saDao.save(sa);
	
	}
	
	public void eliminar(int id) {
		saDao.deleteById(id);
	}
	
	public Salida buscar(int idSalida) {
		Optional<Salida> salida = saDao.findById(idSalida);
        return salida.orElse(null);
		}
	
	public Salida Actualizar(Salida sa) {
		if(sa.getDestino().isEmpty()) {
			
			return null;
		
		
		} return saDao.save(sa);
	
	}
	
	
	
}
