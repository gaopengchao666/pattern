package cn.com.myproxy;

/**
 * @author gaopengchao
 * 2019年6月4日
 */
public class MyProxyTest
{
    public static void main(String[] args)
    {
        try {
            //JDK动态代理的实现原理
            Person obj = (Person) new MyMeipo().getInstance(new Girl());
            System.out.println(obj.getClass());
            obj.findLove();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
}
