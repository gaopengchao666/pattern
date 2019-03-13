package com.gupaoedu.vip.pattern.factory.abstractfactory;

/**
 * @author gaopengchao
 * 2019年3月13日
 */
public class EnglishBookFactory implements IBookFactory
{
    @Override
    public IJavaBook createJava()
    {
        return new EnglishJavaBook();
    }

    @Override
    public IPhpBook createPhp()
    {
        return new EnglishPhpBook();
    }
}
