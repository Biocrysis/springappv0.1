package com.companyname.springapp.web.controllers;

import java.lang.ProcessBuilder.Redirect;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.companyname.springapp.business.services.PriceIncrease;
import com.companyname.springapp.business.services.ProductManager;

/**
 * Clase para mapear url para aunmentar el precio de un producto
 * atraves del  formulario
 * @author uriel
 * @since 14/02/2023
 * @version 1.0
 *
 */

@Controller
@RequestMapping(value = "/priceincrease.htm")
public class PriceIncreaseFormController {
	
    /** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());
    //*
    
    @Autowired
    private ProductManager productManager;
    
    /**
     * 
     * @param priceIncrease
     * @param result
     * @return
     */
    
    @RequestMapping(method = RequestMethod.POST)
    public String onSubmit(@Valid PriceIncrease priceIncrease , BindingResult result) {
    	if(result.hasErrors()) {
    		return "priceincrease";
    	}
    	
    	int increase= priceIncrease.getPercentage();
    	logger.info("Increasing prices by " + increase + "%.");
    	
    	productManager.increasePrice(increase);
    	
    	return "redirect:/hell.htm";
    	}
    /**
     * 
     * @return return priceIncrease regrese el 15 para el valor de incremento
     */
    @RequestMapping(method = RequestMethod.GET)
    protected PriceIncrease formBackingObjet() {
    	PriceIncrease priceIncrease = new PriceIncrease();
    	priceIncrease.setPercentage(15);
    	return priceIncrease;
    }

}
