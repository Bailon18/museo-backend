package com.museo.util;

public class CodigoGenerador {
	
    public static String generarCodigo(String tipoEntidad, Long ultimoCodigo) {
    	
        String prefijo = tipoEntidad;
        String formato = "%s%05d";

        if (ultimoCodigo >= 10 && ultimoCodigo < 100) {
            formato = "%s%06d"; // Si el código está entre 10 y 99, usa un formato diferente
        } else if (ultimoCodigo >= 100) {
            formato = "%s%07d"; // Si el código llega a 100 o más, usa otro formato
        }

        String codigo = String.format(formato, prefijo, ultimoCodigo + 1);
        return codigo;
    }
}

