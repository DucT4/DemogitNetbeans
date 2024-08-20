/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.luyentap1;

/**
 *
 * @author Admin
 */
public class Pet {
    private int id;
    private String name;

    public Pet(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Pet() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" + "id=" + id + ", name=" + name + '}';
    }
    
    
    
    
    
    
}
