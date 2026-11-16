import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppSession {
    private final List<String> inputHistory = new ArrayList<>();

    public void addText(String text) {
        inputHistory.add(text);
    }

    public List<String> getInputHistory() {
        return Collections.unmodifiableList(inputHistory);
    }
}