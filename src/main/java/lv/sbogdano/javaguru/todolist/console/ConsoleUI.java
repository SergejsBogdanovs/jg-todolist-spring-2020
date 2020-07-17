package lv.sbogdano.javaguru.todolist.console;

import lv.sbogdano.javaguru.todolist.domain.Task;
import lv.sbogdano.javaguru.todolist.service.TaskService;
import lv.sbogdano.javaguru.todolist.service.validation.exception.TaskNotFoundException;
import lv.sbogdano.javaguru.todolist.service.validation.exception.TaskValidationException;

import java.util.Scanner;

public class ConsoleUI {

    private TaskService taskService = new TaskService();

    public void start() {

        var scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("1. Create task.");
                System.out.println("2. Find task by id.");
                System.out.println("3. Exit.");

                int userInput = Integer.valueOf(scanner.nextLine());

                switch (userInput) {
                    case 1:
                        System.out.println("Enter task name: ");
                        String name = scanner.nextLine();
                        System.out.println("Enter task description: ");
                        String description = scanner.nextLine();

                        var task = new Task();
                        task.setName(name);
                        task.setDescription(description);
                        Task createdTask = taskService.save(task);
                        System.out.println("Task successfully created. Created task id: " + createdTask);
                        break;

                    case 2:
                        System.out.println("Enter task id: ");
                        Long id = Long.valueOf(scanner.nextLine());
                        Task task1 = taskService.findTaskById(id);
                        System.out.println("Task found: " + task1);
                        break;

                    case 3:
                        return;
                }
            } catch (TaskValidationException | TaskNotFoundException taskValidationException) {
                System.out.println(taskValidationException.getMessage());
            } catch (Exception e) {
                System.out.println("Error! Please try again.");
            }
        }

    }

}


