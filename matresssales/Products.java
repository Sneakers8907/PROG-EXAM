/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.matresssales;

/**
 *
 * @author Student
 */
public class Products implements IPropduct{
    
    private String [] names;
    private int [] sales;

    public Products(String[] names, int[] sales) {
        this.names = names;
        this.sales = sales;
    }
    public int GetProductSold(){
        int  total =0;
        for(int i = 0; i<sales.length;i++){
            for(int p = 0; p < sales[i].length;p++){
                total = sales[i][p] + total;
            }
        }
    return total;
}
    public double GetAverageProductsSold(){
        int  sales = sales.length*sales[0].length;
        return(double)GetTotalProductsSold();  
    }
    public String GetMostPopularProduct(){
        int bestTotal = 0;
        int bestIndex =0;
        
        for(int p = 0; p < sales.length;p++){
            int productTotal = 0;
            for(int i = 0;i < sales[p].length;i++){
               productTotal = productTotal + sales[p][i];
               
            }
            if(productTotal > bestTotal){
                bestTotal = productTotal;
                bestIndex = p;
            }
        }
        return names[bestIndex]+ "("+ bestTotal + ")";
    }
}
