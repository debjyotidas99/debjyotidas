package springjdbc.javaconfig.javaconfig;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RowMapperImpl implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student stu = new Student();
		stu.setId(rs.getInt(1));
		stu.setName(rs.getString(2));
		stu.setCity(rs.getString(3));
		return stu;
	}

}
