/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.luyentap1;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class Order {

    private long id;
    private Date orderDate;
    private ArrayList<orderDetail> detailList;

    public Order() {
        id =System.currentTimeMillis();
        orderDate = new Date();
        detailList = new ArrayList<>();
    }

    public Order(long id, Date orderDate, ArrayList<orderDetail> detailList) {
        this.id = id;
        this.orderDate = orderDate;
        this.detailList = detailList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public ArrayList<orderDetail> getDetailList() {
        return detailList;
    }

    public void setDetailList(ArrayList<orderDetail> detailList) {
        this.detailList = detailList;
    }

    public void exportOutput() {
        System.out.println("Order ID:" + this.id);
        System.out.println("Order date: " + this.orderDate);
        System.out.println("List detailed orders: ");
        for (orderDetail orderDetail : detailList) {
            System.out.println(orderDetail);
        }

    }

    public boolean createDetail(orderDetail o) {
        return this.detailList.add(o);
    };
}


