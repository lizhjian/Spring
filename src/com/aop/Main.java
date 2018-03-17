package com.aop;

public class Main {
    public static void main(String[] args) {
    /*     AtithmeticCalculator atithmeticCalculator =new AtithmeticCalculatorImpl();
        //System.out.println();
      int result =  atithmeticCalculator.add(1,2);
        System.out.println(result);
       result = atithmeticCalculator.sub(1,2);
        System.out.println(result);
       result = atithmeticCalculator.mul(1,2);
        System.out.println(result);
       result =  atithmeticCalculator.div(1,2);
        System.out.println(result);*/
    AtithmeticCalculator target = new AtithmeticCalculatorImpl();
   AtithmeticCalculator proxy = new ArithmeticCalculatorLoggingProxy(target).getLoggingProxy();

   int result = proxy.add(1,2);
   System.out.println("--->"+result);
   result = proxy.div(1,2);
   System.out.println("--->"+result);



    }
}
