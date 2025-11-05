package ie.atu;

import java.util.Scanner;
import java.util.ArrayList;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        while(true){


        System.out.println("Welcome to Order Management System");
        System.out.println("1) Add Order");
        System.out.println("2) Update Order");
        System.out.println("3) List Orders");
        System.out.println("4) Exit");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if (choice < 1 || choice > 4){
            System.out.println("Please enter a valid choice");
        }
        else {
            switch(choice){
                case 1 ->{
                    System.out.println("Enter Order ID");
                    Order.orderid = sc.nextInt();
                    if(Order.orderid == Order.Orderlist.get(Order.orderid)){
                        System.out.println("Duplicate Order ID please try again");
                    }
                    else {
                        Order.Orderlist.add(Order.orderid);
                        System.out.println("Order ID added successfully");
                    }

                }

                case 2 -> {
                    System.out.println("Enter Order ID which you want to update");
                }

                case 3 -> {
                    System.out.println("Your Order List");
                    System.out.println(Order.Orderlist);
                }
                case 4 -> {
                    return;
                }

            }
        }




    }
}
}