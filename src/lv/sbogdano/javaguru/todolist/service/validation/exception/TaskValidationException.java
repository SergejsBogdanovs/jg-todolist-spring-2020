package lv.sbogdano.javaguru.todolist.service.validation.exception;

public class TaskValidationException extends RuntimeException {

    public TaskValidationException(String message) {
        super(message);
    }
}
