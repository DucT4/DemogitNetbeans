/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.luyentap1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ServiceList extends ArrayList<Service>{
       //ham hien thi
     public void displayAll (){
         //cach1:
         
         /*for (int i=0; i<size();i++){
             Service s= get(i);
             System.out.println(s);
           
         } */
         
         //cach 2: su dung pointer
         for (Service s : this) {
             System.out.println(s);
         }
         
         
         //cach3:Iterator
         Iterator<Service> it = iterator();
         while (it.hasNext()){
             Service s = it.next();
             System.out.println(s);
         }
     }
        
     public ArrayList<Service> searchByName (String name){
         ArrayList<Service> resultService = new ServiceList();
         for (Service s : this) {
             if(s.getName().contains(name)){
                 resultService.add(s);
             }
         }
         return resultService;
     }
     
     public Service findServiceId(int id){
         Service resultService =null;
         for (Service s : this) {
             if(s.getId()==id){
                 resultService=s;
                 break;
                 
             }
         }
         return resultService;
     }
     
     public boolean updateService (int id){
          Service resultService = findServiceId(id);
          if (resultService!=null){
              Scanner sc= new Scanner(System.in);
              System.out.printf("Enter new service's name:");
              resultService.setName(sc.nextLine());
              System.out.printf("Enter new service's id:");
              resultService.setId(sc.nextInt());
              return true;
          } else{
              System.out.println("Service not found!!");
              return false;
          }
     }
       
     public boolean deletaService (int id){
         Service resultService = findServiceId(id);
         
         if (resultService!=null){
             remove(resultService);
             return  true;
         } else
         {
             System.out.println("Service not found!!");
             return false;
         }
     }
    
     public void sortByPrice(){
      Collections.sort(this);
     }
   
     public void sortByName (){
         Collections.sort(this, Service.tmp);
     }
   
}
