package ua.intita.qa.homework13.exceptions;

public class InvalidEmailException extends UserCreateException{
    public InvalidEmailException(String message) {
        super(message);
    }
}
