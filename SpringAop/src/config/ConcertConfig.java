package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import aspect.Audience;


/**
 * �����Զ�ɨ��
 * �����Զ�����
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
