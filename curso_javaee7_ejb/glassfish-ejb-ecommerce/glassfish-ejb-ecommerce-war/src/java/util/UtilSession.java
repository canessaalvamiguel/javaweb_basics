/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import models.dao.dominio.carro.Carro;
import models.dao.dominio.carro.ICarro;

/**
 *
 * @author Zsamer
 */
public class UtilSession {

    public static ICarro getSessionCarro(HttpServletRequest req) {
        HttpSession session = req.getSession(true);

        ICarro carro = null;

        if (session.getAttribute("carro") == null) {
            Context ctx;

            try {
                ctx = new InitialContext();
                carro = (ICarro) ctx.lookup("java:global/glassfish-ejb-ecommerce/glassfish-ejb-ecommerce-ejb/Carro");
                session.setAttribute("carro", carro);
            } catch (NamingException ex) {
                Logger.getLogger(UtilSession.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            carro = (ICarro) session.getAttribute("carro");
        }

        return carro;
    }
}
