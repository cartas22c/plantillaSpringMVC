package com.capgemini.springanotaciones.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
@EnableWebMvc

public class WebConfig implements WebMvcConfigurer{

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		// TODO Auto-generated method stub
 	    registry.jsp().prefix("/WEB-INF/pages/").suffix(".jsp");

	}

	
	  @Bean
	  public MessageSource messageSource() {
	     ResourceBundleMessageSource source = new ResourceBundleMessageSource();
	     source.setBasename("messages");
	     return source;
	  }

	
	
}
