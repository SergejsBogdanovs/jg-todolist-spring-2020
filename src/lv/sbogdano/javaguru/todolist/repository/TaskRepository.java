package lv.sbogdano.javaguru.todolist.repository;

import lv.sbogdano.javaguru.todolist.domain.Task;

import java.util.Optional;

public interface TaskRepository {

    Task save(Task task);

    Optional<Task> findTaskById(Long id);
}
