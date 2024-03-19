package Tuan8;
import java.io.*;
import java.net.*;
        
public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost",12345);
            ObjectInputStream ois =
                    new ObjectInputStream(socket.getInputStream());
            //Đọc đối tượng từ InputStream
            Student student = (Student) ois.readObject();
            System.out.println("Da nhan doi tuong: " + 
                    student.getName() +  "-" + student.getAge());
            ois.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
