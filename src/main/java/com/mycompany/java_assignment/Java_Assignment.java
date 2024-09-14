package com.mycompany.java_assignment;
import java.util.*;

public class Java_Assignment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Balance  = 5000; 
        System.out.println("Welcome to Dutch Bangla ATM Booth : ");
        System.out.println("1.Withdraw");
        System.out.println("2.Deposit");
        System.out.println("3.Check Balance");
        System.out.println("4.Exit");
        System.out.print("Please Enter A number : ");
        int input = sc.nextInt();
        while(true)
        {
            switch (input) {
            case 1:
                System.out.println("Your Account Have 5000 TK ");
                System.out.print("Please Enter The Amount You want to Withdraw : ");
                int withdrawmoney = sc .nextInt();
                if(withdrawmoney <= Balance)
                {
                    System.out.println("Dear Customer You Successfully WithDraw  : " + withdrawmoney + " TK");
                }
                else
                {
                    System.out.println("Insufficient Funds");
                }   break;
            case 2:
                System.out.print("Please Enter The Amount You want to Diposit : ");
                int dipositmoney = sc .nextInt();
                System.out.println("Dear Customer You Successfully Diposit  : " + dipositmoney + " TK");
                dipositmoney = dipositmoney+Balance ;
                System.out.println("Dear Customer Your Account Balance is  : " + dipositmoney + " TK");
                break;
            case 3:
                System.out.println("Dear Customer Your Account Balance is  : " + Balance + " TK");
                break;
            case 4:
                System.out.println("Thank You For Being With Us");
                System.exit(0);
            default:
                break;
        }
        }
        
}
}
