public class coba2varargs {
    static void tampilkanData(String pesan,int... angka) {
        System.out.println(pesan);
        for (int a : angka) {
            System.out.print(a+" ");
        }
    }
    static void tampilkanData(String pesan,String... kata) {
        System.out.println(pesan);
        for (String b : kata) {
            System.out.println(b+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        tampilkanData("Angka: ",1,2,3);
        tampilkanData("\nKata: ","Aku","Ganteng");
    }
}
