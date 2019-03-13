package com.gupaoedu.vip.pattern.factory.abstractfactory;

/**
 * @author gaopengchao
 * 2019年3月13日
 */
public class ChineseJavaBook implements IJavaBook
{
    @Override
    public void viewBook()
    {
        System.out.println("JAVA编程思想");
    }

}
