/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.luyentap1;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Customer {

    private long id;
    private String name;
    private ArrayList<Pet> petList;
    private ArrayList<Order> orderList;

    public Customer() {
        this.id = System.currentTimeMillis();
        this.name = "khach le";
        this.petList = new ArrayList<>();
        this.orderList = new ArrayList<>();
    }

    public Customer(long id, String name, ArrayList<Pet> petList, ArrayList<Order> orderList) {
        this.id = id;
        this.name = name;
        this.petList = petList;
        this.orderList = orderList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Pet> getPetList() {
        return petList;
    }

    public void setPetList(ArrayList<Pet> petList) {
        this.petList = petList;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    public void displayPetList() {
        for (Pet pet : this.petList) {
            System.out.println(pet);
        }
    }

    public boolean addPet(Pet pet) {
        return this.petList.add(pet);

    }

    public Pet findPetById(int id) {
        Pet result = null;
        for (Pet pet : this.petList) {
            if (pet.getId() == id) {
                result = pet;
            }
        }
        return result;
    }

    public void displayOrderList() {
        for (Order o : this.orderList) {
            o.exportOutput();
        }
    }

    public boolean addOrder(Order o) {
        return this.orderList.add(o);
    }

    public void exportInforCustomer() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);

        displayOrderList();
        displayPetList();
        }

    }
