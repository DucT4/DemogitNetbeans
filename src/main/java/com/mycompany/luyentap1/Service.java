/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.luyentap1;

import java.util.Comparator;

/**
 *
 * @author Admin
 */
public class Service  implements Comparable<Service>{
    private int id;
   private int price;
  private String name;

    public Service() {
    }

    public Service(int id, int price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Service{" + "id=" + id + ", price=" + price + ", name=" + name + '}';
    }

    @Override
    public int compareTo(Service o) {
        return this.price - o.getPrice();
    }
  
     // Viết hàm này là do sắp xếp thêm dựa vào name
   public static Comparator<Service> tmp = new Comparator<Service>() {
        @Override
        public int compare(Service o1, Service o2) {
           return o1.getName().compareTo(o2.getName());
        }
        
   };
}
