package module01.problem02;

import java.util.Scanner;

public class PRAK102_2510817110004_AhmadRiyadhi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TODO: Simpan input yang diterima pada variabel berikut
        int startingNum = input.nextInt();
        int i = 0;
        while (i <= 10) {
            // TODO: Buat if-else sesuai kondisi Lembar Kerja Praktikum
            if (startingNum % 5 == 0) {
                System.out.print((startingNum / 5) - 1);
            } else {
                System.out.print(startingNum);
            }
            if (i < 10) {
                System.out.print(", ");
            }
            startingNum++;
            i++;
        }
    }
}