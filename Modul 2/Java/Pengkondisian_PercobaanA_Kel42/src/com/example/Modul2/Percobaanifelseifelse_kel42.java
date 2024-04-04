package com.example.Modul2;
import java.util.Scanner;
public class Percobaanifelseifelse_kel42 {
    public static void main(String[] args) {
        System.out.println("Kelompok 42");
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Angka: ");
        int i=scan.nextInt();
        if (i==0){
            System.out.println("Angka bernilai 0");
        }
        else if (i>0){
            System.out.println("Angka bernilai positif yaitu "+i);
        }
        else {
            System.out.println("Angka Bernilai negatif yaitu "+i);
        }
        System.out.println("Program Selesai!");
    }
}
