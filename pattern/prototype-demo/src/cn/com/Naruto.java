package cn.com;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;


/**
 * 漩涡鸣人
 * @author gaopengchao
 * 2019年5月14日
 */
public class Naruto implements Cloneable,Serializable
{
    private static final long serialVersionUID = 2412584042509284217L;
    
    private String level;//忍者等级
    
    private String love;//喜欢的人
    
    private List<String> ability;//技能

    /**
     * 影分身之术
     */
    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        Naruto yingfenshen  = null;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos;
        try
        {
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            yingfenshen = (Naruto) ois.readObject();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return yingfenshen;
    }
    
    /**
     * 分身
     * @return
     */
    public Object shallowClone()
    {
        Naruto fenshen = new Naruto();
        fenshen.setAbility(this.getAbility());
        fenshen.setLevel(this.getLevel());
        fenshen.setLove(this.getLove());
        return fenshen;
    }

    public String getLevel()
    {
        return level;
    }

    public void setLevel(String level)
    {
        this.level = level;
    }

    public String getLove()
    {
        return love;
    }

    public void setLove(String love)
    {
        this.love = love;
    }

    public List<String> getAbility()
    {
        return ability;
    }

    public void setAbility(List<String> ability)
    {
        this.ability = ability;
    }
    
}
