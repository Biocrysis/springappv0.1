package com.companyname.springapp.web;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * 
 * @author uriel
 * @since 10/02/2023
 * @version 1.0
 *          <p>
 *          clase que define el contexto de la capa web
 *          </p>
 *          <p>
 *          @Bean nos ayudara a separar la vista del contralador para que no
 *          genere dependencia con ayuda de InternalResourceViewResolver quese
 *          utiliza para resolver la vista de recursos internos que genera urls
 *          con un patron predefino dentro la misma aplicacion.
 *          </p>
 */

@Configuration
@ComponentScan
@EnableWebMvc
public class SpringappWebConfig {

	@Bean
	public ViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
		internalResourceViewResolver.setPrefix("/WEB-INF/views/"); // buscara en la carpeta views
		internalResourceViewResolver.setSuffix(".jsp"); // buscara todas las vistas que terminen en .jsp
		return internalResourceViewResolver;

	}
}