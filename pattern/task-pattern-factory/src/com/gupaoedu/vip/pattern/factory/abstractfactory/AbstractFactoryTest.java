package com.gupaoedu.vip.pattern.factory.abstractfactory;

/**
 * @author gaopengchao
 * 2019年3月13日
 */
public class AbstractFactoryTest
{
    public static void main(String[] args)
    {
        IBookFactory factory = new ChineseBookFactory();
        factory.createJava().viewBook();
        
        factory = new EnglishBookFactory();
        factory.createPhp().viewBook();
    }

}
