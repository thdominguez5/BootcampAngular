package com.everis.bootCamp.SpringAngularCrud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.bootCamp.SpringAngularCrud.entities.Empleado;
import com.everis.bootCamp.SpringAngularCrud.services.EmpleadoService;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {

	@Autowired
	private EmpleadoService empleadoService;
	
	@GetMapping
	public List<Empleado> findAll(){
		return this.empleadoService.findAll();
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable(value="id") Long empleadoId) {
		this.empleadoService.deleteEmpleado(empleadoId);
	}
	
	@PostMapping
	public Empleado create(@RequestBody Empleado empleado) {
		System.out.println(empleado);
		return this.empleadoService.insertEmpleado(empleado);
	}
	
	
	
	
}
