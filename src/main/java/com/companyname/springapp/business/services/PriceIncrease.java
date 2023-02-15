package com.companyname.springapp.business.services;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/** Clase JavaBean.
 *  La cual sera el objeto que el formulario rellene
 * y desde el que, nuestra lógica de negocio extraerá el porcentaje de incremento que queremos aplicar a los precios
 * @author uriel
 *
 */

public class PriceIncrease {
	
	 /** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());
    
    @Min(0)
    @Max(50)
    private int percentage;

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int i) {
		percentage=i;
		logger.info("percentage set to: "+ i );
	}

}
