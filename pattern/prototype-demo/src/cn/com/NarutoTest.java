package cn.com;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gaopengchao
 * 2019年5月14日
 */
public class NarutoTest
{
    public static void main(String[] args) throws Exception
    {
        Naruto naruto = new Naruto();
        naruto.setLevel("火影");
        naruto.setLove("日向 雏田");
        List<String> ability = new ArrayList<String>();
        ability.add("通灵之术");
        ability.add("仙术");
        ability.add("螺旋丸");
        naruto.setAbility(ability);
        
        Naruto yingfenshen = (Naruto) naruto.clone();
        Naruto fenshen = (Naruto) naruto.shallowClone();
        
        System.out.println("影分身之术：" + ! (yingfenshen.getAbility() == naruto.getAbility()) + "---真正的分身");
        System.out.println("分身之术：" + ! (fenshen.getAbility() == naruto.getAbility()) + "---假的分身");
    }
}
