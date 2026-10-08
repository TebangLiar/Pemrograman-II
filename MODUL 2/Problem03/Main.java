package module02.problem03;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        //Pada baris ini terjadi error karena kurangnya titik koma (;)
        //e.name = "Roi"
        e.name = "Roi";
        e.origin = "Kingdom of Orvel";
        e.setRole("Assasin");
        //Pada baris ini terjadi error karena atribut age belum diinisialisasi nilainya
        //e.age;
        e.age = 17;

        //Pada baris ini terjadi error karena teks keluaran yang diminta adalah "Nama: " bukan "Nama Pegawai: "
        //System.out.println("Nama Pegawai: " + e.getName());
        System.out.println("Nama: " + e.getName());
        System.out.println("Asal: " + e.getOrigin());
        System.out.println("Jabatan: " + e.role);
        //Pada baris ini terjadi error karena kurangnya penambahan kata "tahun" pada keluaran
        //System.out.println("Umur: " + e.age);
        System.out.println("Umur: " + e.age + " tahun");
    }
}