package com.museo.modelo.servicios;

import java.util.List;
import com.museo.modelo.entidades.BienesPatrimoniales;

public interface BienesPatrimonialesService {
	
    List<BienesPatrimoniales> obtenerTodosLosBienesPatrimoniales();
    BienesPatrimoniales obtenerPorId(long id);
    BienesPatrimoniales crearBienesPatrimoniales(BienesPatrimoniales bienesPatrimoniales);
    List<BienesPatrimoniales> buscarBienesPorCondiciones(long ubicacion, long ambiente, long nivelpiso, long categoria);
    void eliminarBienesPatrimoniales(long id);
    BienesPatrimoniales actualizarBienesPatrimoniales(long id, BienesPatrimoniales bienesPatrimoniales);
}
