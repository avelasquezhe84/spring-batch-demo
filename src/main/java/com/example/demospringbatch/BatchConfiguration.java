package com.example.demospringbatch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import com.example.demospringbatch.model.Cancion;;

@Configuration
@EnableBatchProcessing
public class BatchConfiguration {

	@Autowired
	public JobBuilderFactory jobBuilderFactory;

	@Autowired
	public StepBuilderFactory stepBuilderFactory;

	@Bean
	public FlatFileItemReader<Cancion> reader() {
		return new FlatFileItemReaderBuilder<Cancion>().name("cancionItemReader")
				.resource(new ClassPathResource("top50.csv"))
				.delimited()
				.names(new String[] { "id", "Track_Name", "Artist_Name", "Genre", "Beats_Per_Minute", "Energy",
						"Danceability", "Loudness_dB", "Liveness", "Valence", "Length.", "Acousticness", "Speechiness.",
						"Popularity" })
				.fieldSetMapper(new BeanWrapperFieldSetMapper<Cancion>() {
					{
						setTargetType(Cancion.class);
					}
				})
				.build();
	}
}
