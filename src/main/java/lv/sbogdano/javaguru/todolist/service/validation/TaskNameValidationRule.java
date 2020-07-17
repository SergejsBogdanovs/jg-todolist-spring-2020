package lv.sbogdano.javaguru.todolist.service.validation;

import lv.sbogdano.javaguru.todolist.domain.Task;
import lv.sbogdano.javaguru.todolist.service.validation.exception.TaskValidationException;

class TaskNameValidationRule implements TaskValidationRule {

    @Override
    public void validate(Task task) {
        if (task.getName() == null) {
            throw new TaskValidationException("Task name must not be null.");
        }
    }
}
