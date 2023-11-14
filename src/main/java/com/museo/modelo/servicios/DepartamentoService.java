package com.museo.modelo.servicios;

import java.util.List;

import com.museo.modelo.entidades.Departamento;

public interface DepartamentoService {

	List<Departamento> obtenerDepartamentosPorPais(Long paisId);
}
