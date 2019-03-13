package com.gupaoedu.vip.pattern.factory.factorymethod;

import com.gupaoedu.vip.pattern.factory.ChineseBook;
import com.gupaoedu.vip.pattern.factory.IBook;

/**
 * @author gaopengchao
 * 2019年3月13日
 */
public class ChineseBookFactory implements IBookFactory
{

    @Override
    public IBook create()
    {
        return new ChineseBook();
    }

}
