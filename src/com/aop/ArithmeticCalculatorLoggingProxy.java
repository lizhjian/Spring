package com.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//动态dialing
public class ArithmeticCalculatorLoggingProxy {
   //要代理的对象
    //把目标放到代理对象中，代理对象代理目标的具体方法

    public ArithmeticCalculatorLoggingProxy(AtithmeticCalculator tatget) {
        this.target = tatget;
    }

    private  AtithmeticCalculator target;
    public  AtithmeticCalculator getLoggingProxy(){
        AtithmeticCalculator proxy = null;
        //代理对象由哪一个类加载器负责加载
        ClassLoader loader = target.getClass().getClassLoader();
        //代理对象的类型，即其中有哪些方法
        Class[] interfaces = new Class[]{AtithmeticCalculator.class};
        //当调用代理对象其中的方法时，该执行的代码
        InvocationHandler h = new InvocationHandler() {
            /**
             *
             * @param proxy  正在返回的那个代理对象，一般情况下，在invoke方法中都不使用该对象
             * @param method 正在被调用方法
             * @param args  代用方法时传入的参数
             * @return
             * @throws Throwable
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                String methodName = method.getName();
                //日志
                System.out.println("invoke....."+methodName);
                //执行方法  执行target的方法
                Object result = method.invoke(target,args);
                //日志
                System.out.println("The method "+methodName+"ends with"+result);
                return 0;
            }
        };
        proxy = (AtithmeticCalculator) Proxy.newProxyInstance(loader,interfaces,h);
        return  proxy;
    }
}
