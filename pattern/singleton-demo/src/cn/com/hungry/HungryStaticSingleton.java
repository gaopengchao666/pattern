package cn.com.hungry;

/**
 * 饿汉式静态块单例
 * 
 * @author gaopengchao 2019年5月14日
 */
public class HungryStaticSingleton
{
    private static final HungryStaticSingleton hungrySingleton;
    static
    {
        hungrySingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton()
    {
    }

    public static HungryStaticSingleton getInstance()
    {
        return hungrySingleton;
    }
}
