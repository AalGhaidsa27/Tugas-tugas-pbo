import java.util.Scanner;

public class BangunDatarRuang {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Persegi
        System.out.print("Masukkan sisi persegi: ");
        int sisi = input.nextInt();
        System.out.println("Luas Persegi: " + (sisi * sisi));
        System.out.println("Keliling Persegi: " + (4 * sisi));

        // Segitiga
        System.out.print("Masukkan alas segitiga: ");
        int alas = input.nextInt();
        System.out.print("Masukkan tinggi segitiga: ");
        int tinggi = input.nextInt();
        System.out.print("Masukkan sisi miring segitiga: ");
        int sisiMiring = input.nextInt();
        System.out.println("Luas Segitiga: " + (0.5 * alas * tinggi)); 
        System.out.println("Keliling Segitiga: " + (alas + tinggi + sisiMiring));

        // Lingkaran
        System.out.print("Masukkan jari-jari lingkaran: ");
        int r = input.nextInt();
        System.out.println("Luas Lingkaran: " + (Math.PI * r * r));
        System.out.println("Keliling Lingkaran: " + (2 * Math.PI * r));

        // Tutup Scanner
        input.close();
    }
}
