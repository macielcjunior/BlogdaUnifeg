package br.edu.unifeg.blogdaunifeg.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServeletSpringMVC extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
	    return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
	    return new Class[] {AppWebConfiguration.class, JPAConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
	    return new String[] {"/"};
	}	
}
