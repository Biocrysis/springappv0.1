package com.companyname.springapp.web;

/**
 * <p>  clase que define  el contexto de la capa web </p>
 * 
 * @author uriel
 * @since 10/02/2023
 * @version 1.0
 */

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan
@EnableWebMvc
public class SpringappWebConfig {
}