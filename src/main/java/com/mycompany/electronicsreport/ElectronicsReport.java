/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.electronicsreport;

/**
 *
 * @author Student
 */
public class ElectronicsReport {

    public static void main(String[] args) {
        // 1D Array for cities
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        
        // 1D Array for console types
        String[] consoles = {"PS5", "XBOX", "SWITCH"};
        
        // 2D Array for sales data matching the grid
        int[][] sales = {
            {1000, 2000, 3000}, // Cape Town
            {2000, 3000, 4000}, // Port Elizabeth
            {1500, 1100, 1200}  // Pretoria
        };
        
        // --- PRINT THE FIRST REPORT BLOCK ---
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("----------------------------------------");
        
        // Header spacing
        System.out.printf("%-18s%-10s%-10s%-10s\n", "", "PS5", "XBOX", "SWITCH");
        
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-18s%-10d%-10d%-10d\n", 
                cities[i], sales[i][0], sales[i][1], sales[i][2]);
        }
        
        System.out.println("----------------------------------------\n");
        
        // --- CALCULATE AND PRINT TOTALS PER CITY ---
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("----------------------------------------");
        
        int maxSales = -1;
        String cityWithMostSales = "";
        
        for (int i = 0; i < cities.length; i++) {
            int cityTotal = 0;
            for (int j = 0; j < sales[i].length; j++) {
                cityTotal += sales[i][j];
            }
            
            System.out.printf("%-18s%d\n", cities[i], cityTotal);
            
            // Check for the city with the highest sales
            if (cityTotal > maxSales) {
                maxSales = cityTotal;
                cityWithMostSales = cities[i];
            }
        }
        
        System.out.println("----------------------------------------\n");
        
        // --- PRINT THE CITY WITH THE HIGHEST TOTAL SALES ---
        System.out.println("CITY WITH THE MOST SALES: " + cityWithMostSales.toUpperCase());
    }
}

