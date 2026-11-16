public abstract class MenuPage {
    private final String pageTitle;
    private final InputService input;

    public MenuPage(String pageTitle, InputService input) {
        this.pageTitle = pageTitle;
        this.input = input;
    }

    public String getPageTitle() {
        return pageTitle;
    }

    protected InputService getInput() {
        return input;
    }

    public final void show() {
        System.out.println("\n========================================");
        System.out.println("  " + pageTitle.toUpperCase());
        System.out.println("========================================");
        runPage();
        System.out.println("----------------------------------------");
        input.nextLine("Tekan Enter untuk kembali ke menu...");
    }

    protected abstract void runPage();
}