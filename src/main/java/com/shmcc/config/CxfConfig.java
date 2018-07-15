package com.shmcc.config;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.shmcc.webservicedemo.AppService;
import com.shmcc.webservicedemo.AppServiceImplPortImpl;








@Configuration
public class CxfConfig {

	@Autowired
	private AppService appServiceImplPortImpl;
	
	//默认servlet路径/*,如果覆写则按照自己定义的来
    @Bean
    public ServletRegistrationBean dispatcherServlet() {
        return new ServletRegistrationBean(new CXFServlet(), "/services/*");
    }

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

   /* @Bean
    public AppService appService() {
        return new AppServiceImplPortImpl();
    }*/
    
    @Bean
    public Endpoint testEndPoint() {
		//EndpointImpl endpoint1 = new EndpointImpl(springBus(),appService());
    	EndpointImpl endpoint1 = new EndpointImpl(springBus(),appServiceImplPortImpl);
        endpoint1.publish("/user");//接口发布在 /user 目录下
        return endpoint1;
    }



	
	
}
