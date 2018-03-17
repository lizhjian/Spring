package com.tx;

public interface BookShopDao {

    public void updateBookStock(String isbn);

    public void updateUserAccount(String username,int price);
}
