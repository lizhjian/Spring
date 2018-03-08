package com.wuxin.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 静态工厂方法
 */
public class StaticaCarFactory {
   private static Map<String,Car> cars = new HashMap<String, Car>();

   static {
       cars.put("audi",new Car("audi","300"));
       cars.put("ford",new Car("ford","300"));
   }

   public static Car getCar(String name){

       return cars.get(name);

   }
}
