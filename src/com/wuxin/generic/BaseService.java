package com.wuxin.generic;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseService<T> {

  @Autowired
  protected BaseRepository<T> repository;
  //T传入的是User  就代表是UserRepository ,
  public void add(){
      System.out.println("add....");
      System.out.println(repository);
  }
}
