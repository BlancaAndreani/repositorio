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

import com.example.demo.GestorSocio;
import com.example.demo.modelo.entity.Socio;


@RestController
@RequestMapping("/api/v1/socio")

public class SocioController {
	
	 private GestorSocio socioController;

	public SocioController(GestorSocio socioController) {
		 this.socioController = socioController;

		 	}



		@GetMapping("/{id}")
		public ResponseEntity<?> buscar(@PathVariable("id") Integer id){
		 Socio s = socioController.buscar(id);
		if(s == null) {
			
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("socio no encontrado con ID: " + id);
			}

			return ResponseEntity.ok(s);
			}



		@DeleteMapping("/eliminar/{id}")
			public String eliminar(@PathVariable("id") Integer id) {
				socioController.eliminar(id);
				return "Eliminado correctamente";

			}

		@PutMapping("actualizar/{id}")
		public Socio Actualizar(Integer id, Socio socio) {
		   Socio socio2 = socioController.buscar(id);
		    if (socio2 == null) {
		        return null;
		    }
		    return socioController.Actualizar(socio2);
		}

		@PostMapping("/crear")
		public ResponseEntity<?> crear(@RequestBody Socio nuevoS){
			Socio socioCreado = socioController.crear(nuevoS);
			if (socioCreado != null) {
				return new ResponseEntity<>(socioCreado, HttpStatus.CREATED);
			} else {
				return new ResponseEntity<>("Error al crear", HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}



}
