import java.util.Scanner;

public class TabelTugasNilai06 {
    
    public static int[][] nilai = new int[5][7];
    public static String[] nama = {"Sari","Rina","Yani","Dwi","Lusi"};

    public static void Nilai() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[0].length; j++) {
                System.out.print("Masukkan nilai "+nama[i]+" di minggu "+(j+1)+": ");
                nilai [i][j] = sc.nextInt();
            }
        }
    }

    public static void TampilkanNilai() {
        System.out.print("Nama");
        for (int i = 0; i < nilai[0].length; i++) {
            System.out.print("\tMinggu "+(i+1));
        }
        System.out.println();
        for (int i = 0; i < nama.length; i++) {
            System.out.print(nama[i]+"\t");
            for (int j = 0; j < nilai[0].length; j++) {
                System.out.print(nilai[i][j]+"\t\t");
            }
            System.out.println();
        }
    }

    static int cariHariTertinggi() {
        int hariTertinggi = 0;
        int nilaiTertinggi = 0;

        for (int j = 0; j < nilai[0].length; j++) {
            int totalNilaiHari = 0;

            for (int i = 0; i < nama.length; i++) {
                totalNilaiHari += nilai[i][j];
            }

            if (totalNilaiHari > nilaiTertinggi) {
                nilaiTertinggi = totalNilaiHari;
                hariTertinggi = j + 1;
            }
        }
        return hariTertinggi;
    }

    static void tampilkanMahasiswaTertinggi() {
        int mahasiswaTertinggi = 0;
        int nilaiTertinggi = 0;

        for (int i = 0; i < nama.length; i++) {
            int totalNilaiMahasiswa = 0;

            for (int j = 0; j < nilai[0].length; j++) {
                totalNilaiMahasiswa += nilai[i][j];
            }

            if (totalNilaiMahasiswa > nilaiTertinggi) {
                nilaiTertinggi = totalNilaiMahasiswa;
                mahasiswaTertinggi = i + 1;
            }
        }
        
        System.out.println("Mahasiswa dengan nilai tertinggi adalah " + nama[mahasiswaTertinggi - 1] +
                " dengan total nilai " + nilaiTertinggi +
                " (Nilai tertinggi di Minggu ke-" + cariHariTertinggi() + ")");
    }

    public static void main(String[] args) {
        Nilai();
        TampilkanNilai();
        tampilkanMahasiswaTertinggi();
    }
}