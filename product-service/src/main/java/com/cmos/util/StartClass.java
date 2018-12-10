package com.cmos.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartClass {

	public static void main(String[] args) throws Exception {

		ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("applicationContext.xml");

		c.start();
		System.in.read();
		while (true) {

			Thread.sleep(10000);
		}
	}

}
