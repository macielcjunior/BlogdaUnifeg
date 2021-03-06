package br.edu.unifeg.blogdaunifeg.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServeletSpringMVC extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
	    return new Class[]{SecurityConfiguration.class,
	    		           AppWebConfiguration.class, JPAConfiguration.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
	    return new Class[] {};
	}

	@Override
	protected String[] getServletMappings() {
	    return new String[] {"/"};
	}	
}
