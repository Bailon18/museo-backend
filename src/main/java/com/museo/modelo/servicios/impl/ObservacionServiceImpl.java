package com.museo.modelo.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.museo.modelo.entidades.Observacion;
import com.museo.modelo.entidades.ObservacionBienPatrimonial;
import com.museo.modelo.entidades.ObservacionVitrina;
import com.museo.modelo.repositorios.ObservacionBienPatrimonialRepository;
import com.museo.modelo.repositorios.ObservacionRepository;
import com.museo.modelo.repositorios.ObservacionVitrinaRepository;
import com.museo.modelo.servicios.ObservacionService;
import com.museo.util.ObservacionDetalleDTO;

import java.util.ArrayList;
import java.util.List;

@Service
public class ObservacionServiceImpl implements ObservacionService {
    
	
	@Autowired
	private ObservacionRepository observacionRepository;
	
	@Autowired
	private ObservacionBienPatrimonialRepository observacionBienPatrimonialRepository;
	
	@Autowired
	private ObservacionVitrinaRepository observacionVitrinaRepository;


    @Override
    public Observacion guardarObservacion(Observacion observacion) {
        Observacion nuevaObservacion = observacionRepository.save(observacion);
        String formatoCodigo = "O-VIT" + String.format("%05d", nuevaObservacion.getId());
        nuevaObservacion.setCodigoObservacion(formatoCodigo);
        return observacionRepository.save(nuevaObservacion);
    }

    @Override
    public ObservacionDetalleDTO obtenerObservacionPorId(long id) {
    	
    	List<ObservacionBienPatrimonial> listaObservacionBP = observacionBienPatrimonialRepository.listadoOBPxObservacion(id);
    	ObservacionVitrina observacionVitrina = observacionVitrinaRepository.listadoOvitrinaxObservacion(id);
    	
        return new ObservacionDetalleDTO(listaObservacionBP, observacionVitrina) ;
    }

    @Override
    public List<Observacion> obtenerTodasLasObservaciones() {
        return observacionRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }

    @Override
    public void eliminarObservacion(long id) {
        observacionRepository.deleteById(id);
    }
    
    @Override
    public List<Object[]> getObservationReport() {
    	
    	List<Object[]>  reporte1 = observacionRepository.getObservationReport1();
    	List<Object[]> reporte2 = observacionRepository.getObservationReport2();
    	
    	return combineReports(reporte1, reporte2);
    }
    
    public List<Object[]> combineReports(List<Object[]> report1, List<Object[]> report2) {
        List<Object[]> combinedReport = new ArrayList<>();

        for (int i = 0; i < report1.size(); i++) {
            Object[] row1 = report1.get(i);
            Object[] row2 = report2.get(i);

            Object[] combinedRow = new Object[row1.length + row2.length];

            // Copia los elementos de report1 en combinedRow
            System.arraycopy(row1, 0, combinedRow, 0, row1.length);

            // Copia los elementos de report2 en combinedRow, comenzando después de los elementos de report1
            System.arraycopy(row2, 0, combinedRow, row1.length, row2.length);

            // Agrega la fila combinada al informe combinado
            combinedReport.add(combinedRow);
        }

        return combinedReport;
    }

}
