package org.peaksoft.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory buildSessionFactory(){
        SessionFactory sessionFactory = null;
        try{
            sessionFactory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .buildSessionFactory();
        }catch (Exception e){
            e.printStackTrace();
        }
        return sessionFactory;
    }
    public static SessionFactory getSessionFactory(){
        return buildSessionFactory();
    }
}
