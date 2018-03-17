package com.aop.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

//把这个类声明为一个切面：需要把该类放入到IOC容器中，再声明一个切面
public class LoggingAspect {


    public void declareJointPointExpression(){
    }


    public void  beforeMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("The method 前置 begins..."+methodName+"---"+args);
    }
      public void afterMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("The method ends..."+methodName+"---"+args);
    }


    public void afterReturning(JoinPoint joinPoint,Object result){
        String methodName = joinPoint.getSignature().getName();
    //    List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("The method 返回通知..."+methodName+"---"+result);

    }


    public void afterThrowing(JoinPoint joinPoint,Exception ex){
    //
    //  public void afterThrowing(JoinPoint joinPoint,NullPointerException ex){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("异常通知....");
    }




    /**
     * 环绕通知需要携带这个类型的参数ProceedingJosinPoint
     * 环绕通知类似于动态代理的全过程：ProceedingJosinPoint类型的参数可以决定是够执行目标方法
     * 且环绕通知必须有返回值，返回值即为目标方法的返回值
     */
  /*  @Around(value = "execution(public  int com.aop.impl.AtithmeticCalculatorImpl.*(..))"
           )*/
    public  Object aroundMethod(ProceedingJoinPoint joinPoint){
       // System.out.println("环绕通知");
        //执行目标方法
        Object result = null;
        String methodName = joinPoint.getSignature().getName();
        try{
            System.out.println("环绕通知前置---"+methodName+"begins with "+Arrays.asList(joinPoint.getArgs()));
            result = joinPoint.proceed();
            System.out.println("环绕通知后置---"+methodName+"ends with "+Arrays.asList(joinPoint.getArgs()));
        }catch (Throwable throwable){
        //   throwable.printStackTrace();
            System.out.println("异常通知");
        }
        System.out.println("结束通知");

        return result;
    }


}
