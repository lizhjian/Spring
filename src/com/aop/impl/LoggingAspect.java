package com.aop.impl;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

//把这个类声明为一个切面：需要把该类放入到IOC容器中，再声明一个切面
@Aspect
@Component
public class LoggingAspect {

    //声明该方法是一个前置通知：在目标方法开始之前执行
    @Before("execution(public  int com.aop.impl.AtithmeticCalculatorImpl.*(int,int))")
    public void  beforeMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("The method begins..."+methodName+"---"+args);
    }
    //在目标方法执行后执行，叫后置通知   无论方式是否发生异常都执行
    //在后置通知中还不能访问目标方法执行的结果
    @After("execution(public  int com.aop.impl.AtithmeticCalculatorImpl.*(int,int))")
    public void afterMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("The method ends..."+methodName+"---"+args);
    }

    //返回通知   --方法正常结束后的通知  返回通知是可以访问到方法的返回值的
    //方法可能出异常，所以可能访问不到
    @AfterReturning(value = "execution(public  int com.aop.impl.AtithmeticCalculatorImpl.*(int,int))"
    ,returning = "result")
    public void afterReturning(JoinPoint joinPoint,Object result){
        String methodName = joinPoint.getSignature().getName();
    //    List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("The method 返回通知..."+methodName+"---"+result);

    }

    /**
     * 在目标方法出现异常时会执行的代码
     * 可以指定在出现特定异常时执行的通知
     * NullPointerException 只能捕获空指针异常通知
     * @param joinPoint
     * @param ex
     */
    @AfterThrowing(value = "execution(public  int com.aop.impl.AtithmeticCalculatorImpl.*(int,int))",
    throwing = "ex")
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
    @Around(value = "execution(public  int com.aop.impl.AtithmeticCalculatorImpl.*(..))"
           )
    public  Object aroundMethod(ProceedingJoinPoint joinPoint){
       // System.out.println("环绕通知");
        //执行目标方法
        Object result = null;
        String methodName = joinPoint.getSignature().getName();
        try{
            System.out.println("环绕通知前置---"+methodName+"begins with "+Arrays.asList(joinPoint.getArgs()));
           // result = joinPoint.proceed();
            System.out.println("环绕通知后置---"+methodName+"ends with "+Arrays.asList(joinPoint.getArgs()));
        }catch (Throwable throwable){
        //   throwable.printStackTrace();
            System.out.println("异常通知");
        }
        System.out.println("结束通知");

        return result;
    }




}
