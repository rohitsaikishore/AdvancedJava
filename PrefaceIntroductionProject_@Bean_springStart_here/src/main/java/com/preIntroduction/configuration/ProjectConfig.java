package com.preIntroduction.configuration;
import com.preIntroduction.Parrot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
	@Bean
	Parrot parrot1() {
		Parrot p=new Parrot();
		p.setName("koka is  parrot Name-1");
		return p;
	}
	
	@Bean("get_the_hell_out_of_here")
	Parrot parrot2() {
		Parrot p=new Parrot();
		p.setName("miki is  parrot Name-2");
		return p;
	}
	
	@Bean
	Parrot parrot3() {
		Parrot p=new Parrot();
		p.setName("diki is  parrot Name -3");
		return p;
	}
	
	@Bean
	String Hello() {
		return "String object";
	}
	@Bean
	Integer integerTypeMethod() {
		Integer i=Integer.valueOf(10);
		return i;
	}
}
