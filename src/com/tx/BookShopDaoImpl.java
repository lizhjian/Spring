package com.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository("bookShopDao")
@Transactional(propagation = Propagation.REQUIRES_NEW,
        isolation = Isolation.READ_COMMITTED,
        noRollbackFor = {BookStockException.class
        },readOnly=false)
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
