package module02.problem02;

import java.util.Locale;

public class Coffee {

    private String name;
    private String customer;
    private String size;
    private double price;

    public void printInfo() {
        Locale.setDefault(Locale.US);
        System.out.println("Nama Kopi: " + name);
        System.out.println("Ukuran: " + size);
        System.out.println("Harga: Rp. " + price);
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setCustomer(String customer) {
        this.customer = customer;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getCustomer() {
        return customer;
    }

    public double getTax() {
        return price * 0.11;
    }
}