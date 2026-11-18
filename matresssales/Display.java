/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.matresssales;

/**
 *
 * @author Student
 */
public class Display {
     
    private IProduct product;

    public Display(IProduct product) {
        this.product = product;
    }
    public void printTotalProductSales(){
        System.out.println ("The the total of Prooducts  sold)" + product.GetTotalProductsSold());
    }
    public void printAverageProductSales(){
         System.out.println ("The Averege of Prooducts  sold)" + product.GetAverageProductsSold());
    }
      public void printMostPopularProduct(){
          System.out.println ("The most popular sold is)" + product.GetMostPopularProduct());
      }
}
