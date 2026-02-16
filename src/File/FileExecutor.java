package File;

import java.io.File;

public class FileExecutor {
    public static void main(String[] args) {
        new FileExecutor();
    }
    FileExecutor(){
    System.out.println(System.getProperty("os.name"));
    System.out.println(System.getProperty("user.home"));
    }
}
