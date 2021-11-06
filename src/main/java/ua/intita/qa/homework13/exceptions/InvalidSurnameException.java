package ua.intita.qa.homework13.exceptions;

public class InvalidSurnameException extends UserCreateException{
    public InvalidSurnameException(String message) {
        super(message);
    }
}
