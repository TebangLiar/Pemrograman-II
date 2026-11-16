import java.util.ArrayList;
import java.util.List;

public class CliRunner {
    private final List<MenuPage> pages;
    private final InputService input;
    private boolean active;

    public CliRunner(InputService input) {
        this.input = input;
        this.pages = new ArrayList<>();
        this.active = false;
    }

    public void addPage(MenuPage page) {
        if (page != null) {
            pages.add(page);
        }
    }

    public void run() {
        active = true;
        while (active) {
            printMenu();
            int choice = input.nextInt("Pilih menu: ");
            processChoice(choice);
        }
        input.close();
    }

    private void printMenu() {
        System.out.println("\n============== MENU UTAMA ==============");
        for (int i = 0; i < pages.size(); i++) {
            System.out.println((i + 1) + ". " + pages.get(i).getPageTitle());
        }
        System.out.println("0. Keluar");
        System.out.println("========================================");
    }

    private void processChoice(int choice) {
        if (choice == 0) {
            System.out.println("Program selesai.");
            active = false;
            return;
        }
        int idx = choice - 1;
        if (idx >= 0 && idx < pages.size()) {
            pages.get(idx).show();
        } else {
            System.out.println("Nomor menu tidak tersedia.");
        }
    }
}