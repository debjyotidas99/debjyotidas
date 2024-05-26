package springjdbc.javaconfig.javaconfig;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = {"springjdbc.javaconfig.javaconfig"})
public class JavaConfig {
	
	
	@Bean("ds")
	public DataSource getDataSource() {
		
		DriverManagerDataSource driver = new DriverManagerDataSource();
		driver.setDriverClassName("com.mysql.jdbc.Driver");
		driver.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		driver.setUsername("root");
		driver.setPassword("Mysql@1234");
		return driver;
	}
	
	@Bean("temp")
	public JdbcTemplate getTemplate() {
		JdbcTemplate temp = new JdbcTemplate();
		temp.setDataSource(getDataSource());
		return temp;
	}
	
	
}
