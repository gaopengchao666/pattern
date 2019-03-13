package com.gupaoedu.vip.pattern.factory.simplefactory;

import com.gupaoedu.vip.pattern.factory.IBook;

/**
 * @author gaopengchao
 * 2019年3月13日
 */
public class BookFactory
{
    public IBook create(Class<? extends IBook> clazz)
    {
        try
        {
            if (null != clazz)
            {
                return clazz.newInstance();
            }
        }
        catch(InstantiationException | IllegalAccessException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
