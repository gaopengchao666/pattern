package com.gupaoedu.vip.pattern.factory.factorymethod;

/**
 * @author gaopengchao
 * 2019年3月13日
 */
public class FactoryMethodTest
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        IBookFactory factory = new ChineseBookFactory();
        factory.create().viewBook();
        
        factory = new EnglishBookFactory();
        factory.create().viewBook();
    }

}
