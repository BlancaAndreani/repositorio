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

import com.example.demo.GestorSalida;
import com.example.demo.modelo.entity.Patron;
import com.example.demo.modelo.entity.Salida;

@RestController
@RequestMapping("/api/v1/salida")
public class SalidaController {
	
	

		
		private final GestorSalida salidaController;
		 
		 public SalidaController(GestorSalida salidaController) {
		 this.salidaController = salidaController;

		 	}
		 
		 
		



		@GetMapping("/{id}")
		public ResponseEntity<?> buscar(@PathVariable("id") int id){
		Salida sa =	salidaController.buscar(id);
		
		if(sa == null) {
			
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("salida no encontrado con ID: " + id);
			}

			return ResponseEntity.ok(sa);
			}
		

		@DeleteMapping("/eliminar/{id}")
			public String eliminar(@PathVariable("id") Integer id) {
				salidaController.eliminar(id);
				return "Eliminado correctamente";
		
			}
		
		
		@PutMapping("actualizar/{id}")
		public Salida Actualizar(Integer id, Salida salida) {
	        Salida salida2 = salidaController.buscar(id);

	        if (salida2 == null) {
	            return null;
	        }
	        return salidaController.Actualizar(salida2);
		}
		
		@PostMapping("/crear")
		public ResponseEntity<?> crear(@RequestBody Salida nuevoS){
			Salida salidaCreada = salidaController.crear(nuevoS);
			if (salidaCreada != null) {
				return new ResponseEntity<>(salidaCreada, HttpStatus.CREATED);
			} else {
				return new ResponseEntity<>("Error al crear", HttpStatus.INTERNAL_SERVER_ERROR);
			}

}
}