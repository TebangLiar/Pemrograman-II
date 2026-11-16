public class Main {
    public static void main(String[] args) {
        InputService io = new ConsoleReader();
        AppSession session = new AppSession();

        CliRunner runner = new CliRunner(io);
        runner.addPage(new InputTextPage(io, session));
        runner.addPage(new ShowTextPage(io, session));

        runner.run();
    }
}