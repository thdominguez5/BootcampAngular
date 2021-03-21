package com.everis.bootCamp.SpringAngularCrud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.bootCamp.SpringAngularCrud.entities.Empleado;
import com.everis.bootCamp.SpringAngularCrud.repositories.EmpleadoRepository;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{

	@Autowired
	private EmpleadoRepository empleadoRepository;
	
	@Override
	public List<Empleado> findAll() {
		return this.empleadoRepository.findAll();
	}

	@Override
	public Empleado findById(Long id) {
		return this.empleadoRepository.findById(id).get();
	}

	@Override
	public Empleado insertEmpleado(Empleado empleado) {
		return this.empleadoRepository.save(empleado);
	}

	@Override
	public void deleteEmpleado(Long id) {
		this.empleadoRepository.deleteById(id);
		
	}

}
