/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.luyentap1;

/**
 *
 * @author Admin
 */
public class orderDetail {
    
    
    
    private Pet pet;
    private Service service;

    public orderDetail() {
        this.pet = new Pet();
        this.service = new Service();
    }

    public orderDetail(Pet pet, Service service) {
        this.pet = pet;
        this.service = service;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return "orderDetail{" + "pet=" + pet + ", service=" + service + '}';
    }
    
    
}
