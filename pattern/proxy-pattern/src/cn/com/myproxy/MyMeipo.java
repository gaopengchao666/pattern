package cn.com.myproxy;

import java.lang.reflect.Method;

/**
 * @author gaopengchao
 * 2019年6月4日
 */
public class MyMeipo implements MyInvocationHandler
{
    private Object target;
    
    public Object getInstance(Object targett)
    {
        this.target = targett;
        Class<?> clazz = targett.getClass();
        return MyProxy.newProxyInstance(new MyClassLoader(),clazz.getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target,args);
        after();
        return obj;
    }

    private void before(){
        System.out.println("我是媒婆，我要给你找对象，现在已经确认你的需求");
        System.out.println("开始物色");
    }

    private void after(){
        System.out.println("OK的话，准备办事");
    }
}
