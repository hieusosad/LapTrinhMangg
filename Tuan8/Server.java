package Tuan8;
import java.io.*;
import java.net.*;
public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Server is running...");
            
            while (true) {                
                Socket socket = serverSocket.accept();
                ObjectOutputStream oos =
                        new ObjectOutputStream(socket.getOutputStream());
                //TAO DOI TUONG
                Student student = new Student("Dang Bich Thuy", 23);
                //Ghi đối tượng vào outPutStream để truyền qua mang
                oos.writeObject(student);
                oos.close();
                socket.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
