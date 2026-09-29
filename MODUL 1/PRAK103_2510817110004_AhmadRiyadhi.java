package module01.problem03;

import java.util.Scanner;

public class PRAK103_2510817110004_AhmadRiyadhi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TODO: Simpan input yang diterima pada variabel berikut
        int n = input.nextInt();
        int startingNum = input.nextInt();
        do {
            // TODO: Buat if statement untuk melewati bilangan genap
            if (startingNum % 2 == 0) {
                startingNum++;
            }
            // TODO: Buat statement print untuk menampilkan bilangan
            System.out.print(startingNum);
            if (n > 1) {
                System.out.print(", ");
            }
            startingNum += 2;
            n--;
        } while (n > 0);
    }
}