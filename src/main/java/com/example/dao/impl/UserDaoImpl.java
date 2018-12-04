package com.example.dao.impl;

import com.example.bean.User;
import com.example.dao.UserDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Implement of UserDao
 *
 * @author Jack Lin on 11/29/18
 */
@Repository
@Transactional
public class UserDaoImpl implements UserDao {

    @Resource
    private JdbcTemplate template;

    @Override
    public void create() {
        template.execute(
                "CREATE TABLE PRACTICE_USER_DATA (" +
                        "ID_ NUMBER(10) NOT NULL," +
                        " USER_NAME_ VARCHAR(255)," +
                        " PASSWORD_ VARCHAR(255)," +
                        " ACTIVE_ NUMBER(3)," +
                        " GENDER_ VARCHAR(255)," +
                        " PRIMARY KEY (ID_)" +
                        ");"
        );
    }

    @Override
    public void insert(User user) {
        template.update("INSERT INTO PRACTICE_USER_DATA VALUES(?,?,?,?,?)",
                user.getId(),
                user.getName(),
                user.getPassword(),
                user.getActivate(),
                user.getGender()
        );
    }

    @Override
    public void delete(int id) {
        template.update("DELETE FROM PRACTICE_USER_DATA WHERE ID_=?", id);
    }

    @Override
    public void update(User user) {
        template.update("UPDATE PRACTICE_USER_DATA SET USER_NAME_=?," +
                        "PASSWORD_=?,ACTIVE_=?,GENDER_=? WHERE ID_=?",
                user.getName(),
                user.getPassword(),
                user.getActivate(),
                user.getGender(),
                user.getId()
        );
    }

    @Override
    public List<User> find() {
        return template.query("select * from practice_user_data", new UserMapper());
    }

    @Override
    public User find(User user) {
        return (User) template.queryForObject("select * from practice_user_data where id_=?", new Object[]{user.getId()}, new UserMapper());
    }

    @Override
    public User find(int id) {
        return (User) template.queryForObject("select * from practice_user_data where id_=?", new Object[]{id}, new UserMapper());
    }

    class UserMapper implements RowMapper {

        @Override
        public Object mapRow(ResultSet resultSet, int rowNum) throws SQLException {
            User user = new User();
            user.setId(resultSet.getInt("id_"));
            user.setName(resultSet.getString("user_name_"));
            user.setPassword(resultSet.getString("password_"));
            user.setActivate(resultSet.getBoolean("active_"));
            user.setGender(resultSet.getString("gender_"));
            return user;
        }
    }
}
