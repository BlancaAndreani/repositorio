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
import com.example.demo.modelo.entity.Barco;
import com.example.demo.modelo.entity.Patron;
@RestController
@RequestMapping("/api/v1/barco")
public class BarcoController  {
	
 private final GestorBarco barcoController ;
 
 public BarcoController(GestorBarco barcoController) {
 this.barcoController = barcoController;

 	}



@GetMapping("/{id}")
public ResponseEntity<?> buscar(@PathVariable("id") Integer id){
	Barco bb = barcoController.buscar(id);
if(bb == null) {
	
	return ResponseEntity.status(HttpStatus.NOT_FOUND).body("barco no encontrado con ID: " + id);
	}

	return ResponseEntity.ok(bb);
	}



@DeleteMapping("/eliminar/{id}")
	public String eliminar(@PathVariable("id") Integer id) {
		barcoController.eliminar(id);
		return "Eliminado correctamente";

	}

@PutMapping("actualizar/{id}")
public Barco Actualizar(Integer id, Barco barco) {
   Barco barco2 = barcoController.buscar(id);
    if (barco2 == null) {
        return null;
    }
    return barcoController.Actualizar(barco2);
}

@PostMapping("/crear")
public ResponseEntity<?> crear(@RequestBody Barco nuevoB){
	Barco barcoCreado = barcoController.crear(nuevoB);
	if (barcoCreado != null) {
		return new ResponseEntity<>(barcoCreado, HttpStatus.CREATED);
	} else {
		return new ResponseEntity<>("Error al crear", HttpStatus.INTERNAL_SERVER_ERROR);
	}
}


}



