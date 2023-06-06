/*
 * Copyright (c) 2017, 2023, zxy.cn All rights reserved.
 *
 */
package cn.black;

/**
 * <p>Description:定义数组存储3部汽车对象</p>
 * 汽车的属性：品牌、价格、颜色
 * 创建三个汽车对象，数据通过键盘录入而来，并把数据存入到数组当中
 * <p>Class:Car</p>
 * <p>Powered by zxy On 2023/5/25 19:28 </p>
 *
 * @author zxy [zxy06291@163.com]
 * @version 1.0
 * @since 17
 */
public class Car {
    private String brand;//品牌
    private int price;
    private String color;

    public Car() {
    }

    public Car(String brand, int price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
