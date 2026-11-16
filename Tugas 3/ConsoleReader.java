import java.util.Scanner;

public class ConsoleReader implements InputService {
    private final Scanner sc;

    public ConsoleReader() {
        this.sc = new Scanner(System.in);
    }

    @Override
    public String nextLine(String label) {
        System.out.print(label);
        return sc.nextLine();
    }

    @Override
    public int nextInt(String label) {
        while (true) {
            System.out.print(label);
            String input = sc.nextLine().trim();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid, masukkan angka.");
            }
        }
    }

    @Override
    public void close() {
        sc.close();
    }
}