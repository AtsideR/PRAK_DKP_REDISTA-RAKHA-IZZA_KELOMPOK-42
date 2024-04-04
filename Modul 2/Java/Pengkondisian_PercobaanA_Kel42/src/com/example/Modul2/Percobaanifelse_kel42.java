package com.example.Modul2;
import java.util.Scanner;
public class Percobaanifelse_kel42 {
    public static void main(String[] args) {
        System.out.println("Kelompok 42");
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Angka: ");
        int i=scan.nextInt();
        if (i>10){
            System.out.println("Angka lebih dari 10 yaitu "+i);
        } else {
            System.out.println("Angka kurang dari 10 yaitu "+i);
        }
        System.out.println("Program Selesai!");
    }
}
