import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.demospringbatch.model.Cancion;

@Component
public class JobListener extends JobExecutionListenerSupport {

	private JdbcTemplate jdbcTemplate;
	private static final Logger LOG = LoggerFactory.getLogger(JobListener.class);

	@Autowired
	public JobListener(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void afterJob(JobExecution jobExecution) {

		if (jobExecution.getStatus() == BatchStatus.COMPLETED) {
			LOG.info("Finalizó el job!!!");

			jdbcTemplate
					.query("select * from top50",
							(rs, row) -> new Cancion(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
									rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(8), rs.getInt(9), rs.getInt(10),
									rs.getInt(11), rs.getInt(12), rs.getInt(13), rs.getInt(14)))
					.forEach(cancion -> LOG.info("Registro < " + cancion + " >"));
		}

	}

}