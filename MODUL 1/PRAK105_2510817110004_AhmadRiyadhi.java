package module01.problem05;

import java.util.Locale;
import java.util.Scanner;

public class PRAK105_2510817110004_AhmadRiyadhi {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        // TODO: Buat statement print() untuk meminta nilai jari-jari dan variabel untuk menyimpannya
        System.out.print("Masukkan jari-jari: ");
        double radius = input.nextDouble();
        // TODO: Buat statement print() untuk meminta nilai radius dan variabel untuk menyimpannya
        System.out.print("Masukkan tinggi: ");
        double height = input.nextDouble();
        // TODO: Buat variabel untuk menampung nilai dari kalkulasi volume tabung
        final double PHI = 3.14;
        double volume = PHI * radius * radius * height;
        // TODO: Buat statement printf() untuk menampilkan volume tabung sesuai dengan format di Lembar Kerja Praktikum
        System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3\n", radius, height, volume);
    }
}