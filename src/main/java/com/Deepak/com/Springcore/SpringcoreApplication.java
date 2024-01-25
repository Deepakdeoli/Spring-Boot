package com.Deepak.com.Springcore;

import com.Deepak.com.Springcore.couple.Animal;
import com.Deepak.com.Springcore.couple.Person;
import com.Deepak.com.Springcore.couple.Rahul;
import com.Deepak.com.Springcore.couple.sher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.Deepak.com.Springcore","SpringcoreApplicationTest"})
public class SpringcoreApplication {

	public static void main(String[] args) {
                    		Animal animal=new sher();
	            	Person p =new Person(animal);
	     	p.playwithanimal();
     ApplicationContext context= SpringApplication.run(SpringcoreApplication.class, args);
     Person personBean = context.getBean(Person.class);
	 personBean.playwithanimal();

			}
//
	@Bean
	public Rahul getrahul(){
		return new Rahul();

	}
}
