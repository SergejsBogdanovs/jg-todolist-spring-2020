package lv.sbogdano.javaguru.todolist.repository;

import lv.sbogdano.javaguru.todolist.domain.Task;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class TaskInMemoryRepository implements TaskRepository {

    private final Map<Long, Task> repository = new HashMap<>();
    private long taskIdSequence = 0L;

    @Override
    public Task save(Task task) {
        task.setId(taskIdSequence++);
        repository.put(task.getId(), task);
        return task;
    }

    @Override
    public Optional<Task> findTaskById(Long id) {
        return Optional.ofNullable(repository.get(id));
    }
}
