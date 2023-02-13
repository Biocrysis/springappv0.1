package com.companyname.springapp;

/**
 * Clase que controla hacia d�nde ser�n enrutadas todas nuestras solicitudes
 * esta clase ser� escaneada por Spring al inicio de la aplicaci�n y arrancada. 
 * Esta clase tiene una responsabilidad: ensamblar las partes m�viles de la aplicaci�n web
 * @author uriel
 * @since 10/02/2023
 * @version 1.0
 *
 */

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import com.companyname.springapp.business.SpringappBusinessConfig;
import com.companyname.springapp.web.SpringappWebConfig;

public class SpringappWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	/**
	 * 
	 */
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] { SpringappBusinessConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { SpringappWebConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}