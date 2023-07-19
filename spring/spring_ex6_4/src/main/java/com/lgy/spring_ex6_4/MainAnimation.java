package com.lgy.spring_ex6_4;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainAnimation {
	public static void main(String[] args) {
		String configLoc = "classpath:animationCTX.xml";
		String configLoc2 = "classpath:animationCTX2.xml";
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc); 
		AbstractApplicationContext ctx2 = new GenericXmlApplicationContext(configLoc2); 
		
		Animation animation1 = ctx.getBean("animation1",Animation.class);
		System.out.println(animation1.getTitle());
		System.out.println(animation1.getYear());
		System.out.println(animation1.getCharacter());
		System.out.println("======================");
		
		AnimationInfo animationInfo1 = ctx.getBean("animationInfo1",AnimationInfo.class);
		Animation animation2 = animationInfo1.getAnimation();
		System.out.println(animation2.getTitle());
		System.out.println(animation2.getYear());
		System.out.println(animation2.getCharacter());
		System.out.println("======================");
		
		Animation animation3 = ctx2.getBean("animation3",Animation.class);
		System.out.println(animation3.getTitle());
		System.out.println(animation3.getYear());
		System.out.println(animation3.getCharacter());
		System.out.println("======================");
	}
}
