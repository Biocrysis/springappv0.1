package com.companyname.springapp.business;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import com.companyname.springapp.business.entities.Product;

/**
 * Archivo que contiene la configuración del contexto de la aplicación <br>
 * Se modfico para que contenga todos los beans relacionados con el acceso a la
 * base de datos.
 * 
 * @author uriel
 * @since 10/02/2023
 * @version 1.0
 */

@Configuration
@ComponentScan
@PropertySource("classpath:application.properties")
@EnableJpaRepositories("com.companyname.springapp.business.repositories")
public class SpringappBusinessConfig {
	@Autowired
	private Environment env;

	/**
	 * Metodo cuyos valores de configuración serán tomados de un archivo de
	 * propiedades en tiempo de ejecución. <br>
	 * los cules suelen estar en src/main/java/resources/application.properties.
	 * 
	 * @return dataSource Regresa los datos de BD.
	 */
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(env.getProperty("db.driver"));
		dataSource.setUrl(env.getProperty("db.url"));
		dataSource.setUsername(env.getProperty("db.username"));
		dataSource.setPassword(env.getProperty("db.password"));
		return dataSource;
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {

		LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
		emf.setDataSource(dataSource());
		emf.setPackagesToScan(Product.class.getPackage().getName());

		HibernateJpaVendorAdapter hibernateJpa = new HibernateJpaVendorAdapter();
		hibernateJpa.setDatabase(Database.MYSQL);
		hibernateJpa.setDatabasePlatform(env.getProperty("hibernate.dialect"));
		hibernateJpa.setGenerateDdl(env.getProperty("hibernate.generateDdl", Boolean.class));
		hibernateJpa.setShowSql(env.getProperty("hibernate.show_sql", Boolean.class));
		emf.setJpaVendorAdapter(hibernateJpa);

		Properties jpaProperties = new Properties();
		jpaProperties.put("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
		jpaProperties.put("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
		jpaProperties.put("hibernate.format_sql", env.getProperty("hibernate.format_sql"));
		emf.setJpaProperties(jpaProperties);

		return emf;
	}

	@Bean
	public JpaTransactionManager transactionManager() {
		JpaTransactionManager txnMgr = new JpaTransactionManager();
		 txnMgr.setEntityManagerFactory(entityManagerFactory().getObject());
		
		 
		 
		 
		 //txnMgr.setEntityManagerFactory(entityManagerFactory().getObject());
		return txnMgr;
	}

}