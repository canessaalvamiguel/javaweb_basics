package com.formacionbdi.spring.di.naming;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 *
 * @author Andres
 */
public class SpringInjectionNaming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // get the bean factory
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"beans.xml"});
        String s1 = (String)context.getBean("name1");
        String s2 = (String)context.getBean("name2");
        String s3 = (String)context.getBean("name3");
        String s4 = (String)context.getBean("name4");
        
        System.out.println((s1.equals(s2)));
        System.out.println((s2.equals(s3)));
        System.out.println((s3.equals(s4)));
        
        String[] x = context.getAliases("name3");
        System.out.println("aliases = " + x[0] + " " + x[1]);
    }
    
}
