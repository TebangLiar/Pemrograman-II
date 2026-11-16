import java.util.List;

public class ShowTextPage extends MenuPage {
    private final AppSession session;

    public ShowTextPage(InputService input, AppSession session) {
        super("2. Tampilkan Daftar Input User", input);
        this.session = session;
    }

    @Override
    protected void runPage() {
        List<String> history = session.getInputHistory();

        if (history.isEmpty()) {
            System.out.println("Belum ada data teks yang dimasukkan.");
            return;
        }

        System.out.println("Daftar teks yang dimasukkan user:");
        for (int i = 0; i < history.size(); i++) {
            System.out.println((i + 1) + ". " + history.get(i));
        }
    }
}