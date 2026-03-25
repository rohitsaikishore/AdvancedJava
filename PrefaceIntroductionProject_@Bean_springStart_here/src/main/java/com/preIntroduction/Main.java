package com.preIntroduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.preIntroduction.configuration.ProjectConfig;

public class Main {
	public static void main(String a[]) {
	AnnotationConfigApplicationContext	config=new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		Parrot p=config.getBean("get_the_hell_out_of_here",Parrot.class);
		System.out.println(p.getName());
		
		String s=config.getBean(String.class);
		System.out.println(s);
		
		Integer i=config.getBean(Integer.class);
		int x=i.intValue();
		System.out.println(x);
		
	}
}
