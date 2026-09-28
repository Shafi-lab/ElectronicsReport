/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.electronicsreport;

/**
 *
 * @author Student
 */
import java.util.Scanner;

// 1. Interface
interface IConsoles {
    String getConsoleType();
    String getStore();
    int getTotalSales();
}

// 2. Abstract Class
abstract class Console implements IConsoles {
    protected String consoleType;
    protected String storeName;
    protected int totalSales;

    public Console(String consoleType, String storeName, int totalSales) {
        this.consoleType = consoleType;
        this.storeName = storeName;
        this.totalSales = totalSales;
    }

    @Override
    public String getConsoleType() { return consoleType; }

    @Override
    public String getStore() { return storeName; }

    @Override
    public int getTotalSales() { return totalSales; }
}

// 3. Subclass
class ConsoleSales extends Console {
    public ConsoleSales(String consoleType, String storeName, int totalSales) {
        super(consoleType, storeName, totalSales);
    }

    public void printReport() {
        System.out.println("\nCONSOLE SALES REPORT");
        System.out.println("********************");
        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("STORE: " + getStore());
        System.out.println("TOTAL SALES: " + getTotalSales());
    }
}

// 4. Main Class - Changed to match your filename 'iConsole.java'
public class iConsole {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Select the beverage type");
        System.out.println("  1) PS5");
        System.out.println("  2) XBOX");
        System.out.println("  3) SWITCH");
        
        int choice = input.nextInt();
        input.nextLine(); 
        
        String selectedConsole = "";
        if (choice == 1) {
            selectedConsole = "PS5";
        } else if (choice == 2) {
            selectedConsole = "XBOX";
        } else if (choice == 3) {
            selectedConsole = "SWITCH";
        }
        
        System.out.print("Enter the store: ");
        String store = input.nextLine();
        
        System.out.print("Enter the total sales of " + selectedConsole + " consoles for " + store + ": ");
        int sales = input.nextInt();
        
        ConsoleSales report = new ConsoleSales(selectedConsole, store, sales);
        report.printReport();
        
        input.close();
    }
}
