package com.mike.bootweb.bootjdbc.Impl;

import com.mike.bootweb.bootjdbc.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository//将对象类的mapper交给srping管理
public class UserDaoImpl {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 内部类，DataRow映射成对象
     */
    class UserRowMapper implements RowMapper<User> {

        @Override
        public User mapRow(ResultSet resultSet, int i) throws SQLException {
            User user = new User();
            user.setId(resultSet.getInt("id"));
            user.setName(resultSet.getString("name"));
            user.setAge(resultSet.getInt("age"));
            user.setAddress(resultSet.getString("address"));
            return user;
        }

    }

    public void add() {
        String sql = "Insert into testdb.user(`name`,`age`,'address');";
        jdbcTemplate.execute(sql);
    }

    public User selectOne(Integer id) {
        String sql = "select * From user where id = ?;";
        User user = jdbcTemplate.queryForObject(sql, new UserRowMapper(), id);
        return user;
    }

    public List<User> selectList() {
        String sql = "select * From user";
        return jdbcTemplate.query(sql, new UserRowMapper());
    }

    public void update(User user) {
        String sql = "Update testdb.user set name= '" + user.getName() +
                "',age=" + user.getAge() + ",address='" + user.getAddress() + "'";
        jdbcTemplate.update(sql);
    }

    public void delete(Integer id) {
        String sql = "delect from user where id=?";
        jdbcTemplate.update(sql, id);
    }
}

