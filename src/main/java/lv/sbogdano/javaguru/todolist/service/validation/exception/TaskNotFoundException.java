package lv.sbogdano.javaguru.todolist.service.validation.exception;

public class TaskNotFoundException extends RuntimeException {

    public TaskNotFoundException(String message) {
        super(message);
    }
}
