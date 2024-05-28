package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



/**
 * Hello world!
 */
@SpringBootApplication
public class App implements CommandLineRunner
{

    @Autowired
    StudentDaoImpl studaoimpl;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("run...method");
        Student stu = new Student(301,"Beauty","Nagpur");
        int insert = studaoimpl.insert(stu);
        System.out.println(insert+" record inserted...");

    }

    public static void main(String[] args) {
        System.out.println("Main Method");
        SpringApplication.run(App.class, args);
    }
}
