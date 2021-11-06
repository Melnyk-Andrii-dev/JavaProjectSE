package ua.intita.qa.homework13;

import ua.intita.qa.homework13.exceptions.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    private String name;
    private String surname;
    private double age;
    private String email;
    private String password;

    public User(String name, String surname, double age, String email, String password) {
        this.name = checkName(name);
        this.surname = checkSurname(surname);
        this.age = checkAge(age);
        this.email = checkEmail(email);
        this.password = checkPassword(password);
    }

    public User() {
    }

    public String checkName(String name) {
        if (name.matches("^([A-Z])([a-z])+")) {
            return name;
        } else {
            throw new InvalidNameException("Name is not correct");
        }
    }

    public String checkSurname(String surname) {
        if (surname.matches("^([A-Z])([a-z])+")) {
            return surname;
        } else {
            throw new InvalidSurnameException("Surname is not correct");
        }
    }

    public double checkAge(double age) {
        if (age <= 0 || age > 150) {
            throw new InvalidAgeException("Age is not correct");
        }
        return age;
    }

    public String checkEmail(String email) {
        if (email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            return email;
        } else {
            throw new InvalidEmailException("Email is not correct");
        }

    }

    public String checkPassword(String password) {
        if (password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{10,}")) {
            return password;
        } else {
            throw new InvalidPasswordException("Password is not correct");
        }

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
