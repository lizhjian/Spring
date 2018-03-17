package com.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("bookShopDao")
public class BookShopDaoImpl implements BookShopDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void updateBookStock(String isbn) {
       throw  new BookStockException("库存不足");
    }

    @Override
    public void updateUserAccount(String username, int price) {

    }
}
