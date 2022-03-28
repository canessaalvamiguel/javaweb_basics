package com.formacionbdi.spring.di.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 *
 * @author Andres
 */
public class SpringHolaMundoDI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // get the bean factory
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"beans.xml"});
        Impresora imp = (Impresora) context.getBean("impresora");
        imp.imprimir();
    }
    
}
