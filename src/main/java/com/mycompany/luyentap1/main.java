/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.luyentap1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class main {

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        ServiceList listOfService = new ServiceList();
        listOfService.add(new Service(100, 5000, "tia mong"));
        listOfService.add(new Service(101, 233, "cat long"));
        listOfService.add(new Service(102, 466, "tam bon"));
        listOfService.add(new Service(100, 5000, "massage"));

        do {
            System.out.println("1. Manage service");
            System.out.println("2. Manage customer and orders");
            System.out.println("3. Report");
            System.out.println("Enter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    int choice1;
                    do {
                        System.out.println("1.Add service");
                        System.out.println("2. Display service");
                        System.out.println("3. Update service");
                        System.out.println("4. Delete service");
                        System.out.println("5. Search service");
                        System.out.printf("Enter choice: ");
                        choice1 = sc.nextInt();

                        switch (choice1) {
                            case 1:
                                int id,
                                 price;
                                String name = null;
                                System.out.printf("Enter id:");
                                id = sc.nextInt();
                                System.out.printf("Enter price:");
                                price = sc.nextInt();
                                sc.nextLine();
                                System.out.printf("Enter name:");
                                name = sc.nextLine();
                                Service s = new Service(id, price, name);
                                System.out.println(listOfService.add(s) ? "Added successfully!!!" : "Failed add!!!");

                                break;
                            case 2:
                                System.out.println("1. Sort by price ");
                                System.out.println("2. Sort by name");
                                System.out.printf("Enter 1 or 2: ");
                                int sortChoice = sc.nextInt();
                                if (sortChoice == 1) {
                                    //sort by price
                                    listOfService.sortByPrice();
                                } else if (sortChoice == 2) {
                                    //sort by name
                                    listOfService.sortByName();
                                }
                                listOfService.displayAll();
                                break;
                            case 3:
                                int updateId;
                                System.out.printf("Enter ID to update: ");
                                updateId = sc.nextInt();
                                boolean resultUpdate = listOfService.updateService(updateId);
                                if (resultUpdate == true) {
                                    System.out.println("Updated!!!");
                                } else {
                                    System.out.println("Failed!!!");
                                }
                                break;
                            case 4:
                                //this function use delete id service
                                int deleteServiceId;
                                System.out.println("Enter Id to delete:");
                                deleteServiceId = sc.nextInt();
                                boolean resultDelete = listOfService.deletaService(deleteServiceId);
                                if (resultDelete) {
                                    System.out.println("Deleted successfully!");
                                } else {
                                    System.out.println("Deleted failed!!!");
                                }
                                break;
                            case 5:

                                System.out.println("1. Search by name");
                                System.out.println("2. Search by id");
                                System.out.printf("Enter (1 or 2):");
                                int choiceSearch = sc.nextInt();
                                switch (choiceSearch) {
                                    case 1:
                                        sc.nextLine();
                                        String searchName = null;
                                        System.out.println("Enter name to find");
                                        searchName = sc.nextLine();
                                        ArrayList<Service> resultsearchByName = listOfService.searchByName(searchName);
                                        if (resultsearchByName.isEmpty()) {
                                            System.out.println("Not found!!");
                                        } else {
                                            System.out.println("List of service that you search:");
                                            ((ServiceList) resultsearchByName).displayAll();
                                        }

                                        break;
                                    case 2:
                                        int findId;
                                        System.out.printf("Enter ID:");
                                        findId = sc.nextInt();
                                        Service resultFindById = listOfService.findServiceId(findId);
                                        if (resultFindById == null) {
                                            System.out.println("Not found");
                                        } else {
                                            System.out.println("The service you found: ");
                                            System.out.println(resultFindById);
                                        }

                                        break;
                                }
                                break;
                        }

                    } while (choice1 <= 5);

                    break;

                case 2: //Manege custoner and order

                    int choiceCustandO;
                    do {
                        System.out.println("1. Create new customer");
                        System.out.println("2. Display customers");
                        System.out.println("3. Search customer by id");
                        System.out.print("Enter choice:");
                        choiceCustandO = sc.nextInt();
                        switch (choiceCustandO) {
                            case 1:
                                Customer c = new Customer();
                                String continueAdd = "y";
                                System.out.println("Add more information for customer:");
                                do {
                                    System.out.print("Enter pet ID:");
                                    int petId = sc.nextInt();
                                    sc.nextLine();
                                    System.out.print("Enter pet Name:");
                                    String petName = sc.nextLine();
                                    Pet pet = new Pet(petId, petName);
                                    System.out.println(c.addPet(pet) ? " Added successfully!!" : "Addedd failed!!!");

                                    System.out.print("Do you want to add others pet? (y/n):");
                                    continueAdd = sc.nextLine();
                                } while (continueAdd.equalsIgnoreCase("y"));

                                System.out.println("The process of creating a vave:");
                                String ans = "y";
                                do {
                                    System.out.println("Create order:");
                                    Order order = new Order();
                                    continueAdd = "y";
                                    do {
                                        System.out.println("Choose your per winthin your pet list:");
                                        c.displayPetList();

                                        System.out.println("Enter pet id to order:");
                                        int petIdorder = sc.nextInt();
                                        Pet pet = c.findPetById(petIdorder);
                                        System.out.println("List of service or system:");
                                        listOfService.displayAll();
                                        System.out.println("Enter service ID to order:");
                                        int idService = sc.nextInt();
                                        sc.nextLine();
                                        Service service_order = listOfService.findServiceId(idService);

                                        if (pet != null && service_order != null) {
                                            orderDetail detail = new orderDetail(pet, service_order);
                                            order.createDetail(detail);
                                            System.out.println("Added detail successfully!");
                                        } else {
                                            System.out.println("Service or Pet not found!!!");
                                        }

                                        System.out.println("Add others orders:");
                                        continueAdd = sc.nextLine();
                                    } while (continueAdd.equalsIgnoreCase("y"));
                                    System.out.println(c.addOrder(order) ? "Add order successfully!" : "Added failed!!!");
                                    System.out.println("Add orthers:");
                                    ans = sc.nextLine();

                                } while (ans.equalsIgnoreCase("y"));
                                c.exportInforCustomer();
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }

                    } while (choiceCustandO <= 3);

                    break;
                case 3:
                    break;

            }
        } while (choice <= 3);
    }
}
