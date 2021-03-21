package com.everis.bootCamp.SpringAngularCrud.services;

import java.util.List;

import com.everis.bootCamp.SpringAngularCrud.entities.Empleado;

public interface EmpleadoService {

	List<Empleado> findAll();
	
	Empleado findById(Long id);
	
	Empleado insertEmpleado(Empleado empleado);
	
	void deleteEmpleado(Long id);
}
