package demo.data;

import javax.sql.DataSource;

import org.springframework.cloud.config.java.AbstractCloudConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("spring-cloud")
public class SpringCloudDataConfig extends AbstractCloudConfig{
	@Bean(name="test")
	public DataSource dataSource(){
		return connectionFactory().dataSource();
	}
}
