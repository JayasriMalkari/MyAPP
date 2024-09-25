package com.telusko.Myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyappApplication {

	public static void main(String[] args) {
		// Creates the container in jvm and runs (SpringApplication.run)
		//run method runs the Application class and returns the object of configurableApplication context
		// we are assigning  the object to the context
		ApplicationContext context = SpringApplication.run(MyappApplication.class, args);

		//to call the method  for a static class we need to create an object and access it
		//if we run we get the output Working on Awesome Project
		//This creates the obj in jvm manually outside the spring container in jvm
		/*Dev obj=new Dev();// This approach is without spring
		obj.built();*/
		//As Spring creates the obj we do give the dummy value  and try to run it null
		//This gives the error (NullPointerException:) i.e, assigning  the null is not good
		// we get this  object from the container, we need to tell it by least reference of that container
		//Dev obj=null;
		Dev obj=context.getBean(Dev.class);
		obj.built();
	}

}
