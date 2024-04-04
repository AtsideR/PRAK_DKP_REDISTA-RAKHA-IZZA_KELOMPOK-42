package com.example;
public class Percobaan3java_Kel42 {
    public static void main(String[] args) {
        System.out.println("Kelompok 42 shift 7");
        System.out.println("- Redista Rakha Izza     (21120123130085)");
        System.out.println("- Saiful Mustofa         (21120123130049)");
        System.out.println("- Ezar Hardin Wiratama   (21120123140116)");
        System.out.println("- Rafael Ardiasyah       (21120123120007)");
        String[][] array = {{"ujang organik","bayu antangin","jidan salonpas","zaki indomie", "gabus dribel"},{"ayam geprek","indomie","pecel","soto","omelet bakar",},{"geprek sohor","kantin","burjo","DipoHub","penyet bu nur"}};

        System.out.println( "Makanan kesukaan " + array[0][0] +  " adalah " + array[1][2] + ", dari resto " + array[2][3]);
        System.out.println( "Makanan kesukaan " + array[0][1] +  " adalah " + array[1][3] + ", dari resto " + array[2][1]);
        System.out.println( "Makanan kesukaan " + array[0][2] +  " adalah " + array[1][0] + ", dari resto " + array[2][0]);
        System.out.println( "Makanan kesukaan " + array[0][3] +  " adalah " + array[1][1] + ", dari resto " + array[2][2]);
        System.out.println( "Makanan kesukaan " + array[0][4] +  " adalah " + array[1][4] + ", dari resto " + array[2][4]);

        array [1][4] = "magelangan";
        array [0][2] = "epan elsidi";
        System.out.println( "dan ternyata " + array[0][2] +  " makanan kesukaannya adalah " + array[1][4] + ", dari resto " + array[2][2]);
    }
}

