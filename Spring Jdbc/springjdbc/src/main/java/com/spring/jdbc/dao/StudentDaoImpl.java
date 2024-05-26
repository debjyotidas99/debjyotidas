package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entity.RowMapperImpl;
import com.spring.jdbc.entity.Student;


public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate temp;

	public JdbcTemplate getTemp() {
		return temp;
	}

	public void setTemp(JdbcTemplate temp) {
		this.temp = temp;
	}

	@Override
	public int insert(Student student) {
		String insert = "insert into student(id,name,city) values(?,?,?)";
		int insert1 = this.temp.update(insert, student.getId(), student.getName(), student.getCity());
		return insert1;
	}

	@Override
	public int change(Student student) {
		// update
		String update = "update student set name=?,city=? where id=?";
		int update1 = this.temp.update(update, student.getName(), student.getCity(), student.getId());
		return update1;
	}

	@Override
	public int delete(int id) {
		// delete
		String delete = "delete from student where id=?";
		int del = this.temp.update(delete, id);
		return del;
	}

	@Override
	public Student getStudent(int id) {
		// fetching data
		String select = "select * from student where id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.temp.queryForObject(select, rowMapper, id);
		return student;
	}

	@Override
	public List<Student> getAllStudent() {
		// fetching multiple student
		String query = "select * from student";
		List<Student> query2 = this.temp.query(query, new RowMapperImpl());
		return query2;
	}

}
