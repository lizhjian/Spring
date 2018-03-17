package com.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class JDBCTest {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContextJdbc.xml");
        DataSource dataSource = ctx.getBean(DataSource.class);
        //System.out.println(dataSource);
        JdbcTemplate jdbcTemplate = (JdbcTemplate)ctx.getBean("jdbcTemplate");
        System.out.println(jdbcTemplate);

    }
}
