package com.spring.jdbc;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import springjdbc.javaconfig.javaconfig.Student;
import springjdbc.javaconfig.javaconfig.StudentDao;

/**
 * Hello world!
 *
 */
@SuppressWarnings("unused")
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Record Inserting..." );
        @SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/jdbc/entity/config.xml");
          StudentDao bean = ctx.getBean("StudnetDaoImpl",StudentDao.class);
//        Student stu = new Student();
//        stu.setId(333);
//        stu.setName("Suraj");
//        stu.setCity("Vasantpur");
//        int insert = bean.insert(stu);
//        System.out.println(insert);
        
//        Student stu = new Student();
//        stu.setId(333);
//        stu.setName("Sumit Halder"); 
//        stu.setCity("Mumbai");
//        int change = bean.change(stu);
//        System.out.println(change);
          
//          int delete = bean.delete(333);
//          System.out.println(delete);
          
//          Student stu = bean.getStudent(222);
//          System.out.println(stu);
          
          List<Student> list = bean.getAllStudent();
          for(Student s : list) {
        	  System.out.println(s);
          }
        
    }
}
