package com.companyname.springapp.web.controllers;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>clase para mapear url y retornar vistas</p>
 * 
 * @author uriel
 * @since 10/02/2023
 * @version 1.0
 */

@Controller
public class HelloController {

    protected final Log logger = LogFactory.getLog(getClass());

    @RequestMapping(value="/hello.htm")
    public ModelAndView handleRequest() {
        logger.info("Returning hello view");
        return new ModelAndView("hello.jsp");
    }
}