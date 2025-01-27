//Write a program to take 2 numbers and print their quotient and reminder

import java.util.*;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print(" The first number is : ");
    int num1 = sc.nextInt();
    System.out.print(" The second number is : ");
    int num2 = sc.nextInt();
    Quotient quotient = new Quotient();
    int ans1 = quotient.quo(num1,num2);
    Reminder reminder = new Reminder();
    int ans2 = reminder.rem(num1,num2);
    System.out.println(" The Quotient of the number "+num1+ " and "+num2+" is "+ans1+" and the reminder of "+num1+" and "+num2+" is "+ans2);
    }
}

class Quotient{
     public int quo(int num1, int num2) {
        return num1 / num2;
    }
}
class Reminder{
     public int rem(int num1, int num2) {
        return num1 % num2;
    }
}