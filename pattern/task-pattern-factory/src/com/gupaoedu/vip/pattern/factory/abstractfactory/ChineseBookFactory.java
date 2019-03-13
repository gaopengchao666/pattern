package com.gupaoedu.vip.pattern.factory.abstractfactory;

/**
 * @author gaopengchao
 * 2019年3月13日
 */
public class ChineseBookFactory implements IBookFactory
{
    @Override
    public IJavaBook createJava()
    {
        return new ChineseJavaBook();
    }

    @Override
    public IPhpBook createPhp()
    {
        return new ChinesePhpBook();
    }

}
