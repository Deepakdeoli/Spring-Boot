package com.Deepak.com.Springcore.couple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component   		// about the beans

public class Person {
    @Autowired
    @Qualifier("sher")
Animal animal;
    @Autowired
    Rahul rahul ;
        public Person(Animal animal) {
        this.animal = animal;
    }
    public void playwithanimal(){
        animal.play();
        Rahul.eat();
    }
}
 