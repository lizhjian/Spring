package com.txxml;

public interface BookShopDao {

    public void updateBookStock(String isbn);

    public void updateUserAccount(String username, int price);
}
