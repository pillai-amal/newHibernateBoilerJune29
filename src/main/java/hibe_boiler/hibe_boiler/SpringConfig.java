package hibe_boiler.hibe_boiler;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.apache.commons.dbcp2.*;

public class SpringConfig {
    @Bean
	public DataSource dataSource() {
	        BasicDataSource dataSource = new BasicDataSource();
	        dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
	        dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:");
	        dataSource.setUsername("system");
	        dataSource.setPassword("oracle");
	        return dataSource;
    }
}