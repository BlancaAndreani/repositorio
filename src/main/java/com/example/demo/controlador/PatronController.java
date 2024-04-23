package com.example.demo.controlador;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.GestorBarco;
import com.example.demo.GestorPatron;
import com.example.demo.modelo.entity.Barco;
import com.example.demo.modelo.entity.Patron;

@RestController
@RequestMapping("/api/v1/patron")
public class PatronController {
	
	private final GestorPatron patronController;
	 
	 public PatronController(GestorPatron patronController) {
	 this.patronController = patronController;

	 	}



	@GetMapping("/{id}")
	public ResponseEntity<?> buscar(@PathVariable("id") Integer id){
	Patron pb =	patronController.buscar(id);
	
	if(pb == null) {
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("patron no encontrado con ID: " + id);
		}

		return ResponseEntity.ok(pb);
		}
	

	@DeleteMapping("/eliminar/{id}")
		public String eliminar(@PathVariable("id") Integer id) {
			patronController.eliminar(id);
			return "Eliminado correctamente";
	
		}
	
	
	@PutMapping("actualizar/{id}")
	public Patron Actualizar(Integer id, Patron patron) {
        Patron patron2 = patronController.buscar(id);

        if (patron2 == null) {
            return null;
        }
        return patronController.Actualizar(patron2);
	}
	
	
	@PostMapping("/crear")
	public ResponseEntity<?> crear(@RequestBody Patron nuevoP){
		Patron patronCreado = patronController.crear(nuevoP);
		if (patronCreado != null) {
			return new ResponseEntity<>(patronCreado, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<>("Error al crear", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}


}
