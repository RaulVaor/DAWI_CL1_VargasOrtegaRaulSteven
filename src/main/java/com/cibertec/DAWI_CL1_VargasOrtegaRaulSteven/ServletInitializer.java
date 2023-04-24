package com.cibertec.DAWI_CL1_VargasOrtegaRaulSteven;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DawiCl1VargasOrtegaRaulStevenApplication.class);
	}

}
