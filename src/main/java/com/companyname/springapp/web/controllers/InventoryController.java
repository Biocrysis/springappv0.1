package com.companyname.springapp.web.controllers;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.companyname.springapp.business.services.ProductManager;

/**
 * <p>
 * clase para mapear url y retornar vistas
 * </p>
 * 
 * @author uriel
 * @since 10/02/2023
 * @version 1.0
 */

@Controller
public class InventoryController {

	protected final Log logger = LogFactory.getLog(getClass());
	

	//inyeccion de la dependencia product manager
	@Autowired
	private ProductManager productManager;
	

	@RequestMapping(value = "/hello.htm")
	public ModelAndView handleRequest() {
		String now = (new Date()).toString();
		logger.info("Returning hello view whith " + now);
		//return new ModelAndView("hello", "now", now);
		
		Map<String,Object> myModel=  new HashMap<String, Object>();
		myModel.put("now ", now);
		myModel.put("products" , productManager.getProducts());
		
		return new ModelAndView("hello","model", myModel);
	}
}