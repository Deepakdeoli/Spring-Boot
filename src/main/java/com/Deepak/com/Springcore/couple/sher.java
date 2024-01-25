package com.Deepak.com.Springcore.couple;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component("sher")

public class sher implements Animal {
    @Override
    public void play() {
        System.out.println("sher he khde");
    }
}
