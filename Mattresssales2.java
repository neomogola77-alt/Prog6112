/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mattresssales2;
import java.awt.*;
import java.io.FileWriter;
import java.io.EOFException;

/**
 *
 * @author Admin
 */
public class Mattresssales2 {

    public static void main(String[] args) {
        
        String CustomerName;
        String ProductName;
        int VatAmount;
        int CommissionAmount;
        int TotalSaleAmount;
        
        System.out.println("Customer Name: ");
        System.out.println("Product Name: ");
        System.out.println(":price: ");
        System.out.println("Vat: price/15 ");
        System.out.println(":commission: price/5 ");
        System.out.println(":total:price + Vat + Commission ");
   
                
    }
}

public class ProductCalculations {
    public inerface IproductCalculations{
    
    double GetVat();
    double GetCommission();
    double GetTotal();
    
}
}