package com.gupaoedu.vip.pattern.factory.simplefactory;

import com.gupaoedu.vip.pattern.factory.ChineseBook;
import com.gupaoedu.vip.pattern.factory.IBook;

/**
 * @author gaopengchao
 * 2019年3月13日
 */
public class SimpleFactoryTest
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        BookFactory factory = new BookFactory();
        IBook book = factory.create(ChineseBook.class);
        book.viewBook();
    }

}
