import java.io.*;
public class file13 {
    public static void main(String[] args) throws IOException {
        String path = "D:\\data.dat";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());
        try {
            System.out.println(ois.readObject());
            System.out.println(ois.readObject());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        ois.close();
    }
}
