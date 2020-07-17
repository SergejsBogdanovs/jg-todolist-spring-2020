package lv.sbogdano.javaguru.todolist.service.validation;

import lv.sbogdano.javaguru.todolist.domain.Task;

import java.util.HashSet;
import java.util.Set;

public class TaskValidationService {

    private Set<TaskValidationRule> validationRules = new HashSet<>();

    public TaskValidationService() {
        validationRules.add(new TaskNameValidationRule());
        validationRules.add(new TaskDescriptionValidationRule());
    }

    public void validate(Task task) {
        validationRules.forEach(rule -> rule.validate(task));
    }
}
