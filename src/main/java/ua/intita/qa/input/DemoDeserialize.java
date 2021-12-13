package ua.intita.qa.input;

import java.io.*;
import java.util.List;

public class DemoDeserialize {
    public static void main(String[] args) {
//        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data/serial.dat"))) {
//            Device device1 = (Device) ois.readObject();
//            System.out.println(device1);
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data/demo.dat"))) {
            List<Device> list1 = (List<Device>) ois.readObject();
            System.out.println(list1);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
