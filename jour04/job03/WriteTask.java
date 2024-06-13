package jour04.job03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTask implements Runnable {
        private String text;
    private String fileName;
    private boolean append;

    public WriteTask(String text, String fileName, boolean append) {
        this.text = text;
        this.fileName = fileName;
        this.append = append;
    }

    @Override
    public void run() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, append))) {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
