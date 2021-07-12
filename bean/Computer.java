package com.bai.bean;
//想这样的只有私有的属性.和get，set方法叫做实体类
//一般一个实体类对应个 一个数据库表!!!
public class Computer {
    private double price;
    private String color;
    private String typeName;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Computer{" +
                "price=" + price +
                ", color='" + color + '\'' +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}
