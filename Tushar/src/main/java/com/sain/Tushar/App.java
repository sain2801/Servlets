package com.sain.Tushar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	ApplicationContext context=new ClassPathXmlApplicationContext("/com/sain/Tushar/spring.xml");
//        Vehicle obj=(Vehicle)context.getBean("bike");
//        obj.drive();
//    	Tyre t=(Tyre)context.getBean("tyre");
    //	Car c=new Car();
    //	c.drive();
//    	System.out.println(c.drive());
    	
	ApplicationContext factory=new AnnotationConfigApplicationContext(AppConfig.class);
    	Samsung s=(Samsung) factory.getBean(Samsung.class);
    	s.config();
    }
}
