# spring
Bean生命周期

    通过构造器 或者工厂方创建Bean
    为Bean属性设置值 和对其他Bean的引用
    调用前置方法
    初始化方法
    后置方法
    使用
    关闭
#AOP
    
    切面：横切关注点被模块化的特殊对象
    通知：切面必须完成的工作  切面里面的验证，方法等
    目标：被通知的对象 AtithmeticCalculatorImpl 这个类的对象
    代理：proxy
    连接点:程序执行的某个特定的位置，方法前 方法后等
    切点：每个类有多个连接点，aop通过切点定位到特定的连接点
    
  ###使用切面
    * 加入jar包 
      * com.springsource.org.aopallicance-1.00.jar
      * com.springsource.org.aspectj.weaver-1.6.8.Release
      * spring-aop-4.0.0.Realease.jar
      * spring-aspects-4.0.0.Realease.jar
      
      * common-logging-1.1.3.jar
      * spring-beans-4.0.0.Realease.jar
      * spring-context-4.0.0.Realease.jar
      * spring-core-4.0.0.Realease.jar
      * spring-expression-4.0.0.Realease.jar
    * 在配置文件中加入aop命名空间
   ① 基于注解的方式在配置文件中加入如下配置 （自动为匹配的类生成代理对象）
    <aop:aspectj-autoproxy></aop:aspectj-autoproxy>
   ② 把横切关注点的代码抽象到切面的勒种
   切面首先是一个IOC中的bean,即加入@Component注解
   切面还需要加入@Aspect
   ③ 在类中声明通知（就是方法，在方法前加入@before注解）
      * 前置通知
      * 后置通知
      * 返回通知
      * 异常通知
      * 环绕通知
  
  事物
  ======    
  
  * 声明式事物
        
        * <bean id="transactionManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
             <property name="dataSource" ref="dataSource"></property>
          </bean>
        * <tx:annotation-driven transaction-manager="transactionManager" />
        * 在对应方法或类上添加@transactional     
     
  * 编程式事物    
  * 事物的传播行为(使用propagation 指定事物的传播行为，即当前的事物方法被另外一个事物方法调用时，如何使用事物)
    * @Transactional(propagation = Propagation.REQUIRED)(默认取值为使用调用方法的事物)
    * propagation = Propagation.REQUIRES_NEW(开启事物，即被调用方法用自己的)  
    * isolation = Isolation.READ_COMMITTED,      设置隔离级别
    * noRollbackFor = {BookStockException.class} 对BookStockException异常不回滚
    * readOnly=true  只读事物（事物中如果有写操作会报错）
    * timeout=3 使用timeout指定强制回滚之前事物可以占用的时间（可以用三秒，超过3秒回滚）