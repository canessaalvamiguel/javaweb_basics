/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.formacionbdi.servlets.saludar.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import javax.servlet.ServletContext;
/**
 * Web application lifecycle listener.
 *
 * @author Andres
 */
public class MiPropioEventListener implements ServletContextListener, HttpSessionListener, ServletRequestListener {

    protected ServletContext servletContext;
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        servletContext  = sce.getServletContext();
        servletContext.log("Se llama al método: contextInitialized()");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        servletContext.log("Se llama al método: contextDestroyed()");
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        servletContext.log("Se llama al método: sessionCreated()");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        servletContext.log("Se llama al método: sessionDestroyed()");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        servletContext.log("Se llama al método: requestDestroyed()");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        servletContext.log("Se llama al método: requestInitialized()");
    }
}
