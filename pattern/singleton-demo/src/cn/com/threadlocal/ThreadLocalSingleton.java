package cn.com.threadlocal;

/**
 * 
 * @author gaopengchao
 * 2019年5月14日
 */
public class ThreadLocalSingleton
{
    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance = new ThreadLocal<ThreadLocalSingleton>()
    {
        @Override
        protected ThreadLocalSingleton initialValue()
        {
            return new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton()
    {
    }

    public static ThreadLocalSingleton getInstance()
    {
        return threadLocalInstance.get();
    }
}
