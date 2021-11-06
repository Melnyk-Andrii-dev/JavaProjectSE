package ua.intita.qa.homework13.exceptions;

public class InvalidPasswordException extends UserCreateException{
    public InvalidPasswordException(String message) {
        super(message);
    }
}
