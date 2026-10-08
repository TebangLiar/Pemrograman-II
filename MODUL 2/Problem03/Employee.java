package module02.problem03;

//Pada baris ini terjadi error karena nama class tidak sesuai dengan nama file (Employee.java)
//public class Pegawai {
public class Employee {
    public String name;
    //Pada baris ini terjadi error karena tipe data char tidak sesuai dengan nilai String
    //public char origin;
    public String origin;
    public String role;
    public int age;

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    //Pada baris ini terjadi error karena method setRole() tidak memiliki parameter
    //public void setRole() {
    public void setRole(String r) {
        this.role = r;
    }
}