package fundtransfer.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReadDisplay {

    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public void show(String message) {
        System.out.println(message);
    }

    public void showLine() {
        System.out.println("_________________________");
    }

    public String readLine(String message) {
        show(message);
        try {
            return bufferedReader.readLine();
        } catch (Exception e) {
            show(e.getMessage());
            return null;
        }
    }
}
