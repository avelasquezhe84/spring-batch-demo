package com.example.demospringbatch.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import com.example.demospringbatch.model.Cancion;

public class Top50ItemProcessor implements ItemProcessor<Cancion, Cancion> {
	
	private static final Logger LOG = LoggerFactory.getLogger(Cancion.class);

	@Override
	public Cancion process(Cancion item) throws Exception {

		String nombreCancion = item.getTrack_Name().toUpperCase();
		
		LOG.info("Procesando cancion: " + nombreCancion);
		
		return null;
	}
	
	

}
