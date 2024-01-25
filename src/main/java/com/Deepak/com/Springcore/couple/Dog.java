package com.Deepak.com.Springcore.couple;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

   		// about the beans
@Component("Dog")
//@Primary
public class Dog implements Animal{
    @Override
    public void play() {
System.out.println("dog is playing ");
    }
}
