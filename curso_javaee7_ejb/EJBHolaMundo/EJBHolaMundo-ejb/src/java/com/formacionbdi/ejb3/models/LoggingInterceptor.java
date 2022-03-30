/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.formacionbdi.ejb3.models;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

/**
 *
 * @author Andres
 */
@Stateless
public class LoggingInterceptor {

    private static final Logger logger = Logger.getLogger("models.ejb3");

    @AroundInvoke
    public Object logMethod(InvocationContext ic) throws Exception {
        logger.log(Level.INFO, "------> {0}, nombre del método: {1}", new Object[]{ic.getTarget().getClass(), ic.getMethod().getName()});
        try {
            return ic.proceed();
        } finally {
            logger.log(Level.INFO, "<------ {0}, nombre del método: {1}", new Object[]{ic.getTarget().getClass(), ic.getMethod().getName()});
        }
    }
}

