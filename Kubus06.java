import java.util.Scanner;

public class Kubus06 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s,vol,lP;
        System.out.println("Masukkan Panjang Sisi");
        s = sc.nextInt();

        vol=hitungVolume(s, s, s);
        System.out.println("Volume balok adalah "+vol);

        lP=hitungLuasPemukaan(s);
        System.out.println("Luas Permukaan adalah "+lP);
    }
    static int hitungVolume (int a, int b, int c) {
        int volume = a * b * c;
        return volume;
    }
    static int hitungLuasPemukaan (int sisi) {
        int LuasP = 6 * (sisi*sisi);
        return LuasP;
    }
}
