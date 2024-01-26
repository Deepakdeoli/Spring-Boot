package com.Deepak.com.Springcore.scope;

import org.springframework.stereotype.Component;

@Component

public class Pepsi {
    public Pepsi(){
        System.out.println("createing pepsi");
    }
    public void drink (){
        System.out.println("dar k aage jeet h cool cool");
    }

}
