package personsManagement.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableJpaRepositories(basePackages = { "personsManagement.repositories" })
@EnableAutoConfiguration
@ComponentScan(basePackages = { "personsManagement" })
@EntityScan(basePackages = { "personsManagement.entities" })
@EnableTransactionManagement
public class DomainAndPersistanceConfig {

	
	// MySQL Datasource
		@Bean
		public DataSource dataSource() {
			BasicDataSource dataSource = new BasicDataSource();
			dataSource.setDriverClassName("com.mysql.jdbc.Driver");
			dataSource.setUrl("jdbc:mysql://localhost:3306/persons");
			dataSource.setUsername("root");
			dataSource.setPassword("");
			return dataSource;
		}
	
	
		@Bean
		public JpaVendorAdapter jpaVendorAdapter() {
			HibernateJpaVendorAdapter hibernateJpaVendorAdapter = new HibernateJpaVendorAdapter();
			hibernateJpaVendorAdapter.setShowSql(true);
			hibernateJpaVendorAdapter.setGenerateDdl(false);
			hibernateJpaVendorAdapter.setDatabase(Database.MYSQL);
			return hibernateJpaVendorAdapter;
		}
	
	
	
}
