package com.shmcc.config;

import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;

/**
 * mybatis
 * @author yuanchen
 *
 */
@org.springframework.context.annotation.Configuration
public class MyBatisConfig {

	  	@Bean
	    public ConfigurationCustomizer configurationCustomizer(){
	        return new ConfigurationCustomizer(){

				@Override
				public void customize(Configuration configuration) {
					 configuration.setMapUnderscoreToCamelCase(true);
				}
	        };
	    }
}
