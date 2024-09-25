package com.telusko.Myapp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Laptop implements Computer {
    //method

    public void Compile(){
        System.out.println("Compiling the code  in Laptop");
    }

}
