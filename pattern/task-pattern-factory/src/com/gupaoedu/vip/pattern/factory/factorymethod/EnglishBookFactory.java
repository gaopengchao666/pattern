package com.gupaoedu.vip.pattern.factory.factorymethod;

import com.gupaoedu.vip.pattern.factory.EnglishBook;
import com.gupaoedu.vip.pattern.factory.IBook;

/**
 * @author gaopengchao
 * 2019年3月13日
 */
public class EnglishBookFactory implements IBookFactory
{
    @Override
    public IBook create()
    {
        return new EnglishBook();
    }

}
