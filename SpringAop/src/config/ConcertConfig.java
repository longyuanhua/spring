package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import aspect.Audience;


/**
 * 开启自动扫描
 * 开启自动代理
 * */
@Configuration
@ComponentScan(basePackages="aspect,concert")
@EnableAspectJAutoProxy
public class ConcertConfig {
	
	@Bean
	public Audience audience(){
		return new Audience();
	}
}
