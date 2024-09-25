package com.telusko.Myapp;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
    //method

    public void Compile(){
        System.out.println("Compiling the code in Desktop ");
    }

}
