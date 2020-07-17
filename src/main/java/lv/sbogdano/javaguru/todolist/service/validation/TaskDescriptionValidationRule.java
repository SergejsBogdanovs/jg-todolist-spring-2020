package lv.sbogdano.javaguru.todolist.service.validation;

import lv.sbogdano.javaguru.todolist.domain.Task;
import lv.sbogdano.javaguru.todolist.service.validation.exception.TaskValidationException;

class TaskDescriptionValidationRule implements TaskValidationRule {

    @Override
    public void validate(Task task) {
        if (task.getDescription() == null || task.getDescription().isEmpty()) {
            throw new TaskValidationException("Task description must not be null.");
        }

    }
}
