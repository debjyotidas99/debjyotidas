package springjdbc.javaconfig.javaconfig;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
        StudentDao bean = (StudentDao) ctx.getBean("studentdaoimpl",StudentDaoImpl.class);
//        Student stu = new Student();
//        stu.setId(101);
//        stu.setName("Raju Kumar");
//        stu.setCity("Noida");
//        int insert = bean.insert(stu);
//        System.out.println(insert);
        
        List<Student> list= bean.getAllStudent();
        for (Student student : list) {
			System.out.println(student);
		}
    }
}
