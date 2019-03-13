package com.gupaoedu.vip.pattern.factory.abstractfactory;

/**
 * @author gaopengchao
 * 2019年3月13日
 */
public interface IBookFactory
{
    IJavaBook createJava();
    
    IPhpBook createPhp();
}
