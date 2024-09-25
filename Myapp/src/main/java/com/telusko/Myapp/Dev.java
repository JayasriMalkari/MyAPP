package com.telusko.Myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
//run it gets the output
public class Dev {
    @Autowired //By Type here the type is Laptop
    @Qualifier("laptop")//instance variable or bean name or small letter
    private Computer comp;// Dev should not depend on laptop it becomes hard code (private Laptop laptop)

    //@Autowired
    //public void setLaptop(Laptop laptop) {
       // this.laptop = laptop;
   // }

    public void built(){
        comp.Compile();

        System.out.println("Working on Awesome Project ");

    }

}
