package lv.sbogdano.javaguru.todolist.service.validation;

import lv.sbogdano.javaguru.todolist.domain.Task;

public interface TaskValidationRule {

    void validate(Task task);
}
