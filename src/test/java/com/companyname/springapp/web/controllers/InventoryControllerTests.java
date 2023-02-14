package com.companyname.springapp.web.controllers;

/** 
 * <p>
 * Clase para hacer pruebas, que se encargan de comprobor los errores de los mododulos
 * o componentes de la apliacacion y que estos mismos funcionen correctamente.
 * se utiliza el marco de pruebas JUnit para realizar estas pruebas.
 * </p>
 * 
 * @author uriel
 * @since 10/02/2023
 * @version 1.0
 */

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.servlet.ModelAndView;

import com.companyname.springapp.business.SpringappBusinessConfig;
import com.companyname.springapp.web.SpringappWebConfig;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { SpringappBusinessConfig.class, SpringappWebConfig.class })
@WebAppConfiguration
public class InventoryControllerTests {

	@Autowired
	private InventoryController controller;

	@Test
    public void testHandleRequestView() {	
        ModelAndView modelAndView = controller.handleRequest();		
        assertEquals("hello", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        @SuppressWarnings("unchecked")
        Map<String, Object> modelMap = (Map<String, Object>) modelAndView.getModel().get("model");
        String nowValue = (String) modelMap.get("now");
        assertNotNull(nowValue);
    
	}
}