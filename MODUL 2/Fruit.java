package module02.problem01;

public class Fruit {
    private String fruitName;
    private double price;
    private double weight;
    private double purchaseTotal;
    private double pricePerKg;

    public Fruit(String fruitName, double weight, double price, double purchaseTotal) {
        this.fruitName = fruitName;
        this.weight = weight;
        this.price = price;
        this.purchaseTotal = purchaseTotal;
        this.pricePerKg = this.price / this.weight;
    }

    public void printInfo() {
        System.out.println("Nama Buah: " + fruitName);
        System.out.println("Berat: " + weight);
        System.out.println("Harga: " + price);
        System.out.println("Jumlah Beli: " + purchaseTotal + "kg");
        System.out.printf("Harga Sebelum Diskon: Rp%.2f\n", getPreDiscountPrice());
        System.out.printf("Total Diskon: Rp%.2f\n", getDiscountTotal());
        System.out.printf("Harga Setelah Diskon: Rp%.2f\n\n", getPostDiscountPrice());
    }

    public double getPreDiscountPrice() {
        return this.pricePerKg * this.purchaseTotal;
    }
    public double getDiscountTotal() {
        int discountThresholdKg = 4;
        double discountPercentage = 0.02;

        int discountBatches = (int)(this.purchaseTotal / discountThresholdKg);
        return discountBatches * (this.pricePerKg * discountThresholdKg) * discountPercentage;
    }
    public double getPostDiscountPrice() {
        return getPreDiscountPrice() - getDiscountTotal();
    }
}