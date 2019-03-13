package com.gupaoedu.vip.pattern.factory.abstractfactory;

/**
 * @author gaopengchao
 * 2019年3月13日
 */
public class ChinesePhpBook implements IPhpBook
{
    @Override
    public void viewBook()
    {
        System.out.println("PHP编程思想");
    }

}
