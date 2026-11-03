package module04.problem02;

public class Cat extends Pet {
    private String furColor;

    public Cat(String name, String race, String furColor) {
        super(name, race);
        this.furColor = furColor;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Memiliki warna bulu: " + furColor);
    }
}