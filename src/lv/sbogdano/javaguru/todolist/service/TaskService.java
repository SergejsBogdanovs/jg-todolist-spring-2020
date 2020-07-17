package lv.sbogdano.javaguru.todolist.service;

import lv.sbogdano.javaguru.todolist.domain.Task;
import lv.sbogdano.javaguru.todolist.repository.TaskInMemoryRepository;
import lv.sbogdano.javaguru.todolist.repository.TaskRepository;
import lv.sbogdano.javaguru.todolist.service.validation.exception.TaskNotFoundException;
import lv.sbogdano.javaguru.todolist.service.validation.TaskValidationService;

import java.util.Optional;

public class TaskService {

    private TaskRepository taskRepository = new TaskInMemoryRepository();
    private TaskValidationService validationService = new TaskValidationService();

    public Task save(Task task) {
        validationService.validate(task);
        return taskRepository.save(task);
    }

    public Task findTaskById(Long id) {
        return taskRepository.findTaskById(id)
                .orElseThrow(() -> new TaskNotFoundException("Task not found. Id: " + id));
    }
}
