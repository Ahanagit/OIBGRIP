/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author AHANA
 */
import java.util.*;

public class Atm{
    public static void main(String args[]){
        int balance = 0,withdraw,deposit;
        
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.println("Welcome to MyAtm");
            System.out.println("Choose the option");
            System.out.println("1.Withdraw");
            System.out.println("2.Deposit");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");
            
            int choice =  sc.nextInt();
            
            switch(choice){
                case 1: 
                    System.out.println("Enter the money to be withdrawn: ");
                        withdraw = sc.nextInt();
                        if(balance>=withdraw){
                            System.out.println("Please collect your cash");
                            balance = balance - withdraw;
                            System.out.println("Your available balance is " + balance);
                        }else{
                            System.out.println("insufficient balance");
                        }
                        break;
                case 2:
                    System.out.println("Enter the money to be deposited: ");
                    deposit = sc.nextInt();
                    balance =  balance + deposit;
                    System.out.println("Your current balance is : "+balance);
                    break;
                    
                case 3:
                    
                    System.out.println("Available balance:"+balance);
                    break;
                    
                case 4:
                    System.exit(0);
                    
            }
        }
    }
}