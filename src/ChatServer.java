import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
    static void main() {
        new ChatServer();
    }

    DataInputStream din;
    DataOutputStream dout;
    BufferedReader bufferedReader = new BufferedReader(
            new InputStreamReader(System.in)
    );

    public ChatServer() {

        int port = 8888;
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            Socket socket = serverSocket.accept();
            System.out.println(socket.getInetAddress());
            System.out.println("Connected with client");
            din = new DataInputStream(socket.getInputStream());
            dout = new DataOutputStream(socket.getOutputStream());

            readThread.start();
            writeThread.start();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    Thread readThread = new Thread() {
        public void run() {
            while (true) {
                try {
                    String input = din.readUTF();
                    System.out.println("Client says >> " + input);
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    };

    Thread writeThread = new Thread() {
        public void run() {
            while (true) {
                try {
                    String input = bufferedReader.readLine();
                    dout.writeUTF(input);
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    };
}