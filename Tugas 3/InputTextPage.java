public class InputTextPage extends MenuPage {
    private final AppSession session;

    public InputTextPage(InputService input, AppSession session) {
        super("1. Menerima Input User", input);
        this.session = session;
    }

    @Override
    protected void runPage() {
        String text = getInput().nextLine("Masukkan teks baru: ");
        if (text.trim().isEmpty()) {
            System.out.println("Input kosong, teks tidak disimpan.");
        } else {
            session.addText(text.trim());
            System.out.println("Sukses! Teks berhasil ditambahkan ke riwayat.");
        }
    }
}