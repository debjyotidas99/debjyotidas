package org.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository("studentdao")
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private JdbcTemplate temp;

    @Override
    public int insert(Student student) {
        String insert = "insert into student(id,name,city) values(?,?,?)";
        int insert1 = temp.update(insert, student.getId(), student.getName(), student.getCity());
        return insert1;
    }

    @Override
    public int change(Student student) {
        // update
        String update = "update student set name=?,city=? where id=?";
        int update1 = temp.update(update, student.getName(), student.getCity(), student.getId());
        return update1;
    }

    @Override
    public int delete(int id) {
        // delete
        String delete = "delete from student where id=?";
        int del = temp.update(delete, id);
        return del;
    }

    @Override
    public Student getStudent(int id) {
        // fetching data
        String select = "select * from student where id=?";
        RowMapper<Student> rowMapper = new RowMapperImpl();
        Student student = temp.queryForObject(select, rowMapper, id);
        return student;
    }

    @Override
    public List<Student> getAllStudent() {
        // fetching multiple student
        String query = "select * from student";
        List<Student> query2 = temp.query(query, new RowMapperImpl());
        return query2;
    }

}
