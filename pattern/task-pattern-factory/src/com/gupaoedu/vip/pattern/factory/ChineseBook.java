package com.gupaoedu.vip.pattern.factory;

/**
 * @author gaopengchao
 * 2019年3月13日
 */
public class ChineseBook implements IBook
{
    @Override
    public void viewBook()
    {
        System.out.println("这是中文书");
    }

}
