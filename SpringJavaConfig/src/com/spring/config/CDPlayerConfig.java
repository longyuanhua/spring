package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.soundsystem.CDPlayer;
import com.spring.soundsystem.CompactDisc;
import com.spring.soundsystem.MediaPlayer;
import com.spring.soundsystem.SgtPeppers;

@Configuration
public class CDPlayerConfig {
	
	//将组件加入到容器中
	@Bean
	public CompactDisc sgtPeppers(){
		return new SgtPeppers();	
	}
	
	//接入JavaConfig实现注入
	@Bean
	public MediaPlayer cdPlayer(){
	
		return new CDPlayer(sgtPeppers());
	}
	
}
