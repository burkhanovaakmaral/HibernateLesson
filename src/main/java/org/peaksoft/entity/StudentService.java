package org.peaksoft.entity;

import org.hibernate.Session;
import org.peaksoft.entity.Student;
import org.peaksoft.util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    public  Long create(Student student){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
        session.close();
        System.out.println("Successfully created student");
        return student.getId();
    }
    public Student getById(Long id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Student student = session.get(Student.class,id);
        session.getTransaction().commit();
        session.close();
        return student;
    }
    public List<Student> getAll(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List<Student> students = new ArrayList<>();
        students = session.createQuery("FROM Student").getResultList();
        session.getTransaction().commit();
        session.close();
        return students;
    }
}
