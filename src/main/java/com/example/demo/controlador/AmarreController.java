package com.example.demo.controlador;

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

import com.example.demo.GestorAmarre;
import com.example.demo.modelo.entity.Amarre;

@RestController
@RequestMapping("/api/v1/amarre")


public class AmarreController {
	

	
		
	 private final GestorAmarre amarreController ;
	 
	 public AmarreController(GestorAmarre amarreController) {
	 this.amarreController = amarreController;

	 	}



	@GetMapping("/{id}")
	public ResponseEntity<?> buscar(@PathVariable("id") Integer id){
		Amarre am = amarreController.buscar(id);
	if(am == null) {
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("amarre no encontrado con ID: " + id);
		}

		return ResponseEntity.ok(am);
		}



	@DeleteMapping("/eliminar/{id}")
		public String eliminar(@PathVariable("id") Integer id) {
			amarreController.eliminar(id);
			return "Eliminado correctamente";

		}

	@PutMapping("actualizar/{id}")
	public Amarre Actualizar(Integer id, Amarre amarre) {
	   Amarre amarre2 = amarreController.buscar(id);
	    if (amarre2 == null) {
	        return null;
	    }
	    return amarreController.Actualizar(amarre2);
	}

	@PostMapping("/crear")
	public ResponseEntity<?> crear(@RequestBody Amarre nuevoA){
		Amarre amarreCreado = amarreController.crear(nuevoA);
		if (amarreCreado != null) {
			return new ResponseEntity<>(amarreCreado, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<>("Error al crear", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
