package ua.intita.qa.homework13;

import ua.intita.qa.homework13.exceptions.*;

import java.util.Scanner;

public class UserCreator {

    private User user;
    private String name;
    private String surname;
    private double age;
    private String email;
    private String password;

    User create() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            boolean isCreated = false;
            System.out.println("Enter name: ");
            //scanner.next();
            if (scanner.hasNextLine()) {
                name = scanner.nextLine();
            }
            System.out.println("Enter surname: ");
            //scanner.next();
            if (scanner.hasNextLine()) {
                surname = scanner.nextLine();
            }
            System.out.println("Enter age: ");
            if (scanner.hasNextLine()) {
                age = Double.parseDouble(scanner.nextLine());
            }
            System.out.println("Enter email: ");
            //scanner.next();
            if (scanner.hasNextLine()) {
                email = scanner.nextLine();
            }
            System.out.println("Enter password: ");
            //scanner.next();
            if (scanner.hasNextLine()) {
                password = scanner.nextLine();
            }

            if (!name.isEmpty() && !surname.isEmpty() && age != 0 && !email.isEmpty() && !password.isEmpty()) {
                try {
                    user = new User(name, surname, age, email, password);
                    isCreated = true;
                } catch (UserCreateException e) {
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }
            }
            if (isCreated) {
                System.out.println("Congrats, you have created the new user:");
                System.out.println(user);
                break;
            } else {
                System.out.println();
                System.out.println("Input error, try again");
                System.out.println();
            }
        }
        return user;
    }

}
