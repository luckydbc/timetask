package com.dong.task;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TaskJob1 {
	public void show(){  
        System.out.println("XMl:is show run");  
    }  
      
    public void print(){  
        System.out.println("XMl:print run");  
    }  
    public static void main(String[] args) {
    	ApplicationContext context = new ClassPathXmlApplicationContext("base.xml");
		
	}
}
