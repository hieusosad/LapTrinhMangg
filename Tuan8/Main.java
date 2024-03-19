package Tuan8;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        //Tao doi tuong student
        Student student = new Student("Nguyen Ngoc Hai", 24);
        //Tuan tu hoa doi tuong va ghi vao file
        try {
            FileOutputStream fileOut = 
                    new FileOutputStream("student.txt");
            ObjectOutputStream out =
                    new ObjectOutputStream(fileOut);
            out.writeObject(student);
            out.close();
            fileOut.close();
            System.out.println("Da tuan tu hoa va ghi file");
        } catch (Exception e) {
            e.printStackTrace();
        }
        //Doc doi tuog tu file va giai tuan tu hoa
        try {
            FileInputStream fileIn = new FileInputStream("student.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Student stdFromFile = (Student)in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Da doc doi tuong tu file");
            System.out.println("Ten: " + stdFromFile.getName());
            System.out.println("Tuoi: " + stdFromFile.getAge());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
