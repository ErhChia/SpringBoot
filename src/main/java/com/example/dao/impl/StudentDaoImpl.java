package com.example.dao.impl;

import com.example.bean.Student;
import com.example.dao.StudentDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

//@Repository
@Transactional
public class StudentDaoImpl implements StudentDao {
    @Resource
    private JdbcTemplate template;
    @Override
    public void create() {
        template.execute("CREATE TABLE STUDENT (ID CHAR(40),NO CHAR(40))");

    }

    @Override
    public void insert(Student user) {
        template.update("INSERT INTO STUDENT VALUES(?,?)",new Object[]{user.getId(),user.getNo()});
    }

    @Override
    public void delete(String id) {
        template.update("DELETE FROM STUDENT WHERE ID=?",new Object[]{id});
    }

    @Override
    public void update(Student user) {
        template.update("update student set no=? where id=?",new Object[]{user.getNo(),user.getId()});
    }

    @Override
    public List<Student> find() {
        return template.query("select * from student",new StudentMapper());
    }

    @Override
    public Student findOne(Student student) {
        return (Student)template.queryForObject("select * from student where id=?",new Object[]{student.getId()},new StudentMapper());
    }

    class StudentMapper implements RowMapper{

        @Override
        public Object mapRow(ResultSet resultSet, int i) throws SQLException {
            Student user=new Student();
            user.setId(resultSet.getString("id"));
            user.setNo(resultSet.getString("no"));
            return user;
        }
    }
}
