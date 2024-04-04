package com.example.Modul2;
import java.util.Scanner;
public class Percobaanswitchcase_kel42 {
    public static void main(String[] args) {
        System.out.println("Kelompok 42");
        Scanner scan = new Scanner(System.in);
        System.out.println("pilih menu: ");
        int i=scan.nextInt();
        switch (i){
            case (1):System.out.println("nasi goreng - Rp.17k");
                break;
            case (2):System.out.println("magelangan - Rp.16k");
                break;
            case (3):System.out.println("ayam bali - Rp.14k");
                break;
            case (4):System.out.println("indomie telor - Rp.18k");
                break;
            case (5):System.out.println("omelet - Rp.16k");
                break;
            default:System.out.println("menu tidak tersedia");
                break;
        }
        System.out.println("Program Selesai!");
    }
}
