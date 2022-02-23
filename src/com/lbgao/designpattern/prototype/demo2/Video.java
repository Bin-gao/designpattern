package com.lbgao.designpattern.prototype.demo2;

import java.util.Date;

/**
 * @Auther: lbgao
 * @Date: 2022/2/23 22:58
 */


/*
1. 实现一个接口 Cloneable
2. 重写一个方法 clone()
 */
public class Video implements Cloneable {

    private String name;
    private Date create;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Video clone = (Video) super.clone();

        Date date = new Date();
        clone.setCreate(date);

        return clone;
    }

    public Video(String name, Date create) {
        this.name = name;
        this.create = create;
    }

    public Video() {
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", create=" + create +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreate() {
        return create;
    }

    public void setCreate(Date create) {
        this.create = create;
    }
}
