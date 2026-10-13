package module03.problem03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa Berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");

            int option = Integer.parseInt(input.nextLine());

            switch (option) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String name = input.nextLine();

                    System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                    String id = input.nextLine();

                    boolean doesIdAlreadyExist = false;
                    for (Student student : students) {
                        if (id.equals(student.getId())) {
                            doesIdAlreadyExist = true;
                            break;
                        }
                    }

                    if (doesIdAlreadyExist) {
                        System.out.println("NIM sudah digunakan.");
                    } else {
                        students.add(new Student(name, id));
                        System.out.println("Mahasiswa " + name + " ditambahkan.");
                    }

                    break;

                case 2:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String deleteId = input.nextLine();

                    boolean isIdFound = false;
                    for (Student student : students) {
                        if (deleteId.equals(student.getId())) {
                            isIdFound = true;
                            students.remove(student);
                            System.out.println("Mahasiswa dengan NIM " + deleteId + " dihapus.");
                            break;
                        }
                    }

                    if (!isIdFound) {
                        System.out.println("NIM tidak ditemukan.");
                    }

                    break;

                case 3:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dicari: ");
                    String searchId = input.nextLine();

                    boolean hasIdFound = false;
                    for (Student student : students) {
                        if (searchId.equals(student.getId())) {
                            hasIdFound = true;
                            System.out.println("NIM: " + student.getId() + ", Nama: " + student.getName());
                            break;
                        }
                    }

                    if (!hasIdFound) {
                        System.out.println("NIM tidak ditemukan.");
                    }

                    break;

                case 4:
                    System.out.println("Daftar Mahasiswa:");
                    if (students.isEmpty()) {
                        System.out.println("Daftar Mahasiswa Kosong.");
                    } else {
                        for (Student student : students) {
                            System.out.println("NIM: " + student.getId() + ", Nama: " + student.getName());
                        }
                    }

                    break;

                case 0:
                    students.clear();
                    System.out.println("Terima kasih!");

                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }
}