package springjdbc.javaconfig.javaconfig;

import java.util.List;

public interface StudentDao {

	public int insert(Student student);

	public int change(Student student);

	public int delete(int i);

	public Student getStudent(int id);
	
	public List<Student> getAllStudent();

}
