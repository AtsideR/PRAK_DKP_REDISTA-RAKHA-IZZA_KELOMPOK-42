package com.company; //sesuaikan nama package
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
// write your code here
        String email, password;
        Scanner input = new Scanner(System.in);
        System.out.print("Email : ");
        email = input.nextLine();
        System.out.print("Password : ");
        password = input.nextLine();
        userService satu = new userService( email, password );
        satu.login();
    }
}