import java.util.Scanner;

public class LuasPersegiPanjang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan panjang persegi panjang: ");
        double panjang = scanner.nextDouble();

        System.out.println("Masukkan lebar persegi panjang: ");
        double lebar = scanner.nextDouble();

        double luas = hitungLuasPersegiPanjang(panjang, lebar);

        System.out.println("Luas persegi panjang adalah: " + luas);
    }

    // Method untuk menghitung luas persegi panjang
    public static double hitungLuasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }
}
