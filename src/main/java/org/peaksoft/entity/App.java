package org.peaksoft.entity;

import org.peaksoft.entity.Student;
import org.peaksoft.entity.StudentService;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        StudentService service = new StudentService();
//        Student student = new Student("Haadi","Bolotbekov",23);
//        Student student1 = new Student("Madina","Bolotbekova",21);
//        Student student2 = new Student("Haadija","Bum",25);
//        System.out.println(service.create(student));
//        System.out.println(service.create(student1));
//        System.out.println(service.create(student2));
//        System.out.println(service.getById(3L));
//        System.out.println(service.getById(6L));
        List<Student> students = service.getAll();
        for (Student student:students){
            System.out.println(student);
        }

//        service.create(student);






//        SessionFactory sessionFactory = new Configuration()
//                .configure("hibernate.cfg.xml")
//                .addAnnotatedClass(Student.class)
//                .buildSessionFactory();
//
//        try{
//            Session session = sessionFactory.openSession();
//            Student student = new Student("Asan","Tairov",23);
//            session.beginTransaction();
//            session.save(student);
//            session.getTransaction().commit();
//            session.close();
//        }finally {
//            System.out.println("Successfully");
//        }

    }
}
