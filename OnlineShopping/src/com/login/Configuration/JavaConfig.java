package com.login.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.login")
public class JavaConfig extends WebMvcConfigurerAdapter 
{
	@Bean
	public ViewResolver viewResolver()
	{
		InternalResourceViewResolver ir = new InternalResourceViewResolver();
		ir.setPrefix("/WEB-INF/views/");
		ir.setSuffix(".jsp");
		return ir;
	}
	
	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(
                "/assects/**")
                .addResourceLocations(
                		"/assects/");
    }
	
	
}
