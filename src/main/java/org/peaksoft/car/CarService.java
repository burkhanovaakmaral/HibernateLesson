package org.peaksoft.car;

import org.hibernate.Session;
import org.peaksoft.car.Car;
import org.peaksoft.util.HibernateUtil;

public class CarService {
    public  Long createCar(Car car){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(car);
        session.getTransaction().commit();
        session.close();
        System.out.println("Successfully created car");
        return car.getId();
    }
}
