package org.peaksoft.entity;

import javax.persistence.*;

@Entity
@Table(name = "students")

public class Student {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name",length = 50)
    private String firstName;
    @Column(name = "last_name",length = 50)
    private String lastName;
    private int age;

    public Student(String firstname, String lastName, int age) {

        this.firstName = firstname;
        this.lastName = lastName;
        this.age = age;
    }
    public Student(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstName;
    }

    public void setFirstname(String firstname) {
        this.firstName = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student " +
                "id " + id +
                ", firstname " + firstName  +
                ", lastName " + lastName  +
                ", age " + age;
    }
}
