/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sales;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Admin
 */
public class Sales {

    public static void main(String[] args) {
     
        int totalnumberofsales;
        int averagenumberofproductssoldperproduct;
        String popularproductbasedonthehighestsales;
        
        
        //display
        System.out.println("total number of sales: ");
        System.out.println("average number of products sold per product/9; " + "totalnumberofsales");
        System.out.println("popular product based on the highest sales");
        
        
    }
}

public class Products {
    public interface Iproduct{
        
        int GetTotalProductsSold();
        double GetAverageProductSold();
        String GetMostPopularProduct();
        
    }
}

public class PrintProduct {
    public static void main(String[] args) {
        
        System.out.println("Total product sales: ");
        System.out.println("Average product sales: ");
        System.out.println("mos popular product sale: ");
    }
}