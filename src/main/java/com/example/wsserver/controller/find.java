package com.example.wsserver.controller;

import com.example.wsserver.User.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@CrossOrigin(origins = "*",maxAge = 3600)
@Controller
@RequestMapping("/jdbc")
public class find {
    @Resource
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/user")
    @ResponseBody
    public List<User> list(ModelMap map){
        String sql = "SELECT * FROM User";
        List<User> userList = jdbcTemplate.query(sql, new RowMapper<User>() {
            User user = null;
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                user = new User();
                user.setUser(rs.getString("user"));
                user.setPassWord(rs.getString("password"));
                user.setIsAdmin(rs.getString("isadmin"));
                return user;
            }
        });
        for (User user : userList){
            System.out.println(user.toString());
        }
        return userList;
    }

    @RequestMapping("/userList")
    public String userList(ModelMap map){
        String sql = "SELECT * FROM User";
        List<User> userList = jdbcTemplate.query(sql, new RowMapper<User>() {
            User user = null;

            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                user = new User();
                user.setUser(rs.getString("user"));
                user.setPassWord(rs.getString("password"));
                user.setIsAdmin(rs.getString("isadmin"));
                return user;
            }
        });
        map.addAttribute("users", userList);
        return "user";
    }

    @RequestMapping("/app")
    public String app(){
        return "1";
    }
}
